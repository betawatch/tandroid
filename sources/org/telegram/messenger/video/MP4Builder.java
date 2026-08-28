package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import g7.v8;
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
import org.telegram.ui.Cells.j2;
import q2.t;
import q2.u;
import q2.v;
import q2.w;
import q2.x;
import q2.y;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public int addTrack(MediaFormat mediaFormat, boolean z10) {
        return this.currentMp4Movie.addTrack(mediaFormat, z10);
    }

    public void createCtts(Track track, q2.p pVar) {
        int[] sampleCompositions = track.getSampleCompositions();
        if (sampleCompositions == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        q2.d dVar = null;
        for (int i9 : sampleCompositions) {
            if (dVar == null || dVar.b != i9) {
                dVar = new q2.d(1, i9);
                arrayList.add(dVar);
            } else {
                dVar.a++;
            }
        }
        q2.e eVar = new q2.e("ctts");
        eVar.e = Collections.EMPTY_LIST;
        j2.t(zd.a.c(q2.e.f, eVar, eVar, arrayList));
        eVar.e = arrayList;
        pVar.a(eVar);
    }

    public q2.i createFileTypeBox(boolean z10) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("isom");
        linkedList.add("iso2");
        linkedList.add(z10 ? "hvc1" : "avc1");
        linkedList.add("mp41");
        q2.i iVar = new q2.i("ftyp");
        List list = Collections.EMPTY_LIST;
        iVar.a = "isom";
        iVar.b = 512L;
        iVar.c = linkedList;
        return iVar;
    }

    public MP4Builder createMovie(Mp4Movie mp4Movie, boolean z10, boolean z11) {
        this.currentMp4Movie = mp4Movie;
        FileOutputStream fileOutputStream = new FileOutputStream(mp4Movie.getCacheFile());
        this.fos = fileOutputStream;
        this.fc = fileOutputStream.getChannel();
        q2.i createFileTypeBox = createFileTypeBox(z11);
        createFileTypeBox.getBox(this.fc);
        long size = createFileTypeBox.getSize() + this.dataOffset;
        this.dataOffset = size;
        this.wroteSinceLastMdat += size;
        this.splitMdat = z10;
        this.mdat = new InterleaveChunkMdat();
        this.sizeBuffer = ByteBuffer.allocateDirect(4);
        return this;
    }

    public q2.l createMovieBox(Mp4Movie mp4Movie) {
        q2.l lVar = new q2.l("moov");
        q2.m mVar = new q2.m("mvhd");
        mVar.r = 1.0d;
        mVar.s = 1.0f;
        yb.d dVar = yb.d.j;
        mVar.v = dVar;
        Date date = new Date();
        j2.t(zd.a.c(q2.m.M, mVar, mVar, date));
        mVar.e = date;
        long j10 = 4294967296L;
        if (v8.a(date) >= 4294967296L) {
            mVar.h();
        }
        Date date2 = new Date();
        j2.t(zd.a.c(q2.m.N, mVar, mVar, date2));
        mVar.f = date2;
        if (v8.a(date2) >= 4294967296L) {
            mVar.h();
        }
        j2.t(zd.a.c(q2.m.Q, mVar, mVar, dVar));
        mVar.v = dVar;
        long timescale = getTimescale(mp4Movie);
        ArrayList<Track> tracks = mp4Movie.getTracks();
        int size = tracks.size();
        int i9 = 0;
        long j11 = 0;
        int i10 = 0;
        while (i10 < size) {
            Track track = tracks.get(i10);
            i10++;
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
        j2.t(zd.a.c(q2.m.P, mVar, mVar, new Long(j11)));
        mVar.n = j11;
        if (j11 >= j13) {
            mVar.h();
        }
        j2.t(zd.a.c(q2.m.O, mVar, mVar, new Long(timescale)));
        mVar.h = timescale;
        long size2 = mp4Movie.getTracks().size() + 1;
        j2.t(zd.a.c(q2.m.R, mVar, mVar, new Long(size2)));
        mVar.w = size2;
        lVar.a(mVar);
        ArrayList<Track> tracks2 = mp4Movie.getTracks();
        int size3 = tracks2.size();
        while (i9 < size3) {
            Track track3 = tracks2.get(i9);
            i9++;
            lVar.a(createTrackBox(track3, mp4Movie));
        }
        return lVar;
    }

    public q2.b createStbl(Track track) {
        q2.p pVar = new q2.p("stbl");
        createStsd(track, pVar);
        createStts(track, pVar);
        createCtts(track, pVar);
        createStss(track, pVar);
        createStsc(track, pVar);
        createStsz(track, pVar);
        createStco(track, pVar);
        return pVar;
    }

    public void createStco(Track track, q2.p pVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Sample> samples = track.getSamples();
        int size = samples.size();
        long j10 = -1;
        int i9 = 0;
        while (i9 < size) {
            Sample sample = samples.get(i9);
            i9++;
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
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            jArr[i10] = ((Long) arrayList.get(i10)).longValue();
        }
        t tVar = new t("stco");
        tVar.f = new long[0];
        j2.t(zd.a.c(t.n, tVar, tVar, jArr));
        tVar.f = jArr;
        pVar.a(tVar);
    }

    public void createStsc(Track track, q2.p pVar) {
        q2.r rVar = new q2.r("stsc");
        rVar.e = Collections.EMPTY_LIST;
        LinkedList linkedList = new LinkedList();
        j2.t(zd.a.c(q2.r.h, rVar, rVar, linkedList));
        rVar.e = linkedList;
        int size = track.getSamples().size();
        int i9 = -1;
        int i10 = 0;
        int i11 = 1;
        for (int i12 = 0; i12 < size; i12++) {
            Sample sample = track.getSamples().get(i12);
            long size2 = sample.getSize() + sample.getOffset();
            i10++;
            if (i12 == size - 1 || size2 != track.getSamples().get(i12 + 1).getOffset()) {
                if (i9 != i10) {
                    j2.t(zd.a.b(q2.r.f, rVar, rVar));
                    rVar.e.add(new q2.q(i11, i10, 1L));
                    i9 = i10;
                }
                i11++;
                i10 = 0;
            }
        }
        pVar.a(rVar);
    }

    public void createStsd(Track track, q2.p pVar) {
        pVar.a(track.getSampleDescriptionBox());
    }

    public void createStss(Track track, q2.p pVar) {
        long[] syncSamples = track.getSyncSamples();
        if (syncSamples == null || syncSamples.length <= 0) {
            return;
        }
        u uVar = new u("stss");
        j2.t(zd.a.c(u.h, uVar, uVar, syncSamples));
        uVar.e = syncSamples;
        pVar.a(uVar);
    }

    public void createStsz(Track track, q2.p pVar) {
        q2.o oVar = new q2.o("stsz");
        oVar.f = new long[0];
        long[] jArr = this.track2SampleSizes.get(track);
        j2.t(zd.a.c(q2.o.s, oVar, oVar, jArr));
        oVar.f = jArr;
        pVar.a(oVar);
    }

    public void createStts(Track track, q2.p pVar) {
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
        j2.t(zd.a.c(w.f, wVar, wVar, arrayList));
        wVar.e = arrayList;
        pVar.a(wVar);
    }

    public x createTrackBox(Track track, Mp4Movie mp4Movie) {
        x xVar = new x("trak");
        y yVar = new y("tkhd");
        yb.d dVar = yb.d.j;
        yVar.w = dVar;
        com.google.firebase.messaging.t c10 = zd.a.c(y.V, yVar, yVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c10);
        yVar.g(yVar.d() | 1);
        com.google.firebase.messaging.t c11 = zd.a.c(y.W, yVar, yVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c11);
        yVar.g(yVar.d() | 2);
        com.google.firebase.messaging.t c12 = zd.a.c(y.X, yVar, yVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c12);
        yVar.g(yVar.d() | 4);
        if (track.isAudio()) {
            j2.t(zd.a.c(y.S, yVar, yVar, dVar));
            yVar.w = dVar;
        } else {
            yb.d matrix = mp4Movie.getMatrix();
            j2.t(zd.a.c(y.S, yVar, yVar, matrix));
            yVar.w = matrix;
        }
        j2.t(zd.a.c(y.Q, yVar, yVar, new Integer(0)));
        yVar.s = 0;
        Date creationTime = track.getCreationTime();
        j2.t(zd.a.c(y.L, yVar, yVar, creationTime));
        yVar.e = creationTime;
        if (v8.a(creationTime) >= 4294967296L) {
            yVar.h();
        }
        long timescale = (getTimescale(mp4Movie) * track.getDuration()) / track.getTimeScale();
        j2.t(zd.a.c(y.O, yVar, yVar, new Long(timescale)));
        yVar.n = timescale;
        if (timescale >= 4294967296L) {
            yVar.g(1);
        }
        double height = track.getHeight();
        j2.t(zd.a.c(y.U, yVar, yVar, new Double(height)));
        yVar.y = height;
        double width = track.getWidth();
        j2.t(zd.a.c(y.T, yVar, yVar, new Double(width)));
        yVar.x = width;
        j2.t(zd.a.c(y.P, yVar, yVar, new Integer(0)));
        yVar.r = 0;
        Date date = new Date();
        j2.t(zd.a.c(y.M, yVar, yVar, date));
        yVar.f = date;
        if (v8.a(date) >= 4294967296L) {
            yVar.h();
        }
        long trackId = track.getTrackId() + 1;
        j2.t(zd.a.c(y.N, yVar, yVar, new Long(trackId)));
        yVar.h = trackId;
        float volume = track.getVolume();
        j2.t(zd.a.c(y.R, yVar, yVar, new Float(volume)));
        yVar.v = volume;
        xVar.a(yVar);
        q2.h hVar = new q2.h("mdia", 2);
        xVar.a(hVar);
        q2.k kVar = new q2.k("mdhd");
        kVar.e = new Date();
        kVar.f = new Date();
        kVar.r = "eng";
        Date creationTime2 = track.getCreationTime();
        j2.t(zd.a.c(q2.k.A, kVar, kVar, creationTime2));
        kVar.e = creationTime2;
        long duration = track.getDuration();
        j2.t(zd.a.c(q2.k.C, kVar, kVar, new Long(duration)));
        kVar.n = duration;
        long timeScale = track.getTimeScale();
        j2.t(zd.a.c(q2.k.B, kVar, kVar, new Long(timeScale)));
        kVar.h = timeScale;
        j2.t(zd.a.c(q2.k.D, kVar, kVar, "eng"));
        kVar.r = "eng";
        hVar.a(kVar);
        q2.j jVar = new q2.j("hdlr");
        jVar.f = null;
        jVar.s = true;
        String str = track.isAudio() ? "SoundHandle" : "VideoHandle";
        j2.t(zd.a.c(q2.j.x, jVar, jVar, str));
        jVar.f = str;
        String handler = track.getHandler();
        j2.t(zd.a.c(q2.j.y, jVar, jVar, handler));
        jVar.e = handler;
        hVar.a(jVar);
        q2.h hVar2 = new q2.h("minf", 3);
        hVar2.a(track.getMediaHeaderBox());
        q2.h hVar3 = new q2.h("dinf", 0);
        q2.h hVar4 = new q2.h("dref", 1);
        hVar3.a(hVar4);
        q2.g gVar = new q2.g("url ");
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
        int i9 = 0;
        while (i9 < size) {
            Track track = tracks.get(i9);
            i9++;
            Track track2 = track;
            ArrayList<Sample> samples = track2.getSamples();
            int size2 = samples.size();
            long[] jArr = new long[size2];
            for (int i10 = 0; i10 < size2; i10++) {
                jArr[i10] = samples.get(i10).getSize();
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

    public long getLastFrameTimestamp(int i9) {
        return this.currentMp4Movie.getLastFrameTimestamp(i9);
    }

    public long getTimescale(Mp4Movie mp4Movie) {
        long timeScale = !mp4Movie.getTracks().isEmpty() ? mp4Movie.getTracks().iterator().next().getTimeScale() : 0L;
        ArrayList<Track> tracks = mp4Movie.getTracks();
        int size = tracks.size();
        int i9 = 0;
        while (i9 < size) {
            Track track = tracks.get(i9);
            i9++;
            timeScale = gcd(track.getTimeScale(), timeScale);
        }
        return timeScale;
    }

    public void setAllowSyncFiles(boolean z10) {
        this.allowSyncFiles = z10;
    }

    public long writeSampleData(int i9, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, boolean z10) {
        boolean z11;
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
            z11 = true;
            if (this.splitMdat) {
                flushCurrentMdat();
                this.writeNewMdat = true;
            }
            this.wroteSinceLastMdat = 0L;
        } else {
            z11 = false;
        }
        this.currentMp4Movie.addSample(i9, this.dataOffset, bufferInfo);
        if (z10) {
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
        if (!z11) {
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
                int i9 = 0;
                while (i9 < size) {
                    Track track = tracks.get(i9);
                    i9++;
                    Track track2 = track;
                    ArrayList<Sample> samples = track2.getSamples();
                    int size2 = samples.size();
                    long[] jArr = new long[size2];
                    for (int i10 = 0; i10 < size2; i10++) {
                        jArr[i10] = samples.get(i10).getSize();
                    }
                    this.track2SampleSizes.put(track2, jArr);
                }
                createMovieBox(this.currentMp4Movie).getBox(channel);
                channel.close();
                randomAccessFile.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void createSidx(Track track, q2.p pVar) {
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class InterleaveChunkMdat implements q2.b {
        private long contentSize;
        private long dataOffset;
        private q2.f parent;

        private InterleaveChunkMdat() {
            this.contentSize = 1073741824L;
            this.dataOffset = 0L;
        }

        private boolean isSmallBox(long j10) {
            return j10 + 8 < 4294967296L;
        }

        @Override // q2.b
        public void getBox(WritableByteChannel writableByteChannel) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            long size = getSize();
            if (isSmallBox(size)) {
                allocate.putInt((int) size);
            } else {
                allocate.putInt((int) 1);
            }
            allocate.put(p2.c.d("mdat"));
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

        @Override // q2.b
        public q2.f getParent() {
            return this.parent;
        }

        @Override // q2.b
        public long getSize() {
            return this.contentSize + 16;
        }

        @Override // q2.b
        public String getType() {
            return "mdat";
        }

        public void setContentSize(long j10) {
            this.contentSize = j10;
        }

        public void setDataOffset(long j10) {
            this.dataOffset = j10;
        }

        @Override // q2.b
        public void setParent(q2.f fVar) {
            this.parent = fVar;
        }

        public void parse(com.googlecode.mp4parser.f fVar, ByteBuffer byteBuffer, long j10, p2.a aVar) {
        }
    }
}
