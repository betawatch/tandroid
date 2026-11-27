// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class fve extends s6e {
    private static final fve zzb;
    private int zzd;
    private int zze;

    static {
        fve fveVar = new fve();
        zzb = fveVar;
        s6e.k(fve.class, fveVar);
    }

    public static fve n() {
        return zzb;
    }

    @Override // s6e
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lfe(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", ovd.i});
        }
        if (i2 == 3) {
            return new fve();
        }
        if (i2 == 4) {
            return new utd(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
