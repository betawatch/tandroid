package h7;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class z7 {
    public static long a(d5.z zVar, int i10, int i11) {
        zVar.C(i10);
        if (zVar.a() < 5) {
            return -9223372036854775807L;
        }
        int e9 = zVar.e();
        if ((8388608 & e9) != 0 || ((2096896 & e9) >> 8) != i11 || (e9 & 32) == 0 || zVar.r() < 7 || zVar.a() < 7 || (zVar.r() & 16) != 16) {
            return -9223372036854775807L;
        }
        zVar.c(0, 6, new byte[6]);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((255 & r0[4]) >> 7);
    }
}
