// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class j4f extends wgf {
    private static final ahf zzb = new ied();
    private static final j4f zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private zgf zzh = xgf.d;

    static {
        j4f j4fVar = new j4f();
        zzd = j4fVar;
        wgf.e(j4f.class, j4fVar);
    }

    @Override // wgf
    public final Object h(int i, wgf wgfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tif(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ࠞ", new Object[]{"zze", "zzf", "zzg", "zzh", k1f.E});
        }
        if (i2 == 3) {
            return new j4f();
        }
        if (i2 == 4) {
            return new wae(zzd);
        }
        if (i2 != 5) {
            return null;
        }
        return zzd;
    }
}
