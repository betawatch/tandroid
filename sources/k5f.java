// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class k5f extends wgf {
    private static final k5f zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        k5f k5fVar = new k5f();
        zzb = k5fVar;
        wgf.e(k5f.class, k5fVar);
    }

    public static h5f l() {
        return (h5f) zzb.j();
    }

    public static /* synthetic */ void m(k5f k5fVar, String str) {
        str.getClass();
        k5fVar.zzd |= 1;
        k5fVar.zze = str;
    }

    public static /* synthetic */ void n(k5f k5fVar, String str) {
        str.getClass();
        k5fVar.zzd |= 2;
        k5fVar.zzf = str;
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
            return new k5f();
        }
        if (i2 == 4) {
            return new h5f(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
