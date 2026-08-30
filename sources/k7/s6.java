package k7;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class s6 {
    public static void a(long j10, h5.w wVar, r3.v[] vVarArr) {
        int i10;
        while (true) {
            if (wVar.a() <= 1) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (wVar.a() == 0) {
                    i10 = -1;
                    break;
                }
                int u10 = wVar.u();
                i11 += u10;
                if (u10 != 255) {
                    i10 = i11;
                    break;
                }
            }
            int i12 = 0;
            while (true) {
                if (wVar.a() == 0) {
                    i12 = -1;
                    break;
                }
                int u11 = wVar.u();
                i12 += u11;
                if (u11 != 255) {
                    break;
                }
            }
            int i13 = wVar.b + i12;
            if (i12 == -1 || i12 > wVar.a()) {
                h5.a.K("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i13 = wVar.c;
            } else if (i10 == 4 && i12 >= 8) {
                int u12 = wVar.u();
                int z4 = wVar.z();
                int g10 = z4 == 49 ? wVar.g() : 0;
                int u13 = wVar.u();
                if (z4 == 47) {
                    wVar.G(1);
                }
                boolean z10 = u12 == 181 && (z4 == 49 || z4 == 47) && u13 == 3;
                if (z4 == 49) {
                    z10 &= g10 == 1195456820;
                }
                if (z10) {
                    b(j10, wVar, vVarArr);
                }
            }
            wVar.F(i13);
        }
    }

    public static void b(long j10, h5.w wVar, r3.v[] vVarArr) {
        long j11;
        int u10 = wVar.u();
        if ((u10 & 64) != 0) {
            wVar.G(1);
            int i10 = (u10 & 31) * 3;
            int i11 = wVar.b;
            int length = vVarArr.length;
            int i12 = 0;
            while (i12 < length) {
                r3.v vVar = vVarArr[i12];
                wVar.F(i11);
                vVar.d(i10, wVar);
                if (j10 != -9223372036854775807L) {
                    j11 = j10;
                    vVar.c(j11, 1, i10, 0, null);
                } else {
                    j11 = j10;
                }
                i12++;
                j10 = j11;
            }
        }
    }
}
