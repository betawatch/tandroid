// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class gte extends f4e {
    private static final gte zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;

    static {
        gte gteVar = new gte();
        zzb = gteVar;
        f4e.k(gte.class, gteVar);
    }

    public static /* synthetic */ void n(gte gteVar, boolean z) {
        gteVar.zzd |= 8;
        gteVar.zzh = z;
    }

    public static /* synthetic */ void o(gte gteVar) {
        gteVar.zzd |= 16;
        gteVar.zzi = 0;
    }

    public static /* synthetic */ void p(gte gteVar, long j) {
        gteVar.zzd |= 4;
        gteVar.zzg = j;
    }

    public static /* synthetic */ void q(gte gteVar) {
        gteVar.zzd |= 2;
        gteVar.zzf = true;
    }

    public static yse r() {
        return (yse) zzb.f();
    }

    @Override // f4e
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wce(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new gte();
        }
        if (i2 == 4) {
            return new yse(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
