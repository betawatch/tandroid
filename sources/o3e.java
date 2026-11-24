// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class o3e extends qpe {
    private static final o3e zzj;
    private static volatile fye zzk;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private float zzi;

    static {
        o3e o3eVar = new o3e();
        zzj = o3eVar;
        qpe.g(o3e.class, o3eVar);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [fye, java.lang.Object] */
    @Override // qpe
    public final Object d(int i) {
        fye fyeVar;
        switch (o4e.a[i - 1]) {
            case 1:
                return new o3e();
            case 2:
                return new c3e(zzj);
            case 3:
                return new uye(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ခ\u0005", new Object[]{"zzc", "zzd", e5e.f, "zze", e5e.e, "zzf", e5e.d, "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                fye fyeVar2 = zzk;
                if (fyeVar2 != null) {
                    return fyeVar2;
                }
                synchronized (o3e.class) {
                    fye fyeVar3 = zzk;
                    fyeVar = fyeVar3;
                    if (fyeVar3 == null) {
                        ?? lpeVar = new lpe();
                        zzk = lpeVar;
                        fyeVar = lpeVar;
                    }
                }
                return fyeVar;
            case 6:
                return (byte) 1;
            default:
                gxc.b();
            case 7:
                return null;
        }
    }
}
