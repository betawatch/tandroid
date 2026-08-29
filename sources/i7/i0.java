package i7;

import com.google.android.exoplayer2.extractor.FlacStreamMetadata;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class i0 {
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
    public static boolean a(f5.w wVar, FlacStreamMetadata flacStreamMetadata, int i10, o3.n nVar) {
        long s10 = wVar.s();
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
                        long x4 = wVar.x();
                        if (!z10) {
                            x4 *= flacStreamMetadata.maxBlockSizeSamples;
                        }
                        nVar.a = x4;
                        int b10 = b(i11, wVar);
                        if (b10 != -1 && b10 <= flacStreamMetadata.maxBlockSizeSamples) {
                            int i15 = flacStreamMetadata.sampleRate;
                            if (i12 != 0) {
                                if (i12 > 11) {
                                    if (i12 != 12) {
                                        if (i12 <= 14) {
                                            int w10 = wVar.w();
                                            if (i12 == 14) {
                                                w10 *= 10;
                                            }
                                        }
                                    }
                                }
                            }
                            int r6 = wVar.r();
                            int i16 = wVar.b;
                            byte[] bArr = wVar.a;
                            int i17 = i16 - 1;
                            int i18 = 0;
                            for (int i19 = wVar.b; i19 < i17; i19++) {
                                i18 = f5.d0.n[i18 ^ (bArr[i19] & 255)];
                            }
                            int i20 = f5.d0.a;
                            if (r6 == i18) {
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

    public static int b(int i10, f5.w wVar) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return wVar.r() + 1;
            case 7:
                return wVar.w() + 1;
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
