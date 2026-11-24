// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class a1e extends nne {
    private static final uoe zzd = new z4d((byte) 2);
    private static final a1e zze;
    private static volatile dwe zzf;
    private zoe zzc = nne.i();

    /* JADX WARN: Type inference failed for: r0v0, types: [uoe, z4d] */
    static {
        a1e a1eVar = new a1e();
        zze = a1eVar;
        nne.g(a1e.class, a1eVar);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [dwe, java.lang.Object] */
    @Override // nne
    public final Object d(int i) {
        dwe dweVar;
        switch (l2e.a[i - 1]) {
            case 1:
                return new a1e();
            case 2:
                return new z0e(zze);
            case 3:
                return new swe(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"zzc", b3e.h});
            case 4:
                return zze;
            case 5:
                dwe dweVar2 = zzf;
                if (dweVar2 != null) {
                    return dweVar2;
                }
                synchronized (a1e.class) {
                    dwe dweVar3 = zzf;
                    dweVar = dweVar3;
                    if (dweVar3 == null) {
                        ?? ineVar = new ine();
                        zzf = ineVar;
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
