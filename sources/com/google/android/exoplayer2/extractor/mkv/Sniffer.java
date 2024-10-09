package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* loaded from: classes.dex */
final class Sniffer {
    private int peekLength;
    private final ParsableByteArray scratch = new ParsableByteArray(8);

    private long readUint(ExtractorInput extractorInput) {
        int i = 0;
        extractorInput.peekFully(this.scratch.getData(), 0, 1);
        int i2 = this.scratch.getData()[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (i3 ^ (-1));
        extractorInput.peekFully(this.scratch.getData(), 1, i4);
        while (i < i4) {
            i++;
            i5 = (this.scratch.getData()[i] & 255) + (i5 << 8);
        }
        this.peekLength += i4 + 1;
        return i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a2, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean sniff(ExtractorInput extractorInput) {
        long length = extractorInput.getLength();
        long j = 1024;
        if (length != -1 && length <= 1024) {
            j = length;
        }
        int i = (int) j;
        extractorInput.peekFully(this.scratch.getData(), 0, 4);
        long readUnsignedInt = this.scratch.readUnsignedInt();
        this.peekLength = 4;
        while (readUnsignedInt != 440786851) {
            int i2 = this.peekLength + 1;
            this.peekLength = i2;
            if (i2 == i) {
                return false;
            }
            extractorInput.peekFully(this.scratch.getData(), 0, 1);
            readUnsignedInt = ((readUnsignedInt << 8) & (-256)) | (this.scratch.getData()[0] & 255);
        }
        long readUint = readUint(extractorInput);
        long j2 = this.peekLength;
        if (readUint == Long.MIN_VALUE) {
            return false;
        }
        if (length != -1 && j2 + readUint >= length) {
            return false;
        }
        while (true) {
            long j3 = this.peekLength;
            long j4 = j2 + readUint;
            if (j3 >= j4) {
                return j3 == j4;
            }
            if (readUint(extractorInput) == Long.MIN_VALUE) {
                return false;
            }
            long readUint2 = readUint(extractorInput);
            if (readUint2 < 0 || readUint2 > 2147483647L) {
                break;
            }
            if (readUint2 != 0) {
                int i3 = (int) readUint2;
                extractorInput.advancePeekPosition(i3);
                this.peekLength += i3;
            }
        }
    }
}
