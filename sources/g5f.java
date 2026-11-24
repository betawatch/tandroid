// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class g5f extends wgf {
    private static final g5f zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private boolean zzh;
    private ehf zzi;
    private ehf zzj;
    private String zzk;

    static {
        g5f g5fVar = new g5f();
        zzb = g5fVar;
        wgf.e(g5f.class, g5fVar);
    }

    public g5f() {
        sif sifVar = sif.d;
        this.zzi = sifVar;
        this.zzj = sifVar;
        this.zzk = "";
    }

    @Override // wgf
    public final Object h(int i, wgf wgfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tif(zzb, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0007\u001b\b\u001b\tဈ\u0004", new Object[]{"zzd", "zze", kg7.h, "zzf", "zzg", jk2.r, "zzh", "zzi", zaf.class, "zzj", zaf.class, "zzk"});
        }
        if (i2 == 3) {
            return new g5f();
        }
        if (i2 == 4) {
            return new wae(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
