// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ldf extends wgf {
    private static final ldf zzb;
    private int zzd;
    private String zze = "";
    private long zzf;
    private long zzg;
    private mdf zzh;

    static {
        ldf ldfVar = new ldf();
        zzb = ldfVar;
        wgf.e(ldf.class, ldfVar);
    }

    @Override // wgf
    public final Object h(int i, wgf wgfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tif(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new ldf();
        }
        if (i2 == 4) {
            return new xaf(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
