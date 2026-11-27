// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class edf extends ljf {
    private static final edf zzb;
    private int zzd;
    private long zze;
    private rjf zzf;
    private rjf zzg;

    static {
        edf edfVar = new edf();
        zzb = edfVar;
        ljf.e(edf.class, edfVar);
    }

    public edf() {
        pkf pkfVar = pkf.d;
        this.zzf = pkfVar;
        this.zzg = pkfVar;
    }

    @Override // ljf
    public final Object h(int i, ljf ljfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ilf(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001စ\u0000\u0002\u0017\u0003\u0017", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new edf();
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
