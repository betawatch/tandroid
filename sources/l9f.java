// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class l9f extends ljf {
    private static final l9f zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        l9f l9fVar = new l9f();
        zzb = l9fVar;
        ljf.e(l9f.class, l9fVar);
    }

    public static j9f l() {
        return (j9f) zzb.j();
    }

    public static /* synthetic */ void m(l9f l9fVar, int i) {
        l9fVar.zzd |= 2;
        l9fVar.zzf = i;
    }

    public static /* synthetic */ void n(l9f l9fVar, int i) {
        l9fVar.zze = i - 1;
        l9fVar.zzd |= 1;
    }

    @Override // ljf
    public final Object h(int i, ljf ljfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ilf(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"zzd", "zze", faf.y, "zzf"});
        }
        if (i2 == 3) {
            return new l9f();
        }
        if (i2 == 4) {
            return new j9f(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
