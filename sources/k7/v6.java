package k7;

import org.telegram.ui.Components.jb;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class v6 {
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        if (r8 == r20.f) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
    
        if ((r19.u() * org.telegram.messenger.MediaDataController.MAX_STYLE_RUNS_COUNT) == r3) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a4, code lost:
    
        if (r4 == r3) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(h5.w wVar, r3.o oVar, int i10, jb jbVar) {
        long v = wVar.v();
        long j10 = v >>> 16;
        if (j10 == i10) {
            boolean z4 = (j10 & 1) == 1;
            int i11 = (int) ((v >> 12) & 15);
            int i12 = (int) ((v >> 8) & 15);
            int i13 = (int) (15 & (v >> 4));
            int i14 = (int) ((v >> 1) & 7);
            boolean z10 = (v & 1) == 1;
            if (i13 > 7 ? !(i13 > 10 || oVar.g != 2) : i13 == oVar.g - 1) {
                if ((i14 == 0 || i14 == oVar.i) && !z10) {
                    try {
                        long A = wVar.A();
                        if (!z4) {
                            A *= oVar.b;
                        }
                        jbVar.a = A;
                        int b10 = b(i11, wVar);
                        if (b10 != -1 && b10 <= oVar.b) {
                            int i15 = oVar.e;
                            if (i12 != 0) {
                                if (i12 > 11) {
                                    if (i12 != 12) {
                                        if (i12 <= 14) {
                                            int z11 = wVar.z();
                                            if (i12 == 14) {
                                                z11 *= 10;
                                            }
                                        }
                                    }
                                }
                            }
                            int u10 = wVar.u();
                            int i16 = wVar.b;
                            byte[] bArr = wVar.a;
                            int i17 = i16 - 1;
                            int i18 = 0;
                            for (int i19 = wVar.b; i19 < i17; i19++) {
                                i18 = h5.d0.n[i18 ^ (bArr[i19] & 255)];
                            }
                            int i20 = h5.d0.a;
                            if (u10 == i18) {
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

    public static int b(int i10, h5.w wVar) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return wVar.u() + 1;
            case 7:
                return wVar.z() + 1;
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
