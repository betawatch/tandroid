// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class c1e extends nne {
    private static final c1e zzd;
    private static volatile dwe zze;
    private kpe zzc = uwe.d;

    static {
        c1e c1eVar = new c1e();
        zzd = c1eVar;
        nne.g(c1e.class, c1eVar);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [dwe, java.lang.Object] */
    @Override // nne
    public final Object d(int i) {
        dwe dweVar;
        switch (l2e.a[i - 1]) {
            case 1:
                return new c1e();
            case 2:
                return new z0e(zzd);
            case 3:
                return new swe(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", u1e.class});
            case 4:
                return zzd;
            case 5:
                dwe dweVar2 = zze;
                if (dweVar2 != null) {
                    return dweVar2;
                }
                synchronized (c1e.class) {
                    dwe dweVar3 = zze;
                    dweVar = dweVar3;
                    if (dweVar3 == null) {
                        ?? ineVar = new ine();
                        zze = ineVar;
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
