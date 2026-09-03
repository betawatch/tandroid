package j7;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class c0 {
    public static long a(h5.w wVar, int i10, int i11) {
        wVar.F(i10);
        if (wVar.a() < 5) {
            return -9223372036854775807L;
        }
        int g10 = wVar.g();
        if ((8388608 & g10) != 0 || ((2096896 & g10) >> 8) != i11 || (g10 & 32) == 0 || wVar.u() < 7 || wVar.a() < 7 || (wVar.u() & 16) != 16) {
            return -9223372036854775807L;
        }
        wVar.e(0, 6, new byte[6]);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((255 & r0[4]) >> 7);
    }
}
