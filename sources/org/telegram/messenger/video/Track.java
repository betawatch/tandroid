package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Cells.j2;
import q2.s;
import q2.z;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class Track {
    private static Map<Integer, Integer> samplingFrequencyIndexMap;
    private String handler;
    private q2.a headerBox;
    private int height;
    private boolean isAudio;
    private int[] sampleCompositions;
    private q2.n sampleDescriptionBox;
    private long[] sampleDurations;
    private LinkedList<Integer> syncSamples;
    private int timeScale;
    private long trackId;
    private float volume;
    private int width;
    private ArrayList<Sample> samples = new ArrayList<>();
    private long duration = 0;
    private Date creationTime = new Date();
    private ArrayList<SamplePresentationTime> samplePresentationTimes = new ArrayList<>();
    private boolean first = true;

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class SamplePresentationTime {
        private long dt;
        private int index;
        private long presentationTime;

        public SamplePresentationTime(int i9, long j10) {
            this.index = i9;
            this.presentationTime = j10;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        samplingFrequencyIndexMap = hashMap;
        hashMap.put(96000, 0);
        samplingFrequencyIndexMap.put(88200, 1);
        samplingFrequencyIndexMap.put(64000, 2);
        samplingFrequencyIndexMap.put(48000, 3);
        samplingFrequencyIndexMap.put(44100, 4);
        samplingFrequencyIndexMap.put(32000, 5);
        samplingFrequencyIndexMap.put(24000, 6);
        samplingFrequencyIndexMap.put(22050, 7);
        samplingFrequencyIndexMap.put(Integer.valueOf(androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE), 8);
        samplingFrequencyIndexMap.put(12000, 9);
        samplingFrequencyIndexMap.put(11025, 10);
        samplingFrequencyIndexMap.put(8000, 11);
    }

    public Track(int i9, MediaFormat mediaFormat, boolean z10) {
        int i10;
        int i11;
        this.syncSamples = null;
        this.volume = 0.0f;
        this.trackId = i9;
        this.isAudio = z10;
        int i12 = 0;
        if (z10) {
            this.volume = 1.0f;
            this.timeScale = mediaFormat.getInteger("sample-rate");
            this.handler = "soun";
            this.headerBox = new s("smhd");
            this.sampleDescriptionBox = new q2.n();
            r2.b bVar = new r2.b("mp4a");
            bVar.h = mediaFormat.getInteger("channel-count");
            bVar.r = mediaFormat.getInteger("sample-rate");
            bVar.f = 1;
            bVar.n = 16;
            tb.b bVar2 = new tb.b("esds");
            ub.g gVar = new ub.g();
            gVar.i = 0;
            gVar.o = new ArrayList();
            gVar.d = 0;
            ub.m mVar = new ub.m();
            mVar.d = 2;
            gVar.n = mVar;
            String string = mediaFormat.containsKey("mime") ? mediaFormat.getString("mime") : "audio/mp4-latm";
            ub.d dVar = new ub.d();
            dVar.k = new ArrayList();
            if ("audio/mpeg".equals(string)) {
                dVar.d = 105;
            } else {
                dVar.d = 64;
            }
            dVar.e = 5;
            dVar.g = 1536;
            if (mediaFormat.containsKey("max-bitrate")) {
                i10 = 13;
                dVar.h = mediaFormat.getInteger("max-bitrate");
            } else {
                i10 = 13;
                dVar.h = 96000L;
            }
            dVar.i = this.timeScale;
            ub.a aVar = new ub.a();
            aVar.e = 2;
            aVar.f = samplingFrequencyIndexMap.get(Integer.valueOf((int) bVar.r)).intValue();
            aVar.h = bVar.h;
            dVar.j = aVar;
            gVar.m = dVar;
            ByteBuffer allocate = ByteBuffer.allocate(gVar.c());
            p2.b.r(3, allocate);
            allocate.put((byte) ((gVar.c() - 2) & 255));
            p2.b.p(gVar.d, allocate);
            allocate.put((byte) (((gVar.e << 7) | (gVar.f << 6) | (gVar.g << 5) | (31 & gVar.h)) & 255));
            if (gVar.e > 0) {
                p2.b.p(gVar.k, allocate);
            }
            if (gVar.f > 0) {
                allocate.put((byte) (gVar.i & 255));
                allocate.put(p2.b.b(gVar.j));
                allocate.put((byte) 0);
            }
            if (gVar.g > 0) {
                p2.b.p(gVar.l, allocate);
            }
            ub.d dVar2 = gVar.m;
            ub.a aVar2 = dVar2.j;
            if (aVar2 == null) {
                i11 = 0;
            } else {
                if (aVar2.e != 2) {
                    throw new UnsupportedOperationException("can't serialize that yet");
                }
                i11 = 4;
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(i11 + 15);
            p2.b.r(4, allocate2);
            ub.a aVar3 = dVar2.j;
            if (aVar3 != null) {
                if (aVar3.e != 2) {
                    throw new UnsupportedOperationException("can't serialize that yet");
                }
                i12 = 4;
            }
            allocate2.put((byte) ((i12 + i10) & 255));
            allocate2.put((byte) (dVar2.d & 255));
            allocate2.put((byte) (((dVar2.e << 2) | (dVar2.f << 1) | 1) & 255));
            p2.b.q(dVar2.g, allocate2);
            allocate2.putInt((int) dVar2.h);
            allocate2.putInt((int) dVar2.i);
            ub.a aVar4 = dVar2.j;
            if (aVar4 != null) {
                if (aVar4.e != 2) {
                    throw new UnsupportedOperationException("can't serialize that yet");
                }
                ByteBuffer allocate3 = ByteBuffer.allocate(4);
                p2.b.r(5, allocate3);
                if (aVar4.e != 2) {
                    throw new UnsupportedOperationException("can't serialize that yet");
                }
                allocate3.put((byte) 2);
                ub.c cVar = new ub.c(1, allocate3);
                cVar.c(aVar4.e, 5);
                cVar.c(aVar4.f, 4);
                if (aVar4.f == 15) {
                    throw new UnsupportedOperationException("can't serialize that yet");
                }
                cVar.c(aVar4.h, 4);
                allocate2.put(allocate3.array());
            }
            ub.m mVar2 = gVar.n;
            mVar2.getClass();
            ByteBuffer allocate4 = ByteBuffer.allocate(3);
            p2.b.r(6, allocate4);
            allocate4.put((byte) 1);
            allocate4.put((byte) (mVar2.d & 255));
            allocate.put(allocate2.array());
            allocate.put(allocate4.array());
            j2.t(zd.a.c(tb.a.h, bVar2, bVar2, allocate));
            bVar2.e = allocate;
            bVar.a(bVar2);
            this.sampleDescriptionBox.a(bVar);
            return;
        }
        this.width = mediaFormat.getInteger("width");
        this.height = mediaFormat.getInteger("height");
        this.timeScale = 90000;
        this.syncSamples = new LinkedList<>();
        this.handler = "vide";
        z zVar = new z("vmhd");
        zVar.e = 0;
        zVar.f = new int[3];
        zVar.g(1);
        this.headerBox = zVar;
        this.sampleDescriptionBox = new q2.n();
        String string2 = mediaFormat.getString("mime");
        if (!string2.equals(MediaController.VIDEO_MIME_TYPE)) {
            if (string2.equals("video/mp4v")) {
                r2.c cVar2 = new r2.c("mp4v");
                cVar2.f = 1;
                cVar2.x = 24;
                cVar2.v = 1;
                cVar2.r = 72.0d;
                cVar2.s = 72.0d;
                cVar2.h = this.width;
                cVar2.n = this.height;
                this.sampleDescriptionBox.a(cVar2);
                return;
            }
            if (!string2.equals("video/hevc") || mediaFormat.getByteBuffer("csd-0") == null) {
                return;
            }
            byte[] array = mediaFormat.getByteBuffer("csd-0").array();
            int i13 = -1;
            int i14 = -1;
            int i15 = 0;
            int i16 = -1;
            for (int i17 = 0; i17 < array.length; i17++) {
                if (i15 == 3 && array[i17] == 1) {
                    if (i16 == -1) {
                        i16 = i17 - 3;
                    } else if (i13 == -1) {
                        i13 = i17 - 3;
                    } else if (i14 == -1) {
                        i14 = i17 - 3;
                    }
                }
                i15 = array[i17] == 0 ? i15 + 1 : 0;
            }
            byte[] bArr = new byte[i13 - 4];
            byte[] bArr2 = new byte[(i14 - i13) - 4];
            byte[] bArr3 = new byte[(array.length - i14) - 4];
            for (int i18 = 0; i18 < array.length; i18++) {
                if (i18 < i13) {
                    int i19 = i18 - 4;
                    if (i19 >= 0) {
                        bArr[i19] = array[i18];
                    }
                } else if (i18 < i14) {
                    int i20 = (i18 - i13) - 4;
                    if (i20 >= 0) {
                        bArr2[i20] = array[i18];
                    }
                } else {
                    int i21 = (i18 - i14) - 4;
                    if (i21 >= 0) {
                        bArr3[i21] = array[i18];
                    }
                }
            }
            try {
                r2.c parseFromCsd = HevcDecoderConfigurationRecord.parseFromCsd(Arrays.asList(ByteBuffer.wrap(bArr), ByteBuffer.wrap(bArr3), ByteBuffer.wrap(bArr2)));
                parseFromCsd.h = this.width;
                parseFromCsd.n = this.height;
                this.sampleDescriptionBox.a(parseFromCsd);
                return;
            } catch (IOException e10) {
                e10.printStackTrace();
                return;
            }
        }
        r2.c cVar3 = new r2.c("avc1");
        cVar3.f = 1;
        cVar3.x = 24;
        cVar3.v = 1;
        cVar3.r = 72.0d;
        cVar3.s = 72.0d;
        cVar3.h = this.width;
        cVar3.n = this.height;
        zb.a aVar5 = new zb.a("avcC");
        zb.b bVar3 = new zb.b();
        bVar3.f = new ArrayList();
        bVar3.g = new ArrayList();
        bVar3.h = true;
        bVar3.i = 1;
        bVar3.j = 0;
        bVar3.k = 0;
        bVar3.l = new ArrayList();
        bVar3.m = 63;
        bVar3.n = 7;
        bVar3.o = 31;
        bVar3.p = 31;
        bVar3.q = 31;
        aVar5.a = bVar3;
        if (mediaFormat.getByteBuffer("csd-0") != null) {
            ArrayList arrayList = new ArrayList();
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
            byteBuffer.position(4);
            byte[] bArr4 = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr4);
            arrayList.add(bArr4);
            ArrayList arrayList2 = new ArrayList();
            ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-1");
            byteBuffer2.position(4);
            byte[] bArr5 = new byte[byteBuffer2.remaining()];
            byteBuffer2.get(bArr5);
            arrayList2.add(bArr5);
            j2.t(zd.a.c(zb.a.h, aVar5, aVar5, arrayList));
            aVar5.a.f = arrayList;
            j2.t(zd.a.c(zb.a.n, aVar5, aVar5, arrayList2));
            aVar5.a.g = arrayList2;
        }
        if (mediaFormat.containsKey("level")) {
            int integer = mediaFormat.getInteger("level");
            if (integer == 1) {
                aVar5.d(1);
            } else if (integer == 32) {
                aVar5.d(2);
            } else if (integer == 4) {
                aVar5.d(11);
            } else if (integer == 8) {
                aVar5.d(12);
            } else if (integer == 16) {
                aVar5.d(13);
            } else if (integer == 64) {
                aVar5.d(21);
            } else if (integer == 128) {
                aVar5.d(22);
            } else if (integer == 256) {
                aVar5.d(3);
            } else if (integer == 512) {
                aVar5.d(31);
            } else if (integer == 1024) {
                aVar5.d(32);
            } else if (integer == 2048) {
                aVar5.d(4);
            } else if (integer == 4096) {
                aVar5.d(41);
            } else if (integer == 8192) {
                aVar5.d(42);
            } else if (integer == 16384) {
                aVar5.d(5);
            } else if (integer == 32768) {
                aVar5.d(51);
            } else if (integer == 65536) {
                aVar5.d(52);
            } else if (integer == 2) {
                aVar5.d(27);
            }
        } else {
            aVar5.d(13);
        }
        if (mediaFormat.containsKey("profile")) {
            int integer2 = mediaFormat.getInteger("profile");
            if (integer2 == 1) {
                aVar5.e(66);
            } else if (integer2 == 2) {
                aVar5.e(77);
            } else if (integer2 == 4) {
                aVar5.e(88);
            } else if (integer2 == 8) {
                aVar5.e(100);
            } else if (integer2 == 16) {
                aVar5.e(110);
            } else if (integer2 == 32) {
                aVar5.e(122);
            } else if (integer2 == 64) {
                aVar5.e(244);
            }
        } else {
            aVar5.e(100);
        }
        j2.t(zd.a.c(zb.a.s, aVar5, aVar5, new Integer(-1)));
        aVar5.a.j = -1;
        j2.t(zd.a.c(zb.a.v, aVar5, aVar5, new Integer(-1)));
        aVar5.a.k = -1;
        j2.t(zd.a.c(zb.a.r, aVar5, aVar5, new Integer(-1)));
        aVar5.a.i = -1;
        j2.t(zd.a.c(zb.a.b, aVar5, aVar5, new Integer(1)));
        aVar5.a.a = 1;
        j2.t(zd.a.c(zb.a.f, aVar5, aVar5, new Integer(3)));
        aVar5.a.e = 3;
        j2.t(zd.a.c(zb.a.d, aVar5, aVar5, new Integer(0)));
        aVar5.a.c = 0;
        cVar3.a(aVar5);
        this.sampleDescriptionBox.a(cVar3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$prepare$0(SamplePresentationTime samplePresentationTime, SamplePresentationTime samplePresentationTime2) {
        if (samplePresentationTime.presentationTime > samplePresentationTime2.presentationTime) {
            return 1;
        }
        return samplePresentationTime.presentationTime < samplePresentationTime2.presentationTime ? -1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if ((r8.flags & 1) != 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void addSample(long j10, MediaCodec.BufferInfo bufferInfo) {
        boolean z10 = this.isAudio ? false : true;
        this.samples.add(new Sample(j10, bufferInfo.size));
        LinkedList<Integer> linkedList = this.syncSamples;
        if (linkedList != null && z10) {
            linkedList.add(Integer.valueOf(this.samples.size()));
        }
        ArrayList<SamplePresentationTime> arrayList = this.samplePresentationTimes;
        arrayList.add(new SamplePresentationTime(arrayList.size(), ((bufferInfo.presentationTimeUs * this.timeScale) + 500000) / 1000000));
    }

    public Date getCreationTime() {
        return this.creationTime;
    }

    public long getDuration() {
        return this.duration;
    }

    public String getHandler() {
        return this.handler;
    }

    public int getHeight() {
        return this.height;
    }

    public long getLastFrameTimestamp() {
        return (((this.duration - this.sampleDurations[r2.length - 1]) * 1000000) - 500000) / this.timeScale;
    }

    public q2.a getMediaHeaderBox() {
        return this.headerBox;
    }

    public int[] getSampleCompositions() {
        return this.sampleCompositions;
    }

    public q2.n getSampleDescriptionBox() {
        return this.sampleDescriptionBox;
    }

    public long[] getSampleDurations() {
        return this.sampleDurations;
    }

    public ArrayList<Sample> getSamples() {
        return this.samples;
    }

    public long[] getSyncSamples() {
        LinkedList<Integer> linkedList = this.syncSamples;
        if (linkedList == null || linkedList.isEmpty()) {
            return null;
        }
        long[] jArr = new long[this.syncSamples.size()];
        for (int i9 = 0; i9 < this.syncSamples.size(); i9++) {
            jArr[i9] = this.syncSamples.get(i9).intValue();
        }
        return jArr;
    }

    public int getTimeScale() {
        return this.timeScale;
    }

    public long getTrackId() {
        return this.trackId;
    }

    public float getVolume() {
        return this.volume;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isAudio() {
        return this.isAudio;
    }

    public void prepare() {
        int i9;
        long j10;
        long j11 = 0;
        this.duration = 0L;
        ArrayList arrayList = new ArrayList(this.samplePresentationTimes);
        int i10 = 0;
        Collections.sort(this.samplePresentationTimes, new b(i10));
        this.sampleDurations = new long[this.samplePresentationTimes.size()];
        long j12 = Long.MAX_VALUE;
        long j13 = 0;
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            if (i11 >= this.samplePresentationTimes.size()) {
                break;
            }
            SamplePresentationTime samplePresentationTime = this.samplePresentationTimes.get(i11);
            long j14 = samplePresentationTime.presentationTime - j13;
            j13 = samplePresentationTime.presentationTime;
            this.sampleDurations[samplePresentationTime.index] = j14;
            if (samplePresentationTime.index != 0) {
                j10 = j11;
                this.duration += j14;
            } else {
                j10 = j11;
            }
            if (j14 > j10 && j14 < 2147483647L) {
                j12 = Math.min(j12, j14);
            }
            if (samplePresentationTime.index != i11) {
                z10 = true;
            }
            i11++;
            j11 = j10;
        }
        long[] jArr = this.sampleDurations;
        if (jArr.length > 0) {
            jArr[0] = j12;
            this.duration += j12;
        }
        for (i9 = 1; i9 < arrayList.size(); i9++) {
            ((SamplePresentationTime) arrayList.get(i9)).dt = this.sampleDurations[i9] + ((SamplePresentationTime) arrayList.get(i9 - 1)).dt;
        }
        if (z10) {
            this.sampleCompositions = new int[this.samplePresentationTimes.size()];
            while (i10 < this.samplePresentationTimes.size()) {
                SamplePresentationTime samplePresentationTime2 = this.samplePresentationTimes.get(i10);
                this.sampleCompositions[samplePresentationTime2.index] = (int) (samplePresentationTime2.presentationTime - samplePresentationTime2.dt);
                i10++;
            }
        }
    }
}
