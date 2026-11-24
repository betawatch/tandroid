// default package

/* loaded from: classes.dex */
public final class gde extends xkd {
    private static volatile dvd zzbg;
    private static final gde zzbiv;
    private int zzbb;
    private String zzbis = "";
    private long zzbit;
    private long zzbiu;
    private int zzya;

    static {
        gde gdeVar = new gde();
        zzbiv = gdeVar;
        xkd.c(gde.class, gdeVar);
    }

    public static fde j() {
        return (fde) ((vkd) zzbiv.a(5));
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [dvd, java.lang.Object] */
    @Override // xkd
    public final Object a(int i) {
        dvd dvdVar;
        switch (rde.a[i - 1]) {
            case 1:
                return new gde();
            case 2:
                return new fde(zzbiv);
            case 3:
                return new iwd(zzbiv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new Object[]{"zzbb", "zzya", "zzbis", "zzbit", "zzbiu"});
            case 4:
                return zzbiv;
            case 5:
                dvd dvdVar2 = zzbg;
                if (dvdVar2 != null) {
                    return dvdVar2;
                }
                synchronized (gde.class) {
                    dvd dvdVar3 = zzbg;
                    dvdVar = dvdVar3;
                    if (dvdVar3 == null) {
                        ?? wkdVar = new wkd();
                        zzbg = wkdVar;
                        dvdVar = wkdVar;
                    }
                }
                return dvdVar;
            case 6:
                return (byte) 1;
            default:
                gxc.b();
            case 7:
                return null;
        }
    }

    public final int e() {
        return this.zzya;
    }

    public final boolean f() {
        return (this.zzbb & 1) == 1;
    }

    public final String g() {
        return this.zzbis;
    }

    public final long h() {
        return this.zzbit;
    }

    public final long i() {
        return this.zzbiu;
    }

    public final void k(String str) {
        this.zzbb |= 2;
        this.zzbis = str;
    }

    public final void l(long j) {
        this.zzbb |= 4;
        this.zzbit = j;
    }

    public final void m(long j) {
        this.zzbb |= 8;
        this.zzbiu = j;
    }
}
