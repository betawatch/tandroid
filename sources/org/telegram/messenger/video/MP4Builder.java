package org.telegram.messenger.video;

import ab.c0;
import android.media.MediaCodec;
import android.media.MediaFormat;
import c8.mb;
import i5.r;
import i5.s;
import i5.u;
import i5.v;
import i5.w;
import i5.x;
import i5.y;
import i5.z;
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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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

    public int addTrack(MediaFormat mediaFormat, boolean z10) {
        return this.currentMp4Movie.addTrack(mediaFormat, z10);
    }

    public void createCtts(Track track, i5.q qVar) {
        int[] sampleCompositions = track.getSampleCompositions();
        if (sampleCompositions == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        i5.e eVar = null;
        for (int i7 : sampleCompositions) {
            if (eVar == null || eVar.b != i7) {
                eVar = new i5.e(1, i7);
                arrayList.add(eVar);
            } else {
                eVar.a++;
            }
        }
        i5.f fVar = new i5.f("ctts");
        fVar.e = Collections.EMPTY_LIST;
        i5.c.u(ze.a.c(i5.f.f, fVar, fVar, arrayList));
        fVar.e = arrayList;
        qVar.a(fVar);
    }

    public i5.j createFileTypeBox(boolean z10) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("isom");
        linkedList.add("iso2");
        linkedList.add(z10 ? "hvc1" : "avc1");
        linkedList.add("mp41");
        i5.j jVar = new i5.j("ftyp");
        List list = Collections.EMPTY_LIST;
        jVar.a = "isom";
        jVar.b = 512L;
        jVar.c = linkedList;
        return jVar;
    }

    public MP4Builder createMovie(Mp4Movie mp4Movie, boolean z10, boolean z11) {
        this.currentMp4Movie = mp4Movie;
        FileOutputStream fileOutputStream = new FileOutputStream(mp4Movie.getCacheFile());
        this.fos = fileOutputStream;
        this.fc = fileOutputStream.getChannel();
        i5.j createFileTypeBox = createFileTypeBox(z11);
        createFileTypeBox.getBox(this.fc);
        long size = createFileTypeBox.getSize() + this.dataOffset;
        this.dataOffset = size;
        this.wroteSinceLastMdat += size;
        this.splitMdat = z10;
        this.mdat = new InterleaveChunkMdat();
        this.sizeBuffer = ByteBuffer.allocateDirect(4);
        return this;
    }

    public i5.m createMovieBox(Mp4Movie mp4Movie) {
        i5.m mVar = new i5.m("moov");
        i5.n nVar = new i5.n("mvhd");
        nVar.r = 1.0d;
        nVar.s = 1.0f;
        pc.d dVar = pc.d.j;
        nVar.w = dVar;
        Date date = new Date();
        i5.c.u(ze.a.c(i5.n.R, nVar, nVar, date));
        nVar.e = date;
        long j3 = 4294967296L;
        if (mb.a(date) >= 4294967296L) {
            nVar.h();
        }
        Date date2 = new Date();
        i5.c.u(ze.a.c(i5.n.S, nVar, nVar, date2));
        nVar.f = date2;
        if (mb.a(date2) >= 4294967296L) {
            nVar.h();
        }
        i5.c.u(ze.a.c(i5.n.V, nVar, nVar, dVar));
        nVar.w = dVar;
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
        i5.c.u(ze.a.c(i5.n.U, nVar, nVar, new Long(j10)));
        nVar.n = j10;
        if (j10 >= j12) {
            nVar.h();
        }
        i5.c.u(ze.a.c(i5.n.T, nVar, nVar, new Long(timescale)));
        nVar.h = timescale;
        long size2 = mp4Movie.getTracks().size() + 1;
        i5.c.u(ze.a.c(i5.n.W, nVar, nVar, new Long(size2)));
        nVar.x = size2;
        mVar.a(nVar);
        ArrayList<Track> tracks2 = mp4Movie.getTracks();
        int size3 = tracks2.size();
        while (i7 < size3) {
            Track track3 = tracks2.get(i7);
            i7++;
            mVar.a(createTrackBox(track3, mp4Movie));
        }
        return mVar;
    }

    public i5.b createStbl(Track track) {
        i5.q qVar = new i5.q("stbl");
        createStsd(track, qVar);
        createStts(track, qVar);
        createCtts(track, qVar);
        createStss(track, qVar);
        createStsc(track, qVar);
        createStsz(track, qVar);
        createStco(track, qVar);
        return qVar;
    }

    public void createStco(Track track, i5.q qVar) {
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
        u uVar = new u("stco");
        uVar.f = new long[0];
        i5.c.u(ze.a.c(u.n, uVar, uVar, jArr));
        uVar.f = jArr;
        qVar.a(uVar);
    }

    public void createStsc(Track track, i5.q qVar) {
        s sVar = new s("stsc");
        sVar.e = Collections.EMPTY_LIST;
        LinkedList linkedList = new LinkedList();
        i5.c.u(ze.a.c(s.h, sVar, sVar, linkedList));
        sVar.e = linkedList;
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
                    i5.c.u(ze.a.b(s.f, sVar, sVar));
                    sVar.e.add(new r(i10, i11, 1L));
                    i7 = i11;
                }
                i10++;
                i11 = 0;
            }
        }
        qVar.a(sVar);
    }

    public void createStsd(Track track, i5.q qVar) {
        qVar.a(track.getSampleDescriptionBox());
    }

    public void createStss(Track track, i5.q qVar) {
        long[] syncSamples = track.getSyncSamples();
        if (syncSamples == null || syncSamples.length <= 0) {
            return;
        }
        v vVar = new v("stss");
        i5.c.u(ze.a.c(v.h, vVar, vVar, syncSamples));
        vVar.e = syncSamples;
        qVar.a(vVar);
    }

    public void createStsz(Track track, i5.q qVar) {
        i5.p pVar = new i5.p("stsz");
        pVar.f = new long[0];
        long[] jArr = this.track2SampleSizes.get(track);
        i5.c.u(ze.a.c(i5.p.s, pVar, pVar, jArr));
        pVar.f = jArr;
        qVar.a(pVar);
    }

    public void createStts(Track track, i5.q qVar) {
        ArrayList arrayList = new ArrayList();
        w wVar = null;
        for (long j3 : track.getSampleDurations()) {
            if (wVar == null || wVar.b != j3) {
                wVar = new w(1L, j3);
                arrayList.add(wVar);
            } else {
                wVar.a++;
            }
        }
        x xVar = new x("stts");
        xVar.e = Collections.EMPTY_LIST;
        i5.c.u(ze.a.c(x.f, xVar, xVar, arrayList));
        xVar.e = arrayList;
        qVar.a(xVar);
    }

    public y createTrackBox(Track track, Mp4Movie mp4Movie) {
        y yVar = new y("trak");
        z zVar = new z("tkhd");
        pc.d dVar = pc.d.j;
        zVar.x = dVar;
        c0 c10 = ze.a.c(z.a0, zVar, zVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c10);
        zVar.g(zVar.d() | 1);
        c0 c11 = ze.a.c(z.b0, zVar, zVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c11);
        zVar.g(zVar.d() | 2);
        c0 c12 = ze.a.c(z.c0, zVar, zVar, new Boolean(true));
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c12);
        zVar.g(zVar.d() | 4);
        if (track.isAudio()) {
            i5.c.u(ze.a.c(z.X, zVar, zVar, dVar));
            zVar.x = dVar;
        } else {
            pc.d matrix = mp4Movie.getMatrix();
            i5.c.u(ze.a.c(z.X, zVar, zVar, matrix));
            zVar.x = matrix;
        }
        i5.c.u(ze.a.c(z.V, zVar, zVar, new Integer(0)));
        zVar.s = 0;
        Date creationTime = track.getCreationTime();
        i5.c.u(ze.a.c(z.Q, zVar, zVar, creationTime));
        zVar.e = creationTime;
        if (mb.a(creationTime) >= 4294967296L) {
            zVar.h();
        }
        long timescale = (getTimescale(mp4Movie) * track.getDuration()) / track.getTimeScale();
        i5.c.u(ze.a.c(z.T, zVar, zVar, new Long(timescale)));
        zVar.n = timescale;
        if (timescale >= 4294967296L) {
            zVar.g(1);
        }
        double height = track.getHeight();
        i5.c.u(ze.a.c(z.Z, zVar, zVar, new Double(height)));
        zVar.E = height;
        double width = track.getWidth();
        i5.c.u(ze.a.c(z.Y, zVar, zVar, new Double(width)));
        zVar.y = width;
        i5.c.u(ze.a.c(z.U, zVar, zVar, new Integer(0)));
        zVar.r = 0;
        Date date = new Date();
        i5.c.u(ze.a.c(z.R, zVar, zVar, date));
        zVar.f = date;
        if (mb.a(date) >= 4294967296L) {
            zVar.h();
        }
        long trackId = track.getTrackId() + 1;
        i5.c.u(ze.a.c(z.S, zVar, zVar, new Long(trackId)));
        zVar.h = trackId;
        float volume = track.getVolume();
        i5.c.u(ze.a.c(z.W, zVar, zVar, new Float(volume)));
        zVar.w = volume;
        yVar.a(zVar);
        i5.i iVar = new i5.i("mdia", 2);
        yVar.a(iVar);
        i5.l lVar = new i5.l("mdhd");
        lVar.e = new Date();
        lVar.f = new Date();
        lVar.r = "eng";
        Date creationTime2 = track.getCreationTime();
        i5.c.u(ze.a.c(i5.l.F, lVar, lVar, creationTime2));
        lVar.e = creationTime2;
        long duration = track.getDuration();
        i5.c.u(ze.a.c(i5.l.H, lVar, lVar, new Long(duration)));
        lVar.n = duration;
        long timeScale = track.getTimeScale();
        i5.c.u(ze.a.c(i5.l.G, lVar, lVar, new Long(timeScale)));
        lVar.h = timeScale;
        i5.c.u(ze.a.c(i5.l.I, lVar, lVar, "eng"));
        lVar.r = "eng";
        iVar.a(lVar);
        i5.k kVar = new i5.k("hdlr");
        kVar.f = null;
        kVar.s = true;
        String str = track.isAudio() ? "SoundHandle" : "VideoHandle";
        i5.c.u(ze.a.c(i5.k.y, kVar, kVar, str));
        kVar.f = str;
        String handler = track.getHandler();
        i5.c.u(ze.a.c(i5.k.E, kVar, kVar, handler));
        kVar.e = handler;
        iVar.a(kVar);
        i5.i iVar2 = new i5.i("minf", 3);
        iVar2.a(track.getMediaHeaderBox());
        i5.i iVar3 = new i5.i("dinf", 0);
        i5.i iVar4 = new i5.i("dref", 1);
        iVar3.a(iVar4);
        i5.h hVar = new i5.h("url ");
        hVar.g(1);
        iVar4.a(hVar);
        iVar2.a(iVar3);
        iVar2.a(createStbl(track));
        iVar.a(iVar2);
        return yVar;
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

    public void setAllowSyncFiles(boolean z10) {
        this.allowSyncFiles = z10;
    }

    public long writeSampleData(int i7, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, boolean z10) {
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
        long j3 = this.wroteSinceLastMdat + bufferInfo.size;
        this.wroteSinceLastMdat = j3;
        if (j3 >= 32768) {
            z11 = true;
            if (this.splitMdat) {
                flushCurrentMdat();
                this.writeNewMdat = true;
            }
            this.wroteSinceLastMdat = 0L;
        } else {
            z11 = false;
        }
        this.currentMp4Movie.addSample(i7, this.dataOffset, bufferInfo);
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

    public void createSidx(Track track, i5.q qVar) {
    }

    /* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
    public static class InterleaveChunkMdat implements i5.b {
        private long contentSize;
        private long dataOffset;
        private i5.g parent;

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
        public i5.g getParent() {
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
        public void setParent(i5.g gVar) {
            this.parent = gVar;
        }

        public void parse(com.googlecode.mp4parser.f fVar, ByteBuffer byteBuffer, long j3, h5.a aVar) {
        }
    }
}
