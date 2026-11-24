// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hqe extends f4e {
    private static final hqe zzb;
    private int zzd;
    private d5e zze = qce.e;
    private String zzf = "";
    private boolean zzg;

    static {
        hqe hqeVar = new hqe();
        zzb = hqeVar;
        f4e.k(hqe.class, hqeVar);
    }

    public static /* synthetic */ void n(hqe hqeVar, boolean z) {
        hqeVar.zzd |= 2;
        hqeVar.zzg = z;
    }

    public static hqe o() {
        return zzb;
    }

    @Override // f4e
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wce(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", ype.class, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new hqe();
        }
        if (i2 == 4) {
            return new ipe(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
