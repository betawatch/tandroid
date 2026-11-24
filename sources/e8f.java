// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class e8f extends vef {
    private static final e8f zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        e8f e8fVar = new e8f();
        zzb = e8fVar;
        vef.e(e8f.class, e8fVar);
    }

    @Override // vef
    public final Object h(int i, vef vefVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new sgf(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new e8f();
        }
        if (i2 == 4) {
            return new v8e(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
