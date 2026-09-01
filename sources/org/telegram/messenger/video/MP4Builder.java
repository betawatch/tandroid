package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import j7.m5;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.yh;
import s2.t;
import s2.u;
import s2.v;
import s2.w;
import s2.x;
import s2.y;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class MP4Builder {
    private boolean splitMdat;
    private boolean wasFirstVideoFrame;
    private InterleaveChunkMdat mdat = null;
    private Mp4Movie currentMp4Movie = null;
    private FileOutputStream fos = null;
    private FileChannel fc = null;
    private long dataOffset = 0;
    private long wroteSinceLastMdat = 0;
    private boolean writeNewMdat = true;
    private HashMap<Track, long[]> track2SampleSizes = new HashMap<>();
    private ByteBuffer sizeBuffer = null;
    private boolean allowSyncFiles = true;

    private void flushCurrentMdat() {
        long position = this.fc.position();
        this.fc.position(this.mdat.getOffset());
        this.mdat.getBox(this.fc);
        this.fc.position(position);
        this.mdat.setDataOffset(0L);
        this.mdat.setContentSize(0L);
        this.fos.flush();
        if (this.allowSyncFiles) {
            this.fos.getFD().sync();
        }
    }

    public static long gcd(long j10, long j11) {
        return j11 == 0 ? j10 : gcd(j11, j10 % j11);
    }

    public int addTrack(MediaFormat mediaFormat, boolean z4) {
        return this.currentMp4Movie.addTrack(mediaFormat, z4);
    }

    public void createCtts(Track track, s2.p pVar) {
        int[] sampleCompositions = track.getSampleCompositions();
        if (sampleCompositions == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        s2.d dVar = null;
        for (int i10 : sampleCompositions) {
            if (dVar == null || dVar.b != i10) {
                dVar = new s2.d(1, i10);
                arrayList.add(dVar);
            } else {
                dVar.a++;
            }
        }
        s2.e eVar = new s2.e("ctts");
        eVar.e = Collections.EMPTY_LIST;
        yh.x(de.a.c(s2.e.f, eVar, eVar, arrayList));
        eVar.e = arrayList;
        pVar.a(eVar);
    }

    public s2.i createFileTypeBox(boolean z4) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("isom");
        linkedList.add("iso2");
        linkedList.add(z4 ? "hvc1" : "avc1");
        linkedList.add("mp41");
        s2.i iVar = new s2.i("ftyp");
        List list = Collections.EMPTY_LIST;
        iVar.a = "isom";
        iVar.b = 512L;
        iVar.c = linkedList;
        return iVar;
    }

    public MP4Builder createMovie(Mp4Movie mp4Movie, boolean z4, boolean z10) {
        this.currentMp4Movie = mp4Movie;
        FileOutputStream fileOutputStream = new FileOutputStream(mp4Movie.getCacheFile());
        this.fos = fileOutputStream;
        this.fc = fileOutputStream.getChannel();
        s2.i createFileTypeBox = createFileTypeBox(z10);
        createFileTypeBox.getBox(this.fc);
        long size = createFileTypeBox.getSize() + this.dataOffset;
        this.dataOffset = size;
        this.wroteSinceLastMdat += size;
        this.splitMdat = z4;
        this.mdat = new InterleaveChunkMdat();
        this.sizeBuffer = ByteBuffer.allocateDirect(4);
        return this;
    }

    public s2.l createMovieBox(Mp4Movie mp4Movie) {
        s2.l lVar = new s2.l("moov");
        s2.m mVar = new s2.m("mvhd");
        mVar.r = 1.0d;
        mVar.s = 1.0f;
        cc.d dVar = cc.d.j;
        mVar.v = dVar;
        Date date = new Date();
        yh.x(de.a.c(s2.m.N, mVar, mVar, date));
        mVar.e = date;
        long j10 = 4294967296L;
        if (m5.a(date) >= 4294967296L) {
            mVar.h();
        }
        Date date2 = new Date();
        yh.x(de.a.c(s2.m.O, mVar, mVar, date2));
        mVar.f = date2;
        if (m5.a(date2) >= 4294967296L) {
            mVar.h();
        }
        yh.x(de.a.c(s2.m.R, mVar, mVar, dVar));
        mVar.v = dVar;
        long timescale = getTimescale(mp4Movie);
        ArrayList<Track> tracks = mp4Movie.getTracks();
        int size = tracks.size();
        int i10 = 0;
        long j11 = 0;
        int i11 = 0;
        while (i11 < size) {
            Track track = tracks.get(i11);
            i11++;
            Track track2 = track;
            track2.prepare();
            long j12 = j10;
            long duration = (track2.getDuration() * timescale) / track2.getTimeScale();
            if (duration > j11) {
                j11 = duration;
            }
            j10 = j12;
        }
        long j13 = j10;
        yh.x(de.a.c(s2.m.Q, mVar, mVar, new Long(j11)));
        mVar.n = j11;
        if (j11 >= j13) {
            mVar.h();
        }
        yh.x(de.a.c(s2.m.P, mVar, mVar, new Long(timescale)));
        mVar.h = timescale;
        long size2 = mp4Movie.getTracks().size() + 1;
        yh.x(de.a.c(s2.m.S, mVar, mVar, new Long(size2)));
        mVar.w = size2;
        lVar.a(mVar);
        ArrayList<Track> tracks2 = mp4Movie.getTracks();
        int size3 = tracks2.size();
        while (i10 < size3) {
            Track track3 = tracks2.get(i10);
            i10++;
            lVar.a(createTrackBox(track3, mp4Movie));
        }
        return lVar;
    }

    public s2.b createStbl(Track track) {
        s2.p pVar = new s2.p("stbl");
        createStsd(track, pVar);
        createStts(track, pVar);
        createCtts(track, pVar);
        createStss(track, pVar);
        createStsc(track, pVar);
        createStsz(track, pVar);
        createStco(track, pVar);
        return pVar;
    }

    public void createStco(Track track, s2.p pVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Sample> samples = track.getSamples();
        int size = samples.size();
        long j10 = -1;
        int i10 = 0;
        while (i10 < size) {
            Sample sample = samples.get(i10);
            i10++;
            Sample sample2 = sample;
            long offset = sample2.getOffset();
            if (j10 != -1 && j10 != offset) {
                j10 = -1;
            }
            if (j10 == -1) {
                arrayList.add(Long.valueOf(offset));
            }
            j10 = sample2.getSize() + offset;
        }
        long[] jArr = new long[arrayList.size()];
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            jArr[i11] = ((Long) arrayList.get(i11)).longValue();
        }
        t tVar = new t("stco");
        tVar.f = new long[0];
        yh.x(de.a.c(t.n, tVar, tVar, jArr));
        tVar.f = jArr;
        pVar.a(tVar);
    }

    public void createStsc(Track track, s2.p pVar) {
        s2.r rVar = new s2.r("stsc");
        rVar.e = Collections.EMPTY_LIST;
        LinkedList linkedList = new LinkedList();
        yh.x(de.a.c(s2.r.h, rVar, rVar, linkedList));
        rVar.e = linkedList;
        int size = track.getSamples().size();
        int i10 = -1;
        int i11 = 0;
        int i12 = 1;
        for (int i13 = 0; i13 < size; i13++) {
            Sample sample = track.getSamples().get(i13);
            long size2 = sample.getSize() + sample.getOffset();
            i11++;
            if (i13 == size - 1 || size2 != track.getSamples().get(i13 + 1).getOffset()) {
                if (i10 != i11) {
                    yh.x(de.a.b(s2.r.f, rVar, rVar));
                    rVar.e.add(new s2.q(i12, i11, 1L));
                    i10 = i11;
                }
                i12++;
                i11 = 0;
            }
        }
        pVar.a(rVar);
    }

    public void createStsd(Track track, s2.p pVar) {
        pVar.a(track.getSampleDescriptionBox());
    }

    public void createStss(Track track, s2.p pVar) {
        long[] syncSamples = track.getSyncSamples();
        if (syncSamples == null || syncSamples.length <= 0) {
            return;
        }
        u uVar = new u("stss");
        yh.x(de.a.c(u.h, uVar, uVar, syncSamples));
        uVar.e = syncSamples;
        pVar.a(uVar);
    }

    public void createStsz(Track track, s2.p pVar) {
        s2.o oVar = new s2.o("stsz");
        oVar.f = new long[0];
        long[] jArr = this.track2SampleSizes.get(track);
        yh.x(de.a.c(s2.o.s, oVar, oVar, jArr));
        oVar.f = jArr;
        pVar.a(oVar);
    }

    public void createStts(Track track, s2.p pVar) {
        ArrayList arrayList = new ArrayList();
        v vVar = null;
        for (long j10 : track.getSampleDurations()) {
            if (vVar == null || vVar.b != j10) {
                vVar = new v(1L, j10);
                arrayList.add(vVar);
            } else {
                vVar.a++;
            }
        }
        w wVar = new w("stts");
        wVar.e = Collections.EMPTY_LIST;
        yh.x(de.a.c(w.f, wVar, wVar, arrayList));
        wVar.e = arrayList;
        pVar.a(wVar);
    }

    public x createTrackBox(Track track, Mp4Movie mp4Movie) {
        x xVar = new x("trak");
        y yVar = new y("tkhd");
        cc.d dVar = cc.d.j;
        yVar.w = dVar;
        sf.e c3 = de.a.c(y.W, yVar, yVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c3);
        yVar.g(yVar.d() | 1);
        sf.e c10 = de.a.c(y.X, yVar, yVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c10);
        yVar.g(yVar.d() | 2);
        sf.e c11 = de.a.c(y.Y, yVar, yVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c11);
        yVar.g(yVar.d() | 4);
        if (track.isAudio()) {
            yh.x(de.a.c(y.T, yVar, yVar, dVar));
            yVar.w = dVar;
        } else {
            cc.d matrix = mp4Movie.getMatrix();
            yh.x(de.a.c(y.T, yVar, yVar, matrix));
            yVar.w = matrix;
        }
        yh.x(de.a.c(y.R, yVar, yVar, new Integer(0)));
        yVar.s = 0;
        Date creationTime = track.getCreationTime();
        yh.x(de.a.c(y.M, yVar, yVar, creationTime));
        yVar.e = creationTime;
        if (m5.a(creationTime) >= 4294967296L) {
            yVar.h();
        }
        long timescale = (getTimescale(mp4Movie) * track.getDuration()) / track.getTimeScale();
        yh.x(de.a.c(y.P, yVar, yVar, new Long(timescale)));
        yVar.n = timescale;
        if (timescale >= 4294967296L) {
            yVar.g(1);
        }
        double height = track.getHeight();
        yh.x(de.a.c(y.V, yVar, yVar, new Double(height)));
        yVar.y = height;
        double width = track.getWidth();
        yh.x(de.a.c(y.U, yVar, yVar, new Double(width)));
        yVar.x = width;
        yh.x(de.a.c(y.Q, yVar, yVar, new Integer(0)));
        yVar.r = 0;
        Date date = new Date();
        yh.x(de.a.c(y.N, yVar, yVar, date));
        yVar.f = date;
        if (m5.a(date) >= 4294967296L) {
            yVar.h();
        }
        long trackId = track.getTrackId() + 1;
        yh.x(de.a.c(y.O, yVar, yVar, new Long(trackId)));
        yVar.h = trackId;
        float volume = track.getVolume();
        yh.x(de.a.c(y.S, yVar, yVar, new Float(volume)));
        yVar.v = volume;
        xVar.a(yVar);
        s2.h hVar = new s2.h("mdia", 2);
        xVar.a(hVar);
        s2.k kVar = new s2.k("mdhd");
        kVar.e = new Date();
        kVar.f = new Date();
        kVar.r = "eng";
        Date creationTime2 = track.getCreationTime();
        yh.x(de.a.c(s2.k.B, kVar, kVar, creationTime2));
        kVar.e = creationTime2;
        long duration = track.getDuration();
        yh.x(de.a.c(s2.k.D, kVar, kVar, new Long(duration)));
        kVar.n = duration;
        long timeScale = track.getTimeScale();
        yh.x(de.a.c(s2.k.C, kVar, kVar, new Long(timeScale)));
        kVar.h = timeScale;
        yh.x(de.a.c(s2.k.E, kVar, kVar, "eng"));
        kVar.r = "eng";
        hVar.a(kVar);
        s2.j jVar = new s2.j("hdlr");
        jVar.f = null;
        jVar.s = true;
        String str = track.isAudio() ? "SoundHandle" : "VideoHandle";
        yh.x(de.a.c(s2.j.x, jVar, jVar, str));
        jVar.f = str;
        String handler = track.getHandler();
        yh.x(de.a.c(s2.j.y, jVar, jVar, handler));
        jVar.e = handler;
        hVar.a(jVar);
        s2.h hVar2 = new s2.h("minf", 3);
        hVar2.a(track.getMediaHeaderBox());
        s2.h hVar3 = new s2.h("dinf", 0);
        s2.h hVar4 = new s2.h("dref", 1);
        hVar3.a(hVar4);
        s2.g gVar = new s2.g("url ");
        gVar.g(1);
        hVar4.a(gVar);
        hVar2.a(hVar3);
        hVar2.a(createStbl(track));
        hVar.a(hVar2);
        return xVar;
    }

    public void finishMovie() {
        if (this.mdat.getContentSize() != 0) {
            flushCurrentMdat();
        }
        ArrayList<Track> tracks = this.currentMp4Movie.getTracks();
        int size = tracks.size();
        int i10 = 0;
        while (i10 < size) {
            Track track = tracks.get(i10);
            i10++;
            Track track2 = track;
            ArrayList<Sample> samples = track2.getSamples();
            int size2 = samples.size();
            long[] jArr = new long[size2];
            for (int i11 = 0; i11 < size2; i11++) {
                jArr[i11] = samples.get(i11).getSize();
            }
            this.track2SampleSizes.put(track2, jArr);
        }
        createMovieBox(this.currentMp4Movie).getBox(this.fc);
        this.fos.flush();
        if (this.allowSyncFiles) {
            this.fos.getFD().sync();
        }
        this.fc.close();
        this.fos.close();
    }

    public long getLastFrameTimestamp(int i10) {
        return this.currentMp4Movie.getLastFrameTimestamp(i10);
    }

    public long getTimescale(Mp4Movie mp4Movie) {
        long timeScale = !mp4Movie.getTracks().isEmpty() ? mp4Movie.getTracks().iterator().next().getTimeScale() : 0L;
        ArrayList<Track> tracks = mp4Movie.getTracks();
        int size = tracks.size();
        int i10 = 0;
        while (i10 < size) {
            Track track = tracks.get(i10);
            i10++;
            timeScale = gcd(track.getTimeScale(), timeScale);
        }
        return timeScale;
    }

    public void setAllowSyncFiles(boolean z4) {
        this.allowSyncFiles = z4;
    }

    public long writeSampleData(int i10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, boolean z4) {
        boolean z10;
        if (this.writeNewMdat) {
            this.mdat.setContentSize(0L);
            this.mdat.getBox(this.fc);
            this.mdat.setDataOffset(this.dataOffset);
            this.dataOffset += 16;
            this.wroteSinceLastMdat += 16;
            this.writeNewMdat = false;
        }
        InterleaveChunkMdat interleaveChunkMdat = this.mdat;
        interleaveChunkMdat.setContentSize(interleaveChunkMdat.getContentSize() + bufferInfo.size);
        long j10 = this.wroteSinceLastMdat + bufferInfo.size;
        this.wroteSinceLastMdat = j10;
        if (j10 >= 32768) {
            z10 = true;
            if (this.splitMdat) {
                flushCurrentMdat();
                this.writeNewMdat = true;
            }
            this.wroteSinceLastMdat = 0L;
        } else {
            z10 = false;
        }
        this.currentMp4Movie.addSample(i10, this.dataOffset, bufferInfo);
        if (z4) {
            this.sizeBuffer.position(0);
            this.sizeBuffer.putInt(bufferInfo.size - 4);
            this.sizeBuffer.position(0);
            this.fc.write(this.sizeBuffer);
            byteBuffer.position(bufferInfo.offset + 4);
        } else {
            byteBuffer.position(bufferInfo.offset);
        }
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        this.fc.write(byteBuffer);
        this.dataOffset += bufferInfo.size;
        if (!z10) {
            return 0L;
        }
        this.fos.flush();
        if (this.allowSyncFiles) {
            this.fos.getFD().sync();
        }
        return this.fc.position();
    }

    public void finishMovie(File file) {
        if (file == null) {
            finishMovie();
            return;
        }
        this.fos.flush();
        long position = this.fc.position();
        if (this.allowSyncFiles) {
            this.fos.getFD().sync();
        }
        AndroidUtilities.copyFile(this.currentMp4Movie.getCacheFile(), file);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        try {
            FileChannel channel = randomAccessFile.getChannel();
            try {
                channel.position(position);
                if (this.mdat.getContentSize() != 0) {
                    channel.position(this.mdat.getOffset());
                    this.mdat.getBox(channel);
                    channel.position(position);
                }
                this.track2SampleSizes.clear();
                ArrayList<Track> tracks = this.currentMp4Movie.getTracks();
                int size = tracks.size();
                int i10 = 0;
                while (i10 < size) {
                    Track track = tracks.get(i10);
                    i10++;
                    Track track2 = track;
                    ArrayList<Sample> samples = track2.getSamples();
                    int size2 = samples.size();
                    long[] jArr = new long[size2];
                    for (int i11 = 0; i11 < size2; i11++) {
                        jArr[i11] = samples.get(i11).getSize();
                    }
                    this.track2SampleSizes.put(track2, jArr);
                }
                createMovieBox(this.currentMp4Movie).getBox(channel);
                channel.close();
                randomAccessFile.close();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                randomAccessFile.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public void createSidx(Track track, s2.p pVar) {
    }

    /* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
    public static class InterleaveChunkMdat implements s2.b {
        private long contentSize;
        private long dataOffset;
        private s2.f parent;

        private InterleaveChunkMdat() {
            this.contentSize = 1073741824L;
            this.dataOffset = 0L;
        }

        private boolean isSmallBox(long j10) {
            return j10 + 8 < 4294967296L;
        }

        @Override // s2.b
        public void getBox(WritableByteChannel writableByteChannel) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            long size = getSize();
            if (isSmallBox(size)) {
                allocate.putInt((int) size);
            } else {
                allocate.putInt((int) 1);
            }
            allocate.put(r2.c.d("mdat"));
            if (isSmallBox(size)) {
                allocate.put(new byte[8]);
            } else {
                allocate.putLong(size);
            }
            allocate.rewind();
            writableByteChannel.write(allocate);
        }

        public long getContentSize() {
            return this.contentSize;
        }

        public long getOffset() {
            return this.dataOffset;
        }

        @Override // s2.b
        public s2.f getParent() {
            return this.parent;
        }

        @Override // s2.b
        public long getSize() {
            return this.contentSize + 16;
        }

        @Override // s2.b
        public String getType() {
            return "mdat";
        }

        public void setContentSize(long j10) {
            this.contentSize = j10;
        }

        public void setDataOffset(long j10) {
            this.dataOffset = j10;
        }

        @Override // s2.b
        public void setParent(s2.f fVar) {
            this.parent = fVar;
        }

        public void parse(com.googlecode.mp4parser.f fVar, ByteBuffer byteBuffer, long j10, r2.a aVar) {
        }
    }
}
