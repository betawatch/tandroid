// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class f3e extends qpe {
    private static final f3e zzd;
    private static volatile fye zze;
    private nre zzc = wye.d;

    static {
        f3e f3eVar = new f3e();
        zzd = f3eVar;
        qpe.g(f3e.class, f3eVar);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [fye, java.lang.Object] */
    @Override // qpe
    public final Object d(int i) {
        fye fyeVar;
        switch (o4e.a[i - 1]) {
            case 1:
                return new f3e();
            case 2:
                return new c3e(zzd);
            case 3:
                return new uye(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", x3e.class});
            case 4:
                return zzd;
            case 5:
                fye fyeVar2 = zze;
                if (fyeVar2 != null) {
                    return fyeVar2;
                }
                synchronized (f3e.class) {
                    fye fyeVar3 = zze;
                    fyeVar = fyeVar3;
                    if (fyeVar3 == null) {
                        ?? lpeVar = new lpe();
                        zze = lpeVar;
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
