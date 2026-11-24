// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class a4e extends qpe {
    private static final a4e zzi;
    private static volatile fye zzj;
    private int zzc;
    private h3e zzd;
    private v3e zze;
    private r3e zzf;
    private int zzg;
    private boolean zzh;

    static {
        a4e a4eVar = new a4e();
        zzi = a4eVar;
        qpe.g(a4e.class, a4eVar);
    }

    public static z3e k() {
        return (z3e) ((mpe) zzi.d(5));
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [fye, java.lang.Object] */
    @Override // qpe
    public final Object d(int i) {
        fye fyeVar;
        switch (o4e.a[i - 1]) {
            case 1:
                return new a4e();
            case 2:
                return new z3e(zzi);
            case 3:
                return new uye(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004င\u0003\u0005ဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                fye fyeVar2 = zzj;
                if (fyeVar2 != null) {
                    return fyeVar2;
                }
                synchronized (a4e.class) {
                    fye fyeVar3 = zzj;
                    fyeVar = fyeVar3;
                    if (fyeVar3 == null) {
                        ?? lpeVar = new lpe();
                        zzj = lpeVar;
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

    public final void j(r3e r3eVar) {
        this.zzf = r3eVar;
        this.zzc |= 4;
    }
}
