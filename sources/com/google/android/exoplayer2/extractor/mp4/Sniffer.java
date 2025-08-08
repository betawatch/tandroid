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
        boolean z4;
        int i;
        long length = extractorInput.getLength();
        long j = 4096;
        long j2 = -1;
        int i2 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        if (i2 != 0 && length <= 4096) {
            j = length;
        }
        int i3 = (int) j;
        ParsableByteArray parsableByteArray = new ParsableByteArray(64);
        boolean z5 = false;
        int i4 = 0;
        boolean z6 = false;
        while (i4 < i3) {
            parsableByteArray.reset(8);
            if (!extractorInput.peekFully(parsableByteArray.getData(), z5 ? 1 : 0, 8, true)) {
                break;
            }
            long readUnsignedInt = parsableByteArray.readUnsignedInt();
            int readInt = parsableByteArray.readInt();
            if (readUnsignedInt == 1) {
                extractorInput.peekFully(parsableByteArray.getData(), 8, 8);
                parsableByteArray.setLimit(16);
                readUnsignedInt = parsableByteArray.readLong();
                i = 16;
            } else {
                if (readUnsignedInt == 0) {
                    long length2 = extractorInput.getLength();
                    if (length2 != j2) {
                        readUnsignedInt = (length2 - extractorInput.getPeekPosition()) + 8;
                    }
                }
                i = 8;
            }
            long j3 = i;
            if (readUnsignedInt < j3) {
                return z5;
            }
            i4 += i;
            if (readInt == 1836019574) {
                i3 += (int) readUnsignedInt;
                if (i2 != 0 && i3 > length) {
                    i3 = (int) length;
                }
                j2 = -1;
            } else {
                if (readInt == 1836019558 || readInt == 1836475768) {
                    z3 = true;
                    z4 = true;
                    break;
                }
                int i5 = i2;
                if ((i4 + readUnsignedInt) - j3 >= i3) {
                    break;
                }
                int i6 = (int) (readUnsignedInt - j3);
                i4 += i6;
                if (readInt == 1718909296) {
                    if (i6 < 8) {
                        return false;
                    }
                    parsableByteArray.reset(i6);
                    extractorInput.peekFully(parsableByteArray.getData(), 0, i6);
                    int i7 = i6 / 4;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= i7) {
                            break;
                        }
                        if (i8 == 1) {
                            parsableByteArray.skipBytes(4);
                        } else if (isCompatibleBrand(parsableByteArray.readInt(), z2)) {
                            z6 = true;
                            break;
                        }
                        i8++;
                    }
                    if (!z6) {
                        return false;
                    }
                } else if (i6 != 0) {
                    extractorInput.advancePeekPosition(i6);
                }
                i2 = i5;
                j2 = -1;
                z5 = false;
            }
        }
        z3 = true;
        z4 = false;
        if (z6 && z == z4) {
            return z3;
        }
        return false;
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
