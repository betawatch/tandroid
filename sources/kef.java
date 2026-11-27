// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class kef extends ljf {
    private static final kef zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        kef kefVar = new kef();
        zzb = kefVar;
        ljf.e(kef.class, kefVar);
    }

    @Override // ljf
    public final Object h(int i, ljf ljfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            qf5 qf5Var = qf5.w;
            return new ilf(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", qf5Var, "zzf", qf5Var});
        }
        if (i2 == 3) {
            return new kef();
        }
        if (i2 == 4) {
            return new mdf(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
