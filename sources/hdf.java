// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class hdf extends ljf {
    private static final hdf zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    static {
        hdf hdfVar = new hdf();
        zzb = hdfVar;
        ljf.e(hdf.class, hdfVar);
    }

    @Override // ljf
    public final Object h(int i, ljf ljfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            z3f z3fVar = z3f.w;
            return new ilf(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007ဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", z3fVar, "zzj", z3fVar, "zzk"});
        }
        if (i2 == 3) {
            return new hdf();
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
