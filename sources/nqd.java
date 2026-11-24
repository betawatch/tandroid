// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class nqd extends c2e {
    private static final nqd zzb;
    private int zzd;
    private String zze = "";

    static {
        nqd nqdVar = new nqd();
        zzb = nqdVar;
        c2e.k(nqd.class, nqdVar);
    }

    @Override // c2e
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vae(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new nqd();
        }
        if (i2 == 4) {
            return new epd(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
