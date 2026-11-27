// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class lff extends ljf {
    private static final lff zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private tjf zzg;
    private tjf zzh;
    private int zzi;

    static {
        lff lffVar = new lff();
        zzb = lffVar;
        ljf.e(lff.class, lffVar);
    }

    public lff() {
        hlf hlfVar = hlf.d;
        this.zzg = hlfVar;
        this.zzh = hlfVar;
    }

    @Override // ljf
    public final Object h(int i, ljf ljfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ilf(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003\u001b\u0004\u001b\u0005᠌\u0002", new Object[]{"zzd", "zze", rj2.y, "zzf", qf5.y, "zzg", yaf.class, "zzh", yaf.class, "zzi", rj2.r});
        }
        if (i2 == 3) {
            return new lff();
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
