// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class bye {
    public static long a(yw7 yw7Var, int i, int i2) {
        yw7Var.N(i);
        if (yw7Var.a() < 5) {
            return -9223372036854775807L;
        }
        int m = yw7Var.m();
        if ((8388608 & m) != 0 || ((2096896 & m) >> 8) != i2 || (m & 32) == 0 || yw7Var.A() < 7 || yw7Var.a() < 7 || (yw7Var.A() & 16) != 16) {
            return -9223372036854775807L;
        }
        yw7Var.k(0, 6, new byte[6]);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((r0[4] & 255) >> 7);
    }
}
