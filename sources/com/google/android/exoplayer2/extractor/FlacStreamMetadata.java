package com.google.android.exoplayer2.extractor;

import androidx.car.app.media.b;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import d5.g0;
import d5.y;
import h3.s0;
import h3.t0;
import h7.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m3.p;
import z3.c;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class FlacStreamMetadata {
    public static final int NOT_IN_LOOKUP_TABLE = -1;
    private static final String TAG = "FlacStreamMetadata";
    public final int bitsPerSample;
    public final int bitsPerSampleLookupKey;
    public final int channels;
    public final int maxBlockSizeSamples;
    public final int maxFrameSize;
    private final c metadata;
    public final int minBlockSizeSamples;
    public final int minFrameSize;
    public final int sampleRate;
    public final int sampleRateLookupKey;
    public final p seekTable;
    public final long totalSamples;

    public FlacStreamMetadata(byte[] bArr, int i10) {
        y yVar = new y(bArr, bArr.length);
        yVar.p(i10 * 8);
        this.minBlockSizeSamples = yVar.i(16);
        this.maxBlockSizeSamples = yVar.i(16);
        this.minFrameSize = yVar.i(24);
        this.maxFrameSize = yVar.i(24);
        int i11 = yVar.i(20);
        this.sampleRate = i11;
        this.sampleRateLookupKey = getSampleRateLookupKey(i11);
        this.channels = yVar.i(3) + 1;
        int i12 = yVar.i(5) + 1;
        this.bitsPerSample = i12;
        this.bitsPerSampleLookupKey = getBitsPerSampleLookupKey(i12);
        int i13 = yVar.i(4);
        int i14 = yVar.i(32);
        int i15 = g0.a;
        this.totalSamples = ((i13 & 4294967295L) << 32) | (i14 & 4294967295L);
        this.seekTable = null;
        this.metadata = null;
    }

    private static c concatenateVorbisMetadata(List<String> list, List<PictureFrame> list2) {
        c a2 = t.a(list);
        if (a2 == null && list2.isEmpty()) {
            return null;
        }
        return new c(list2).a(a2);
    }

    private static int getBitsPerSampleLookupKey(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int getSampleRateLookupKey(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case b.AUDIO_CONTENT_SAMPLING_RATE /* 16000 */:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public FlacStreamMetadata copyWithPictureFrames(List<PictureFrame> list) {
        return new FlacStreamMetadata(this.minBlockSizeSamples, this.maxBlockSizeSamples, this.minFrameSize, this.maxFrameSize, this.sampleRate, this.channels, this.bitsPerSample, this.totalSamples, this.seekTable, getMetadataCopyWithAppendedEntriesFrom(new c(list)));
    }

    public FlacStreamMetadata copyWithSeekTable(p pVar) {
        return new FlacStreamMetadata(this.minBlockSizeSamples, this.maxBlockSizeSamples, this.minFrameSize, this.maxFrameSize, this.sampleRate, this.channels, this.bitsPerSample, this.totalSamples, pVar, this.metadata);
    }

    public FlacStreamMetadata copyWithVorbisComments(List<String> list) {
        return new FlacStreamMetadata(this.minBlockSizeSamples, this.maxBlockSizeSamples, this.minFrameSize, this.maxFrameSize, this.sampleRate, this.channels, this.bitsPerSample, this.totalSamples, this.seekTable, getMetadataCopyWithAppendedEntriesFrom(t.a(list)));
    }

    public long getApproxBytesPerFrame() {
        long j10;
        long j11;
        int i10 = this.maxFrameSize;
        if (i10 > 0) {
            j10 = (i10 + this.minFrameSize) / 2;
            j11 = 1;
        } else {
            int i11 = this.minBlockSizeSamples;
            j10 = ((((i11 != this.maxBlockSizeSamples || i11 <= 0) ? 4096L : i11) * this.channels) * this.bitsPerSample) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public int getDecodedBitrate() {
        return this.bitsPerSample * this.sampleRate * this.channels;
    }

    public long getDurationUs() {
        long j10 = this.totalSamples;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / this.sampleRate;
    }

    public t0 getFormat(byte[] bArr, c cVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.maxFrameSize;
        if (i10 <= 0) {
            i10 = -1;
        }
        c metadataCopyWithAppendedEntriesFrom = getMetadataCopyWithAppendedEntriesFrom(cVar);
        s0 s0Var = new s0();
        s0Var.o = "audio/flac";
        s0Var.p = i10;
        s0Var.B = this.channels;
        s0Var.C = this.sampleRate;
        s0Var.q = Collections.singletonList(bArr);
        s0Var.i = metadataCopyWithAppendedEntriesFrom;
        return new t0(s0Var);
    }

    public int getMaxDecodedFrameSize() {
        return (this.bitsPerSample / 8) * this.maxBlockSizeSamples * this.channels;
    }

    public c getMetadataCopyWithAppendedEntriesFrom(c cVar) {
        c cVar2 = this.metadata;
        return cVar2 == null ? cVar : cVar2.a(cVar);
    }

    public long getSampleNumber(long j10) {
        return g0.i((j10 * this.sampleRate) / 1000000, 0L, this.totalSamples - 1);
    }

    public FlacStreamMetadata(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, ArrayList<String> arrayList, ArrayList<PictureFrame> arrayList2) {
        this(i10, i11, i12, i13, i14, i15, i16, j10, (p) null, concatenateVorbisMetadata(arrayList, arrayList2));
    }

    private FlacStreamMetadata(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, p pVar, c cVar) {
        this.minBlockSizeSamples = i10;
        this.maxBlockSizeSamples = i11;
        this.minFrameSize = i12;
        this.maxFrameSize = i13;
        this.sampleRate = i14;
        this.sampleRateLookupKey = getSampleRateLookupKey(i14);
        this.channels = i15;
        this.bitsPerSample = i16;
        this.bitsPerSampleLookupKey = getBitsPerSampleLookupKey(i16);
        this.totalSamples = j10;
        this.seekTable = pVar;
        this.metadata = cVar;
    }
}
