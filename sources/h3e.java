// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class h3e extends qpe {
    private static final h3e zzl;
    private static volatile fye zzm;
    private int zzc;
    private boolean zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private boolean zzk;
    private String zzd = "";
    private String zzj = "";

    static {
        h3e h3eVar = new h3e();
        zzl = h3eVar;
        qpe.g(h3e.class, h3eVar);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [fye, java.lang.Object] */
    @Override // qpe
    public final Object d(int i) {
        fye fyeVar;
        switch (o4e.a[i - 1]) {
            case 1:
                return new h3e();
            case 2:
                return new c3e(zzl);
            case 3:
                return new uye(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဈ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", e5e.b, "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                fye fyeVar2 = zzm;
                if (fyeVar2 != null) {
                    return fyeVar2;
                }
                synchronized (h3e.class) {
                    fye fyeVar3 = zzm;
                    fyeVar = fyeVar3;
                    if (fyeVar3 == null) {
                        ?? lpeVar = new lpe();
                        zzm = lpeVar;
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
