// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class gle extends f4e {
    private static final gle zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private String zzf = "";
    private String zzh = "";

    static {
        gle gleVar = new gle();
        zzb = gleVar;
        f4e.k(gle.class, gleVar);
    }

    public static /* synthetic */ void n(gle gleVar, String str) {
        gleVar.zzd |= 8;
        gleVar.zzh = str;
    }

    public static /* synthetic */ void o(gle gleVar, String str) {
        str.getClass();
        gleVar.zzd |= 2;
        gleVar.zzf = str;
    }

    public static /* synthetic */ void p(gle gleVar, int i) {
        gleVar.zzd |= 16;
        gleVar.zzi = i;
    }

    public static void q(gle gleVar, int i) {
        gleVar.zzg = mlb.e(i);
        gleVar.zzd |= 4;
    }

    public static /* synthetic */ void r(gle gleVar, int i) {
        gleVar.zzd |= 1;
        gleVar.zze = i;
    }

    public static nke s() {
        return (nke) zzb.f();
    }

    @Override // f4e
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wce(zzb, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", btd.d, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new gle();
        }
        if (i2 == 4) {
            return new nke(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
