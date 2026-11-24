// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class l1e extends nne {
    private static final l1e zzj;
    private static volatile dwe zzk;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private float zzi;

    static {
        l1e l1eVar = new l1e();
        zzj = l1eVar;
        nne.g(l1e.class, l1eVar);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [dwe, java.lang.Object] */
    @Override // nne
    public final Object d(int i) {
        dwe dweVar;
        switch (l2e.a[i - 1]) {
            case 1:
                return new l1e();
            case 2:
                return new z0e(zzj);
            case 3:
                return new swe(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ခ\u0005", new Object[]{"zzc", "zzd", b3e.f, "zze", b3e.e, "zzf", b3e.d, "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                dwe dweVar2 = zzk;
                if (dweVar2 != null) {
                    return dweVar2;
                }
                synchronized (l1e.class) {
                    dwe dweVar3 = zzk;
                    dweVar = dweVar3;
                    if (dweVar3 == null) {
                        ?? ineVar = new ine();
                        zzk = ineVar;
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
