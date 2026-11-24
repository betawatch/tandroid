// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class b1e extends nne {
    private static final b1e zzg;
    private static volatile dwe zzh;
    private int zzc;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        b1e b1eVar = new b1e();
        zzg = b1eVar;
        nne.g(b1e.class, b1eVar);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [dwe, java.lang.Object] */
    @Override // nne
    public final Object d(int i) {
        dwe dweVar;
        switch (l2e.a[i - 1]) {
            case 1:
                return new b1e();
            case 2:
                return new z0e(zzg);
            case 3:
                return new swe(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"zzc", "zzd", b3e.h, "zze", b3e.i, "zzf"});
            case 4:
                return zzg;
            case 5:
                dwe dweVar2 = zzh;
                if (dweVar2 != null) {
                    return dweVar2;
                }
                synchronized (b1e.class) {
                    dwe dweVar3 = zzh;
                    dweVar = dweVar3;
                    if (dweVar3 == null) {
                        ?? ineVar = new ine();
                        zzh = ineVar;
                        dweVar = ineVar;
                    }
                }
                return dweVar;
            case 6:
                return (byte) 1;
            default:
                fvc.b();
            case 7:
                return null;
        }
    }
}
