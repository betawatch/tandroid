package g7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class p {
    public static void a(long j10, d5.y yVar, m3.w[] wVarArr) {
        int i9;
        while (true) {
            if (yVar.a() <= 1) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (yVar.a() == 0) {
                    i9 = -1;
                    break;
                }
                int r10 = yVar.r();
                i10 += r10;
                if (r10 != 255) {
                    i9 = i10;
                    break;
                }
            }
            int i11 = 0;
            while (true) {
                if (yVar.a() == 0) {
                    i11 = -1;
                    break;
                }
                int r11 = yVar.r();
                i11 += r11;
                if (r11 != 255) {
                    break;
                }
            }
            int i12 = yVar.b + i11;
            if (i11 == -1 || i11 > yVar.a()) {
                d5.a.K("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i12 = yVar.c;
            } else if (i9 == 4 && i11 >= 8) {
                int r12 = yVar.r();
                int w8 = yVar.w();
                int e10 = w8 == 49 ? yVar.e() : 0;
                int r13 = yVar.r();
                if (w8 == 47) {
                    yVar.D(1);
                }
                boolean z10 = r12 == 181 && (w8 == 49 || w8 == 47) && r13 == 3;
                if (w8 == 49) {
                    z10 &= e10 == 1195456820;
                }
                if (z10) {
                    b(j10, yVar, wVarArr);
                }
            }
            yVar.C(i12);
        }
    }

    public static void b(long j10, d5.y yVar, m3.w[] wVarArr) {
        long j11;
        int r10 = yVar.r();
        if ((r10 & 64) != 0) {
            yVar.D(1);
            int i9 = (r10 & 31) * 3;
            int i10 = yVar.b;
            int length = wVarArr.length;
            int i11 = 0;
            while (i11 < length) {
                m3.w wVar = wVarArr[i11];
                yVar.C(i10);
                wVar.a(i9, yVar);
                if (j10 != -9223372036854775807L) {
                    j11 = j10;
                    wVar.e(j11, 1, i9, 0, null);
                } else {
                    j11 = j10;
                }
                i11++;
                j10 = j11;
            }
        }
    }
}
