package g7;

import com.google.android.exoplayer2.extractor.FlacStreamMetadata;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    public static boolean a(d5.y yVar, FlacStreamMetadata flacStreamMetadata, int i9, m3.n nVar) {
        long s10 = yVar.s();
        long j10 = s10 >>> 16;
        if (j10 == i9) {
            boolean z10 = (j10 & 1) == 1;
            int i10 = (int) ((s10 >> 12) & 15);
            int i11 = (int) ((s10 >> 8) & 15);
            int i12 = (int) (15 & (s10 >> 4));
            int i13 = (int) ((s10 >> 1) & 7);
            boolean z11 = (s10 & 1) == 1;
            if (i12 > 7 ? !(i12 > 10 || flacStreamMetadata.channels != 2) : i12 == flacStreamMetadata.channels - 1) {
                if ((i13 == 0 || i13 == flacStreamMetadata.bitsPerSampleLookupKey) && !z11) {
                    try {
                        long x10 = yVar.x();
                        if (!z10) {
                            x10 *= flacStreamMetadata.maxBlockSizeSamples;
                        }
                        nVar.a = x10;
                        int b10 = b(i10, yVar);
                        if (b10 != -1 && b10 <= flacStreamMetadata.maxBlockSizeSamples) {
                            int i14 = flacStreamMetadata.sampleRate;
                            if (i11 != 0) {
                                if (i11 > 11) {
                                    if (i11 != 12) {
                                        if (i11 <= 14) {
                                            int w8 = yVar.w();
                                            if (i11 == 14) {
                                                w8 *= 10;
                                            }
                                        }
                                    }
                                }
                            }
                            int r10 = yVar.r();
                            int i15 = yVar.b;
                            byte[] bArr = yVar.a;
                            int i16 = i15 - 1;
                            int i17 = 0;
                            for (int i18 = yVar.b; i18 < i16; i18++) {
                                i17 = d5.f0.n[i17 ^ (bArr[i18] & 255)];
                            }
                            int i19 = d5.f0.a;
                            if (r10 == i17) {
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

    public static int b(int i9, d5.y yVar) {
        switch (i9) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i9 - 2);
            case 6:
                return yVar.r() + 1;
            case 7:
                return yVar.w() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i9 - 8);
            default:
                return -1;
        }
    }
}
