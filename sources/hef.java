// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class hef extends ljf {
    private static final hef zzb;
    private int zzd;
    private tjf zze;
    private tjf zzf;
    private wef zzg;

    static {
        hef hefVar = new hef();
        zzb = hefVar;
        ljf.e(hef.class, hefVar);
    }

    public hef() {
        hlf hlfVar = hlf.d;
        this.zze = hlfVar;
        this.zzf = hlfVar;
    }

    @Override // ljf
    public final Object h(int i, ljf ljfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ilf(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"zzd", "zze", fff.class, "zzf", taf.class, "zzg"});
        }
        if (i2 == 3) {
            return new hef();
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
