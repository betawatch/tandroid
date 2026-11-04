package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import h5.s;
import h5.z;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class Track {
    private static Map<Integer, Integer> samplingFrequencyIndexMap;
    private String handler;
    private h5.a headerBox;
    private int height;
    private boolean isAudio;
    private int[] sampleCompositions;
    private h5.n sampleDescriptionBox;
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

    /* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
    public static class SamplePresentationTime {
        private long dt;
        private int index;
        private long presentationTime;

        public SamplePresentationTime(int i3, long j10) {
            this.index = i3;
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

    public Track(int i3, MediaFormat mediaFormat, boolean z10) {
        int i10;
        boolean z11;
        int i11;
        this.syncSamples = null;
        this.volume = 0.0f;
        this.trackId = i3;
        this.isAudio = z10;
        int i12 = 0;
        if (z10) {
            this.volume = 1.0f;
            this.timeScale = mediaFormat.getInteger("sample-rate");
            this.handler = "soun";
            this.headerBox = new s("smhd");
            this.sampleDescriptionBox = new h5.n();
            i5.b bVar = new i5.b("mp4a");
            bVar.h = mediaFormat.getInteger("channel-count");
            bVar.r = mediaFormat.getInteger("sample-rate");
            bVar.f = 1;
            bVar.n = 16;
            hc.b bVar2 = new hc.b("esds");
            ic.g gVar = new ic.g();
            gVar.i = 0;
            gVar.o = new ArrayList();
            gVar.d = 0;
            ic.m mVar = new ic.m();
            mVar.d = 2;
            gVar.n = mVar;
            String string = mediaFormat.containsKey("mime") ? mediaFormat.getString("mime") : "audio/mp4-latm";
            ic.d dVar = new ic.d();
            dVar.k = new ArrayList();
            if ("audio/mpeg".equals(string)) {
                dVar.d = hs.q1;
            } else {
                dVar.d = 64;
            }
            dVar.e = 5;
            dVar.g = 1536;
            if (mediaFormat.containsKey("max-bitrate")) {
                i10 = 13;
                z11 = 7;
                dVar.h = mediaFormat.getInteger("max-bitrate");
            } else {
                i10 = 13;
                z11 = 7;
                dVar.h = 96000L;
            }
            dVar.i = this.timeScale;
            ic.a aVar = new ic.a();
            aVar.e = 2;
            aVar.f = samplingFrequencyIndexMap.get(Integer.valueOf((int) bVar.r)).intValue();
            aVar.h = bVar.h;
            dVar.j = aVar;
            gVar.m = dVar;
            ByteBuffer allocate = ByteBuffer.allocate(gVar.c());
            g5.b.r(3, allocate);
            allocate.put((byte) ((gVar.c() - 2) & hs.e4));
            g5.b.p(gVar.d, allocate);
            allocate.put((byte) (((gVar.e << 7) | (gVar.f << 6) | (gVar.g << 5) | (31 & gVar.h)) & hs.e4));
            if (gVar.e > 0) {
                g5.b.p(gVar.k, allocate);
            }
            if (gVar.f > 0) {
                allocate.put((byte) (gVar.i & hs.e4));
                allocate.put(g5.b.b(gVar.j));
                allocate.put((byte) 0);
            }
            if (gVar.g > 0) {
                g5.b.p(gVar.l, allocate);
            }
            ic.d dVar2 = gVar.m;
            ic.a aVar2 = dVar2.j;
            if (aVar2 == null) {
                i11 = 0;
            } else {
                if (aVar2.e != 2) {
                    throw new UnsupportedOperationException("can't serialize that yet");
                }
                i11 = 4;
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(i11 + 15);
            g5.b.r(4, allocate2);
            ic.a aVar3 = dVar2.j;
            if (aVar3 != null) {
                if (aVar3.e != 2) {
                    throw new UnsupportedOperationException("can't serialize that yet");
                }
                i12 = 4;
            }
            allocate2.put((byte) ((i12 + i10) & hs.e4));
            allocate2.put((byte) (dVar2.d & hs.e4));
            allocate2.put((byte) (((dVar2.e << 2) | (dVar2.f << 1) | 1) & hs.e4));
            g5.b.q(dVar2.g, allocate2);
            allocate2.putInt((int) dVar2.h);
            allocate2.putInt((int) dVar2.i);
            ic.a aVar4 = dVar2.j;
            if (aVar4 != null) {
                if (aVar4.e != 2) {
                    throw new UnsupportedOperationException("can't serialize that yet");
                }
                ByteBuffer allocate3 = ByteBuffer.allocate(4);
                g5.b.r(5, allocate3);
                if (aVar4.e != 2) {
                    throw new UnsupportedOperationException("can't serialize that yet");
                }
                allocate3.put((byte) 2);
                ic.c cVar = new ic.c(1, allocate3);
                cVar.c(aVar4.e, 5);
                cVar.c(aVar4.f, 4);
                if (aVar4.f == 15) {
                    throw new UnsupportedOperationException("can't serialize that yet");
                }
                cVar.c(aVar4.h, 4);
                allocate2.put(allocate3.array());
            }
            ic.m mVar2 = gVar.n;
            mVar2.getClass();
            ByteBuffer allocate4 = ByteBuffer.allocate(3);
            g5.b.r(6, allocate4);
            allocate4.put((byte) 1);
            allocate4.put((byte) (mVar2.d & hs.e4));
            allocate.put(allocate2.array());
            allocate.put(allocate4.array());
            com.google.android.recaptcha.internal.a.t(we.a.c(hc.a.h, bVar2, bVar2, allocate));
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
        this.sampleDescriptionBox = new h5.n();
        String string2 = mediaFormat.getString("mime");
        if (!string2.equals("video/avc")) {
            if (string2.equals("video/mp4v")) {
                i5.c cVar2 = new i5.c("mp4v");
                cVar2.f = 1;
                cVar2.y = 24;
                cVar2.w = 1;
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
            int i15 = -1;
            int i16 = 0;
            for (int i17 = 0; i17 < array.length; i17++) {
                if (i16 == 3 && array[i17] == 1) {
                    if (i15 == -1) {
                        i15 = i17 - 3;
                    } else if (i13 == -1) {
                        i13 = i17 - 3;
                    } else if (i14 == -1) {
                        i14 = i17 - 3;
                    }
                }
                i16 = array[i17] == 0 ? i16 + 1 : 0;
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
                i5.c parseFromCsd = HevcDecoderConfigurationRecord.parseFromCsd(Arrays.asList(ByteBuffer.wrap(bArr), ByteBuffer.wrap(bArr3), ByteBuffer.wrap(bArr2)));
                parseFromCsd.h = this.width;
                parseFromCsd.n = this.height;
                this.sampleDescriptionBox.a(parseFromCsd);
                return;
            } catch (IOException e10) {
                e10.printStackTrace();
                return;
            }
        }
        i5.c cVar3 = new i5.c("avc1");
        cVar3.f = 1;
        cVar3.y = 24;
        cVar3.w = 1;
        cVar3.r = 72.0d;
        cVar3.s = 72.0d;
        cVar3.h = this.width;
        cVar3.n = this.height;
        nc.a aVar5 = new nc.a("avcC");
        nc.b bVar3 = new nc.b();
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
            com.google.android.recaptcha.internal.a.t(we.a.c(nc.a.h, aVar5, aVar5, arrayList));
            aVar5.a.f = arrayList;
            com.google.android.recaptcha.internal.a.t(we.a.c(nc.a.n, aVar5, aVar5, arrayList2));
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
                aVar5.e(hs.v1);
            } else if (integer2 == 32) {
                aVar5.e(hs.G1);
            } else if (integer2 == 64) {
                aVar5.e(hs.T3);
            }
        } else {
            aVar5.e(100);
        }
        com.google.android.recaptcha.internal.a.t(we.a.c(nc.a.s, aVar5, aVar5, new Integer(-1)));
        aVar5.a.j = -1;
        com.google.android.recaptcha.internal.a.t(we.a.c(nc.a.w, aVar5, aVar5, new Integer(-1)));
        aVar5.a.k = -1;
        com.google.android.recaptcha.internal.a.t(we.a.c(nc.a.r, aVar5, aVar5, new Integer(-1)));
        aVar5.a.i = -1;
        com.google.android.recaptcha.internal.a.t(we.a.c(nc.a.b, aVar5, aVar5, new Integer(1)));
        aVar5.a.a = 1;
        com.google.android.recaptcha.internal.a.t(we.a.c(nc.a.f, aVar5, aVar5, new Integer(3)));
        aVar5.a.e = 3;
        com.google.android.recaptcha.internal.a.t(we.a.c(nc.a.d, aVar5, aVar5, new Integer(0)));
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

    public h5.a getMediaHeaderBox() {
        return this.headerBox;
    }

    public int[] getSampleCompositions() {
        return this.sampleCompositions;
    }

    public h5.n getSampleDescriptionBox() {
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
        for (int i3 = 0; i3 < this.syncSamples.size(); i3++) {
            jArr[i3] = this.syncSamples.get(i3).intValue();
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
        int i3;
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
        for (i3 = 1; i3 < arrayList.size(); i3++) {
            ((SamplePresentationTime) arrayList.get(i3)).dt = this.sampleDurations[i3] + ((SamplePresentationTime) arrayList.get(i3 - 1)).dt;
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
