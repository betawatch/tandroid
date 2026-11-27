// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class g9f extends ljf {
    private static final g9f zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        g9f g9fVar = new g9f();
        zzb = g9fVar;
        ljf.e(g9f.class, g9fVar);
    }

    public static e9f l() {
        return (e9f) zzb.j();
    }

    public static /* synthetic */ void m(g9f g9fVar, int i) {
        g9fVar.zzd |= 2;
        g9fVar.zzf = i;
    }

    public static /* synthetic */ void n(g9f g9fVar, int i) {
        g9fVar.zzd |= 4;
        g9fVar.zzg = i;
    }

    public static /* synthetic */ void o(g9f g9fVar, int i) {
        g9fVar.zzd |= 8;
        g9fVar.zzh = i;
    }

    public static /* synthetic */ void p(g9f g9fVar, int i) {
        g9fVar.zze = i - 1;
        g9fVar.zzd |= 1;
    }

    @Override // ljf
    public final Object h(int i, ljf ljfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ilf(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", qf5.x, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new g9f();
        }
        if (i2 == 4) {
            return new e9f(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
