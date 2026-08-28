package g7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class a8 {
    public static long a(d5.y yVar, int i9, int i10) {
        yVar.C(i9);
        if (yVar.a() < 5) {
            return -9223372036854775807L;
        }
        int e10 = yVar.e();
        if ((8388608 & e10) != 0 || ((2096896 & e10) >> 8) != i10 || (e10 & 32) == 0 || yVar.r() < 7 || yVar.a() < 7 || (yVar.r() & 16) != 16) {
            return -9223372036854775807L;
        }
        yVar.c(0, 6, new byte[6]);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((255 & r0[4]) >> 7);
    }
}
