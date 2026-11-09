package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import c8.kb;
import i5.r;
import i5.t;
import i5.u;
import i5.v;
import i5.w;
import i5.x;
import i5.y;
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
import org.telegram.messenger.g0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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

    public static long gcd(long j3, long j10) {
        return j10 == 0 ? j3 : gcd(j10, j3 % j10);
    }

    public int addTrack(MediaFormat mediaFormat, boolean z9) {
        return this.currentMp4Movie.addTrack(mediaFormat, z9);
    }

    public void createCtts(Track track, i5.p pVar) {
        int[] sampleCompositions = track.getSampleCompositions();
        if (sampleCompositions == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        i5.d dVar = null;
        for (int i7 : sampleCompositions) {
            if (dVar == null || dVar.b != i7) {
                dVar = new i5.d(1, i7);
                arrayList.add(dVar);
            } else {
                dVar.a++;
            }
        }
        i5.e eVar = new i5.e("ctts");
        eVar.e = Collections.EMPTY_LIST;
        com.google.android.recaptcha.internal.a.t(ze.a.c(i5.e.f, eVar, eVar, arrayList));
        eVar.e = arrayList;
        pVar.a(eVar);
    }

    public i5.i createFileTypeBox(boolean z9) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("isom");
        linkedList.add("iso2");
        linkedList.add(z9 ? "hvc1" : "avc1");
        linkedList.add("mp41");
        i5.i iVar = new i5.i("ftyp");
        List list = Collections.EMPTY_LIST;
        iVar.a = "isom";
        iVar.b = 512L;
        iVar.c = linkedList;
        return iVar;
    }

    public MP4Builder createMovie(Mp4Movie mp4Movie, boolean z9, boolean z10) {
        this.currentMp4Movie = mp4Movie;
        FileOutputStream fileOutputStream = new FileOutputStream(mp4Movie.getCacheFile());
        this.fos = fileOutputStream;
        this.fc = fileOutputStream.getChannel();
        i5.i createFileTypeBox = createFileTypeBox(z10);
        createFileTypeBox.getBox(this.fc);
        long size = createFileTypeBox.getSize() + this.dataOffset;
        this.dataOffset = size;
        this.wroteSinceLastMdat += size;
        this.splitMdat = z9;
        this.mdat = new InterleaveChunkMdat();
        this.sizeBuffer = ByteBuffer.allocateDirect(4);
        return this;
    }

    public i5.l createMovieBox(Mp4Movie mp4Movie) {
        i5.l lVar = new i5.l("moov");
        i5.m mVar = new i5.m("mvhd");
        mVar.r = 1.0d;
        mVar.s = 1.0f;
        pc.d dVar = pc.d.j;
        mVar.w = dVar;
        Date date = new Date();
        com.google.android.recaptcha.internal.a.t(ze.a.c(i5.m.Q, mVar, mVar, date));
        mVar.e = date;
        long j3 = 4294967296L;
        if (kb.a(date) >= 4294967296L) {
            mVar.h();
        }
        Date date2 = new Date();
        com.google.android.recaptcha.internal.a.t(ze.a.c(i5.m.R, mVar, mVar, date2));
        mVar.f = date2;
        if (kb.a(date2) >= 4294967296L) {
            mVar.h();
        }
        com.google.android.recaptcha.internal.a.t(ze.a.c(i5.m.U, mVar, mVar, dVar));
        mVar.w = dVar;
        long timescale = getTimescale(mp4Movie);
        ArrayList<Track> tracks = mp4Movie.getTracks();
        int size = tracks.size();
        int i7 = 0;
        long j10 = 0;
        int i10 = 0;
        while (i10 < size) {
            Track track = tracks.get(i10);
            i10++;
            Track track2 = track;
            track2.prepare();
            long j11 = j3;
            long duration = (track2.getDuration() * timescale) / track2.getTimeScale();
            if (duration > j10) {
                j10 = duration;
            }
            j3 = j11;
        }
        long j12 = j3;
        com.google.android.recaptcha.internal.a.t(ze.a.c(i5.m.T, mVar, mVar, new Long(j10)));
        mVar.n = j10;
        if (j10 >= j12) {
            mVar.h();
        }
        com.google.android.recaptcha.internal.a.t(ze.a.c(i5.m.S, mVar, mVar, new Long(timescale)));
        mVar.h = timescale;
        long size2 = mp4Movie.getTracks().size() + 1;
        com.google.android.recaptcha.internal.a.t(ze.a.c(i5.m.V, mVar, mVar, new Long(size2)));
        mVar.x = size2;
        lVar.a(mVar);
        ArrayList<Track> tracks2 = mp4Movie.getTracks();
        int size3 = tracks2.size();
        while (i7 < size3) {
            Track track3 = tracks2.get(i7);
            i7++;
            lVar.a(createTrackBox(track3, mp4Movie));
        }
        return lVar;
    }

    public i5.b createStbl(Track track) {
        i5.p pVar = new i5.p("stbl");
        createStsd(track, pVar);
        createStts(track, pVar);
        createCtts(track, pVar);
        createStss(track, pVar);
        createStsc(track, pVar);
        createStsz(track, pVar);
        createStco(track, pVar);
        return pVar;
    }

    public void createStco(Track track, i5.p pVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Sample> samples = track.getSamples();
        int size = samples.size();
        long j3 = -1;
        int i7 = 0;
        while (i7 < size) {
            Sample sample = samples.get(i7);
            i7++;
            Sample sample2 = sample;
            long offset = sample2.getOffset();
            if (j3 != -1 && j3 != offset) {
                j3 = -1;
            }
            if (j3 == -1) {
                arrayList.add(Long.valueOf(offset));
            }
            j3 = sample2.getSize() + offset;
        }
        long[] jArr = new long[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            jArr[i10] = ((Long) arrayList.get(i10)).longValue();
        }
        t tVar = new t("stco");
        tVar.f = new long[0];
        com.google.android.recaptcha.internal.a.t(ze.a.c(t.n, tVar, tVar, jArr));
        tVar.f = jArr;
        pVar.a(tVar);
    }

    public void createStsc(Track track, i5.p pVar) {
        r rVar = new r("stsc");
        rVar.e = Collections.EMPTY_LIST;
        LinkedList linkedList = new LinkedList();
        com.google.android.recaptcha.internal.a.t(ze.a.c(r.h, rVar, rVar, linkedList));
        rVar.e = linkedList;
        int size = track.getSamples().size();
        int i7 = -1;
        int i10 = 1;
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Sample sample = track.getSamples().get(i12);
            long size2 = sample.getSize() + sample.getOffset();
            i11++;
            if (i12 == size - 1 || size2 != track.getSamples().get(i12 + 1).getOffset()) {
                if (i7 != i11) {
                    com.google.android.recaptcha.internal.a.t(ze.a.b(r.f, rVar, rVar));
                    rVar.e.add(new i5.q(i10, i11, 1L));
                    i7 = i11;
                }
                i10++;
                i11 = 0;
            }
        }
        pVar.a(rVar);
    }

    public void createStsd(Track track, i5.p pVar) {
        pVar.a(track.getSampleDescriptionBox());
    }

    public void createStss(Track track, i5.p pVar) {
        long[] syncSamples = track.getSyncSamples();
        if (syncSamples == null || syncSamples.length <= 0) {
            return;
        }
        u uVar = new u("stss");
        com.google.android.recaptcha.internal.a.t(ze.a.c(u.h, uVar, uVar, syncSamples));
        uVar.e = syncSamples;
        pVar.a(uVar);
    }

    public void createStsz(Track track, i5.p pVar) {
        i5.o oVar = new i5.o("stsz");
        oVar.f = new long[0];
        long[] jArr = this.track2SampleSizes.get(track);
        com.google.android.recaptcha.internal.a.t(ze.a.c(i5.o.s, oVar, oVar, jArr));
        oVar.f = jArr;
        pVar.a(oVar);
    }

    public void createStts(Track track, i5.p pVar) {
        ArrayList arrayList = new ArrayList();
        v vVar = null;
        for (long j3 : track.getSampleDurations()) {
            if (vVar == null || vVar.b != j3) {
                vVar = new v(1L, j3);
                arrayList.add(vVar);
            } else {
                vVar.a++;
            }
        }
        w wVar = new w("stts");
        wVar.e = Collections.EMPTY_LIST;
        com.google.android.recaptcha.internal.a.t(ze.a.c(w.f, wVar, wVar, arrayList));
        wVar.e = arrayList;
        pVar.a(wVar);
    }

    public x createTrackBox(Track track, Mp4Movie mp4Movie) {
        x xVar = new x("trak");
        y yVar = new y("tkhd");
        pc.d dVar = pc.d.j;
        yVar.x = dVar;
        ui.e c10 = ze.a.c(y.Z, yVar, yVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c10);
        yVar.g(yVar.d() | 1);
        ui.e c11 = ze.a.c(y.a0, yVar, yVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c11);
        yVar.g(yVar.d() | 2);
        ui.e c12 = ze.a.c(y.b0, yVar, yVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c12);
        yVar.g(yVar.d() | 4);
        if (track.isAudio()) {
            com.google.android.recaptcha.internal.a.t(ze.a.c(y.W, yVar, yVar, dVar));
            yVar.x = dVar;
        } else {
            pc.d matrix = mp4Movie.getMatrix();
            com.google.android.recaptcha.internal.a.t(ze.a.c(y.W, yVar, yVar, matrix));
            yVar.x = matrix;
        }
        com.google.android.recaptcha.internal.a.t(ze.a.c(y.U, yVar, yVar, new Integer(0)));
        yVar.s = 0;
        Date creationTime = track.getCreationTime();
        com.google.android.recaptcha.internal.a.t(ze.a.c(y.P, yVar, yVar, creationTime));
        yVar.e = creationTime;
        if (kb.a(creationTime) >= 4294967296L) {
            yVar.h();
        }
        long timescale = (getTimescale(mp4Movie) * track.getDuration()) / track.getTimeScale();
        com.google.android.recaptcha.internal.a.t(ze.a.c(y.S, yVar, yVar, new Long(timescale)));
        yVar.n = timescale;
        if (timescale >= 4294967296L) {
            yVar.g(1);
        }
        double height = track.getHeight();
        com.google.android.recaptcha.internal.a.t(ze.a.c(y.Y, yVar, yVar, new Double(height)));
        yVar.D = height;
        double width = track.getWidth();
        com.google.android.recaptcha.internal.a.t(ze.a.c(y.X, yVar, yVar, new Double(width)));
        yVar.y = width;
        com.google.android.recaptcha.internal.a.t(ze.a.c(y.T, yVar, yVar, new Integer(0)));
        yVar.r = 0;
        Date date = new Date();
        com.google.android.recaptcha.internal.a.t(ze.a.c(y.Q, yVar, yVar, date));
        yVar.f = date;
        if (kb.a(date) >= 4294967296L) {
            yVar.h();
        }
        long trackId = track.getTrackId() + 1;
        com.google.android.recaptcha.internal.a.t(ze.a.c(y.R, yVar, yVar, new Long(trackId)));
        yVar.h = trackId;
        float volume = track.getVolume();
        com.google.android.recaptcha.internal.a.t(ze.a.c(y.V, yVar, yVar, new Float(volume)));
        yVar.w = volume;
        xVar.a(yVar);
        i5.h hVar = new i5.h("mdia", 2);
        xVar.a(hVar);
        i5.k kVar = new i5.k("mdhd");
        kVar.e = new Date();
        kVar.f = new Date();
        kVar.r = "eng";
        Date creationTime2 = track.getCreationTime();
        com.google.android.recaptcha.internal.a.t(ze.a.c(i5.k.E, kVar, kVar, creationTime2));
        kVar.e = creationTime2;
        long duration = track.getDuration();
        com.google.android.recaptcha.internal.a.t(ze.a.c(i5.k.G, kVar, kVar, new Long(duration)));
        kVar.n = duration;
        long timeScale = track.getTimeScale();
        com.google.android.recaptcha.internal.a.t(ze.a.c(i5.k.F, kVar, kVar, new Long(timeScale)));
        kVar.h = timeScale;
        com.google.android.recaptcha.internal.a.t(ze.a.c(i5.k.H, kVar, kVar, "eng"));
        kVar.r = "eng";
        hVar.a(kVar);
        i5.j jVar = new i5.j("hdlr");
        jVar.f = null;
        jVar.s = true;
        String str = track.isAudio() ? "SoundHandle" : "VideoHandle";
        com.google.android.recaptcha.internal.a.t(ze.a.c(i5.j.y, jVar, jVar, str));
        jVar.f = str;
        String handler = track.getHandler();
        com.google.android.recaptcha.internal.a.t(ze.a.c(i5.j.D, jVar, jVar, handler));
        jVar.e = handler;
        hVar.a(jVar);
        i5.h hVar2 = new i5.h("minf", 3);
        hVar2.a(track.getMediaHeaderBox());
        i5.h hVar3 = new i5.h("dinf", 0);
        i5.h hVar4 = new i5.h("dref", 1);
        hVar3.a(hVar4);
        i5.g gVar = new i5.g("url ");
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
        int i7 = 0;
        while (i7 < size) {
            Track track = tracks.get(i7);
            i7++;
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

    public long getLastFrameTimestamp(int i7) {
        return this.currentMp4Movie.getLastFrameTimestamp(i7);
    }

    public long getTimescale(Mp4Movie mp4Movie) {
        long timeScale = !mp4Movie.getTracks().isEmpty() ? mp4Movie.getTracks().iterator().next().getTimeScale() : 0L;
        ArrayList<Track> tracks = mp4Movie.getTracks();
        int size = tracks.size();
        int i7 = 0;
        while (i7 < size) {
            Track track = tracks.get(i7);
            i7++;
            timeScale = gcd(track.getTimeScale(), timeScale);
        }
        return timeScale;
    }

    public void setAllowSyncFiles(boolean z9) {
        this.allowSyncFiles = z9;
    }

    public long writeSampleData(int i7, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, boolean z9) {
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
        long j3 = this.wroteSinceLastMdat + bufferInfo.size;
        this.wroteSinceLastMdat = j3;
        if (j3 >= 32768) {
            z10 = true;
            if (this.splitMdat) {
                flushCurrentMdat();
                this.writeNewMdat = true;
            }
            this.wroteSinceLastMdat = 0L;
        } else {
            z10 = false;
        }
        this.currentMp4Movie.addSample(i7, this.dataOffset, bufferInfo);
        if (z9) {
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
        g0.E(this.currentMp4Movie.getCacheFile(), file);
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
                int i7 = 0;
                while (i7 < size) {
                    Track track = tracks.get(i7);
                    i7++;
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
        } catch (Throwable th2) {
            try {
                randomAccessFile.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public void createSidx(Track track, i5.p pVar) {
    }

    /* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
    public static class InterleaveChunkMdat implements i5.b {
        private long contentSize;
        private long dataOffset;
        private i5.f parent;

        private InterleaveChunkMdat() {
            this.contentSize = 1073741824L;
            this.dataOffset = 0L;
        }

        private boolean isSmallBox(long j3) {
            return j3 + 8 < 4294967296L;
        }

        @Override // i5.b
        public void getBox(WritableByteChannel writableByteChannel) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            long size = getSize();
            if (isSmallBox(size)) {
                allocate.putInt((int) size);
            } else {
                allocate.putInt((int) 1);
            }
            allocate.put(h5.c.d("mdat"));
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

        @Override // i5.b
        public i5.f getParent() {
            return this.parent;
        }

        @Override // i5.b
        public long getSize() {
            return this.contentSize + 16;
        }

        @Override // i5.b
        public String getType() {
            return "mdat";
        }

        public void setContentSize(long j3) {
            this.contentSize = j3;
        }

        public void setDataOffset(long j3) {
            this.dataOffset = j3;
        }

        @Override // i5.b
        public void setParent(i5.f fVar) {
            this.parent = fVar;
        }

        public void parse(com.googlecode.mp4parser.f fVar, ByteBuffer byteBuffer, long j3, h5.a aVar) {
        }
    }
}
