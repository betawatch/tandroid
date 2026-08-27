package h7;

import com.google.android.exoplayer2.extractor.FlacStreamMetadata;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class r {
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        if (r8 == r20.sampleRateLookupKey) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
    
        if ((r19.r() * org.telegram.messenger.MediaDataController.MAX_STYLE_RUNS_COUNT) == r3) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a4, code lost:
    
        if (r4 == r3) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(d5.z zVar, FlacStreamMetadata flacStreamMetadata, int i10, m3.n nVar) {
        long s10 = zVar.s();
        long j10 = s10 >>> 16;
        if (j10 == i10) {
            boolean z10 = (j10 & 1) == 1;
            int i11 = (int) ((s10 >> 12) & 15);
            int i12 = (int) ((s10 >> 8) & 15);
            int i13 = (int) (15 & (s10 >> 4));
            int i14 = (int) ((s10 >> 1) & 7);
            boolean z11 = (s10 & 1) == 1;
            if (i13 > 7 ? !(i13 > 10 || flacStreamMetadata.channels != 2) : i13 == flacStreamMetadata.channels - 1) {
                if ((i14 == 0 || i14 == flacStreamMetadata.bitsPerSampleLookupKey) && !z11) {
                    try {
                        long x8 = zVar.x();
                        if (!z10) {
                            x8 *= flacStreamMetadata.maxBlockSizeSamples;
                        }
                        nVar.a = x8;
                        int b10 = b(i11, zVar);
                        if (b10 != -1 && b10 <= flacStreamMetadata.maxBlockSizeSamples) {
                            int i15 = flacStreamMetadata.sampleRate;
                            if (i12 != 0) {
                                if (i12 > 11) {
                                    if (i12 != 12) {
                                        if (i12 <= 14) {
                                            int w10 = zVar.w();
                                            if (i12 == 14) {
                                                w10 *= 10;
                                            }
                                        }
                                    }
                                }
                            }
                            int r10 = zVar.r();
                            int i16 = zVar.b;
                            byte[] bArr = zVar.a;
                            int i17 = i16 - 1;
                            int i18 = 0;
                            for (int i19 = zVar.b; i19 < i17; i19++) {
                                i18 = d5.g0.n[i18 ^ (bArr[i19] & 255)];
                            }
                            int i20 = d5.g0.a;
                            if (r10 == i18) {
                                return true;
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        return false;
    }

    public static int b(int i10, d5.z zVar) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return zVar.r() + 1;
            case 7:
                return zVar.w() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }
}
