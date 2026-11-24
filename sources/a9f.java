// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class a9f extends wgf {
    private static final a9f zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private zgf zzg;
    private zgf zzh;
    private ehf zzi;
    private ehf zzj;
    private int zzk;

    static {
        a9f a9fVar = new a9f();
        zzb = a9fVar;
        wgf.e(a9f.class, a9fVar);
    }

    public a9f() {
        xgf xgfVar = xgf.d;
        this.zzg = xgfVar;
        this.zzh = xgfVar;
        sif sifVar = sif.d;
        this.zzi = sifVar;
        this.zzj = sifVar;
    }

    @Override // wgf
    public final Object h(int i, wgf wgfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tif(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001င\u0000\u0002᠌\u0001\u0003\u0016\u0004\u0016\u0005\u001a\u0006\u001a\u0007᠌\u0002", new Object[]{"zzd", "zze", "zzf", k4f.s, "zzg", "zzh", "zzi", "zzj", "zzk", jk2.r});
        }
        if (i2 == 3) {
            return new a9f();
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
