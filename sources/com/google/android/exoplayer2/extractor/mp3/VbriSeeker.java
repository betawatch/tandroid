package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes.dex */
final class VbriSeeker implements Seeker {
    private final long dataEndPosition;
    private final long durationUs;
    private final long[] positions;
    private final long[] timesUs;

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    public static VbriSeeker create(long j, long j2, MpegAudioUtil.Header header, ParsableByteArray parsableByteArray) {
        int readUnsignedByte;
        parsableByteArray.skipBytes(10);
        int readInt = parsableByteArray.readInt();
        VbriSeeker vbriSeeker = null;
        if (readInt <= 0) {
            return null;
        }
        int i = header.sampleRate;
        long scaleLargeTimestamp = Util.scaleLargeTimestamp(readInt, (i >= 32000 ? 1152 : 576) * 1000000, i);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
        int readUnsignedShort3 = parsableByteArray.readUnsignedShort();
        int i2 = 2;
        parsableByteArray.skipBytes(2);
        long j3 = j2 + header.frameSize;
        long[] jArr = new long[readUnsignedShort];
        long[] jArr2 = new long[readUnsignedShort];
        int i3 = 0;
        long j4 = j2;
        while (i3 < readUnsignedShort) {
            VbriSeeker vbriSeeker2 = vbriSeeker;
            int i4 = readUnsignedShort2;
            long[] jArr3 = jArr;
            jArr3[i3] = (i3 * scaleLargeTimestamp) / readUnsignedShort;
            jArr2[i3] = Math.max(j4, j3);
            if (readUnsignedShort3 == 1) {
                readUnsignedByte = parsableByteArray.readUnsignedByte();
            } else if (readUnsignedShort3 == i2) {
                readUnsignedByte = parsableByteArray.readUnsignedShort();
            } else if (readUnsignedShort3 == 3) {
                readUnsignedByte = parsableByteArray.readUnsignedInt24();
            } else {
                if (readUnsignedShort3 != 4) {
                    return vbriSeeker2;
                }
                readUnsignedByte = parsableByteArray.readUnsignedIntToInt();
            }
            j4 += readUnsignedByte * i4;
            i3++;
            vbriSeeker = vbriSeeker2;
            readUnsignedShort2 = i4;
            jArr = jArr3;
            j3 = j3;
            i2 = 2;
        }
        long[] jArr4 = jArr;
        if (j != -1 && j != j4) {
            Log.w("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new VbriSeeker(jArr4, jArr2, scaleLargeTimestamp, j4);
    }

    private VbriSeeker(long[] jArr, long[] jArr2, long j, long j2) {
        this.timesUs = jArr;
        this.positions = jArr2;
        this.durationUs = j;
        this.dataEndPosition = j2;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j) {
        int binarySearchFloor = Util.binarySearchFloor(this.timesUs, j, true, true);
        SeekPoint seekPoint = new SeekPoint(this.timesUs[binarySearchFloor], this.positions[binarySearchFloor]);
        if (seekPoint.timeUs >= j || binarySearchFloor == this.timesUs.length - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        int i = binarySearchFloor + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(this.timesUs[i], this.positions[i]));
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getTimeUs(long j) {
        return this.timesUs[Util.binarySearchFloor(this.positions, j, true, true)];
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }
}
