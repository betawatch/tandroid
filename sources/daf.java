// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class daf extends wgf {
    private static final daf zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        daf dafVar = new daf();
        zzb = dafVar;
        wgf.e(daf.class, dafVar);
    }

    @Override // wgf
    public final Object h(int i, wgf wgfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i2 == 2) {
            return new tif(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᴌ\u0000\u0002င\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", nf5.s, "zzf", "zzg", dhf.F});
        }
        if (i2 == 3) {
            return new daf();
        }
        if (i2 == 4) {
            return new wae(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzh = wgfVar == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
