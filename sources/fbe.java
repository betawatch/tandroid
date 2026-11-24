// default package

/* loaded from: classes.dex */
public final class fbe extends vid {
    private static volatile atd zzbg;
    private static final fbe zzbiv;
    private int zzbb;
    private String zzbis = "";
    private long zzbit;
    private long zzbiu;
    private int zzya;

    static {
        fbe fbeVar = new fbe();
        zzbiv = fbeVar;
        vid.c(fbe.class, fbeVar);
    }

    public static ebe j() {
        return (ebe) ((tid) zzbiv.a(5));
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [atd, java.lang.Object] */
    @Override // vid
    public final Object a(int i) {
        atd atdVar;
        switch (qbe.a[i - 1]) {
            case 1:
                return new fbe();
            case 2:
                return new ebe(zzbiv);
            case 3:
                return new fud(zzbiv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new Object[]{"zzbb", "zzya", "zzbis", "zzbit", "zzbiu"});
            case 4:
                return zzbiv;
            case 5:
                atd atdVar2 = zzbg;
                if (atdVar2 != null) {
                    return atdVar2;
                }
                synchronized (fbe.class) {
                    atd atdVar3 = zzbg;
                    atdVar = atdVar3;
                    if (atdVar3 == null) {
                        ?? uidVar = new uid();
                        zzbg = uidVar;
                        atdVar = uidVar;
                    }
                }
                return atdVar;
            case 6:
                return (byte) 1;
            default:
                fvc.b();
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
