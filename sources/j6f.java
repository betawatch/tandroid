// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class j6f extends wgf {
    private static final j6f zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private boolean zzh;

    static {
        j6f j6fVar = new j6f();
        zzb = j6fVar;
        wgf.e(j6f.class, j6fVar);
    }

    public static h6f l() {
        return (h6f) zzb.j();
    }

    public static /* synthetic */ void m(j6f j6fVar, int i) {
        j6fVar.zzd |= 2;
        j6fVar.zzf = i;
    }

    public static /* synthetic */ void n(j6f j6fVar, int i) {
        j6fVar.zzd |= 4;
        j6fVar.zzg = i;
    }

    public static /* synthetic */ void o(j6f j6fVar, boolean z) {
        j6fVar.zzd |= 8;
        j6fVar.zzh = z;
    }

    public static /* synthetic */ void p(j6f j6fVar, int i) {
        j6fVar.zze = i - 1;
        j6fVar.zzd |= 1;
    }

    @Override // wgf
    public final Object h(int i, wgf wgfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tif(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", jk2.x, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new j6f();
        }
        if (i2 == 4) {
            return new h6f(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
