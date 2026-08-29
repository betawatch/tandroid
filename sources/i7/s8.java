package i7;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class s8 {
    public static long a(f5.w wVar, int i10, int i11) {
        wVar.C(i10);
        if (wVar.a() < 5) {
            return -9223372036854775807L;
        }
        int e10 = wVar.e();
        if ((8388608 & e10) != 0 || ((2096896 & e10) >> 8) != i11 || (e10 & 32) == 0 || wVar.r() < 7 || wVar.a() < 7 || (wVar.r() & 16) != 16) {
            return -9223372036854775807L;
        }
        wVar.c(0, 6, new byte[6]);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((255 & r0[4]) >> 7);
    }
}
