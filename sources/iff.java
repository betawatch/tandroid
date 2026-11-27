// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class iff extends ljf {
    private static final iff zzb;
    private int zzd;
    private int zze;
    private tjf zzf;
    private tjf zzg;
    private int zzh;

    static {
        iff iffVar = new iff();
        zzb = iffVar;
        ljf.e(iff.class, iffVar);
    }

    public iff() {
        hlf hlfVar = hlf.d;
        this.zzf = hlfVar;
        this.zzg = hlfVar;
    }

    @Override // ljf
    public final Object h(int i, ljf ljfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ilf(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0003\u001b\u0004င\u0001", new Object[]{"zzd", "zze", uif.x, "zzf", odf.class, "zzg", odf.class, "zzh"});
        }
        if (i2 == 3) {
            return new iff();
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
