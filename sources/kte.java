// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class kte extends s6e {
    private static final kte zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private cqe zzg;
    private oqe zzh;

    static {
        kte kteVar = new kte();
        zzb = kteVar;
        s6e.k(kte.class, kteVar);
    }

    public static /* synthetic */ void n(kte kteVar, wle wleVar) {
        kteVar.zzf = wleVar;
        kteVar.zze = 2;
    }

    public static /* synthetic */ void o(kte kteVar, wme wmeVar) {
        kteVar.zzf = wmeVar;
        kteVar.zze = 3;
    }

    public static /* synthetic */ void p(kte kteVar, moe moeVar) {
        moeVar.getClass();
        kteVar.zzf = moeVar;
        kteVar.zze = 7;
    }

    public static /* synthetic */ void q(kte kteVar, cqe cqeVar) {
        cqeVar.getClass();
        kteVar.zzg = cqeVar;
        kteVar.zzd |= 1;
    }

    public static /* synthetic */ void r(kte kteVar, que queVar) {
        kteVar.zzf = queVar;
        kteVar.zze = 8;
    }

    public static /* synthetic */ void s(kte kteVar, fve fveVar) {
        kteVar.zzf = fveVar;
        kteVar.zze = 4;
    }

    public static bte t() {
        return (bte) zzb.f();
    }

    @Override // s6e
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lfe(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", wle.class, wme.class, fve.class, mpe.class, "zzh", moe.class, que.class});
        }
        if (i2 == 3) {
            return new kte();
        }
        if (i2 == 4) {
            return new bte(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
