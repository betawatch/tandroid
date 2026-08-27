package h7;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class p {
    public static void a(long j10, d5.z zVar, m3.w[] wVarArr) {
        int i10;
        while (true) {
            if (zVar.a() <= 1) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (zVar.a() == 0) {
                    i10 = -1;
                    break;
                }
                int r10 = zVar.r();
                i11 += r10;
                if (r10 != 255) {
                    i10 = i11;
                    break;
                }
            }
            int i12 = 0;
            while (true) {
                if (zVar.a() == 0) {
                    i12 = -1;
                    break;
                }
                int r11 = zVar.r();
                i12 += r11;
                if (r11 != 255) {
                    break;
                }
            }
            int i13 = zVar.b + i12;
            if (i12 == -1 || i12 > zVar.a()) {
                d5.a.K("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i13 = zVar.c;
            } else if (i10 == 4 && i12 >= 8) {
                int r12 = zVar.r();
                int w10 = zVar.w();
                int e9 = w10 == 49 ? zVar.e() : 0;
                int r13 = zVar.r();
                if (w10 == 47) {
                    zVar.D(1);
                }
                boolean z10 = r12 == 181 && (w10 == 49 || w10 == 47) && r13 == 3;
                if (w10 == 49) {
                    z10 &= e9 == 1195456820;
                }
                if (z10) {
                    b(j10, zVar, wVarArr);
                }
            }
            zVar.C(i13);
        }
    }

    public static void b(long j10, d5.z zVar, m3.w[] wVarArr) {
        long j11;
        int r10 = zVar.r();
        if ((r10 & 64) != 0) {
            zVar.D(1);
            int i10 = (r10 & 31) * 3;
            int i11 = zVar.b;
            int length = wVarArr.length;
            int i12 = 0;
            while (i12 < length) {
                m3.w wVar = wVarArr[i12];
                zVar.C(i11);
                wVar.a(i10, zVar);
                if (j10 != -9223372036854775807L) {
                    j11 = j10;
                    wVar.e(j11, 1, i10, 0, null);
                } else {
                    j11 = j10;
                }
                i12++;
                j10 = j11;
            }
        }
    }
}
