package b8;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class ud {
    public static long a(g2.y yVar, int i3, int i10) {
        yVar.N(i3);
        if (yVar.a() < 5) {
            return -9223372036854775807L;
        }
        int m10 = yVar.m();
        if ((8388608 & m10) != 0 || ((2096896 & m10) >> 8) != i10 || (m10 & 32) == 0 || yVar.A() < 7 || yVar.a() < 7 || (yVar.A() & 16) != 16) {
            return -9223372036854775807L;
        }
        yVar.k(0, 6, new byte[6]);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((255 & r0[4]) >> 7);
    }
}
