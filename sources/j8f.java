// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class j8f extends wgf {
    private static final j8f zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        j8f j8fVar = new j8f();
        zzb = j8fVar;
        wgf.e(j8f.class, j8fVar);
    }

    public static h8f l() {
        return (h8f) zzb.j();
    }

    public static /* synthetic */ void m(j8f j8fVar, String str) {
        str.getClass();
        j8fVar.zzd |= 1;
        j8fVar.zze = str;
    }

    @Override // wgf
    public final Object h(int i, wgf wgfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tif(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new j8f();
        }
        if (i2 == 4) {
            return new h8f(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
