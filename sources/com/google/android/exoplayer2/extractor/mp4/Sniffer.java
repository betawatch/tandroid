package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* loaded from: classes.dex */
abstract class Sniffer {
    private static final int[] COMPATIBLE_BRANDS = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean sniffFragmented(ExtractorInput extractorInput) {
        return sniffInternal(extractorInput, true, false);
    }

    public static boolean sniffUnfragmented(ExtractorInput extractorInput, boolean z) {
        return sniffInternal(extractorInput, false, z);
    }

    private static boolean sniffInternal(ExtractorInput extractorInput, boolean z, boolean z2) {
        boolean z3;
        int i;
        int i2;
        long length = extractorInput.getLength();
        long j = 4096;
        long j2 = -1;
        int i3 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        if (i3 != 0 && length <= 4096) {
            j = length;
        }
        int i4 = (int) j;
        ParsableByteArray parsableByteArray = new ParsableByteArray(64);
        int i5 = 0;
        int i6 = 0;
        boolean z4 = false;
        while (i6 < i4) {
            parsableByteArray.reset(8);
            if (!extractorInput.peekFully(parsableByteArray.getData(), i5, 8, true)) {
                break;
            }
            long readUnsignedInt = parsableByteArray.readUnsignedInt();
            int readInt = parsableByteArray.readInt();
            if (readUnsignedInt == 1) {
                extractorInput.peekFully(parsableByteArray.getData(), 8, 8);
                parsableByteArray.setLimit(16);
                i = i6;
                readUnsignedInt = parsableByteArray.readLong();
                i2 = 16;
            } else {
                if (readUnsignedInt == 0) {
                    long length2 = extractorInput.getLength();
                    if (length2 != j2) {
                        readUnsignedInt = (length2 - extractorInput.getPeekPosition()) + 8;
                    }
                }
                i = i6;
                i2 = 8;
            }
            long j3 = i2;
            if (readUnsignedInt < j3) {
                return false;
            }
            int i7 = i + i2;
            if (readInt == 1836019574) {
                i4 += (int) readUnsignedInt;
                if (i3 != 0 && i4 > length) {
                    i4 = (int) length;
                }
                i6 = i7;
            } else {
                if (readInt == 1836019558 || readInt == 1836475768) {
                    z3 = true;
                    break;
                }
                int i8 = i3;
                if ((i7 + readUnsignedInt) - j3 >= i4) {
                    break;
                }
                int i9 = (int) (readUnsignedInt - j3);
                i6 = i7 + i9;
                if (readInt == 1718909296) {
                    if (i9 < 8) {
                        return false;
                    }
                    parsableByteArray.reset(i9);
                    extractorInput.peekFully(parsableByteArray.getData(), 0, i9);
                    int i10 = i9 / 4;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= i10) {
                            break;
                        }
                        if (i11 == 1) {
                            parsableByteArray.skipBytes(4);
                        } else if (isCompatibleBrand(parsableByteArray.readInt(), z2)) {
                            z4 = true;
                            break;
                        }
                        i11++;
                    }
                    if (!z4) {
                        return false;
                    }
                } else if (i9 != 0) {
                    extractorInput.advancePeekPosition(i9);
                }
                i3 = i8;
            }
            j2 = -1;
            i5 = 0;
        }
        z3 = false;
        return z4 && z == z3;
    }

    private static boolean isCompatibleBrand(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 : COMPATIBLE_BRANDS) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }
}
