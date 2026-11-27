// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class eaf extends ljf {
    private static final eaf zzb;
    private int zzd;
    private String zze = "";
    private long zzf;

    static {
        eaf eafVar = new eaf();
        zzb = eafVar;
        ljf.e(eaf.class, eafVar);
    }

    @Override // ljf
    public final Object h(int i, ljf ljfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ilf(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new eaf();
        }
        if (i2 == 4) {
            return new lde(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
