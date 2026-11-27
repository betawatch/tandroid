// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class dvd extends s6e {
    private static final dvd zzb;
    private int zzd;
    private String zze = "";

    static {
        dvd dvdVar = new dvd();
        zzb = dvdVar;
        s6e.k(dvd.class, dvdVar);
    }

    @Override // s6e
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lfe(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new dvd();
        }
        if (i2 == 4) {
            return new utd(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
