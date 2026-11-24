// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ecf extends wgf {
    private static final ecf zzb;
    private int zzd;
    private String zze = "";
    private ehf zzf;
    private ehf zzg;
    private boolean zzh;

    static {
        ecf ecfVar = new ecf();
        zzb = ecfVar;
        wgf.e(ecf.class, ecfVar);
    }

    public ecf() {
        sif sifVar = sif.d;
        this.zzf = sifVar;
        this.zzg = sifVar;
    }

    @Override // wgf
    public final Object h(int i, wgf wgfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tif(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001", new Object[]{"zzd", "zze", "zzf", g9f.class, "zzg", j8f.class, "zzh"});
        }
        if (i2 == 3) {
            return new ecf();
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
