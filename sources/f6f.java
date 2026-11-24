// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class f6f extends wgf {
    private static final f6f zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        f6f f6fVar = new f6f();
        zzb = f6fVar;
        wgf.e(f6f.class, f6fVar);
    }

    public static d6f l() {
        return (d6f) zzb.j();
    }

    public static /* synthetic */ void m(f6f f6fVar, int i) {
        f6fVar.zzd |= 2;
        f6fVar.zzf = i;
    }

    public static /* synthetic */ void n(f6f f6fVar, int i) {
        f6fVar.zzd |= 4;
        f6fVar.zzg = i;
    }

    public static /* synthetic */ void o(f6f f6fVar, int i) {
        f6fVar.zzd |= 8;
        f6fVar.zzh = i;
    }

    public static /* synthetic */ void p(f6f f6fVar, int i) {
        f6fVar.zzd |= 16;
        f6fVar.zzi = i;
    }

    public static /* synthetic */ void q(f6f f6fVar, int i) {
        f6fVar.zze = i - 1;
        f6fVar.zzd |= 1;
    }

    @Override // wgf
    public final Object h(int i, wgf wgfVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tif(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzd", "zze", dhf.y, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new f6f();
        }
        if (i2 == 4) {
            return new d6f(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
