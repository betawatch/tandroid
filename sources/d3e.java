// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class d3e extends qpe {
    private static final xqe zzd = new b7d((byte) 2);
    private static final d3e zze;
    private static volatile fye zzf;
    private cre zzc = qpe.i();

    /* JADX WARN: Type inference failed for: r0v0, types: [b7d, xqe] */
    static {
        d3e d3eVar = new d3e();
        zze = d3eVar;
        qpe.g(d3e.class, d3eVar);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [fye, java.lang.Object] */
    @Override // qpe
    public final Object d(int i) {
        fye fyeVar;
        switch (o4e.a[i - 1]) {
            case 1:
                return new d3e();
            case 2:
                return new c3e(zze);
            case 3:
                return new uye(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"zzc", e5e.h});
            case 4:
                return zze;
            case 5:
                fye fyeVar2 = zzf;
                if (fyeVar2 != null) {
                    return fyeVar2;
                }
                synchronized (d3e.class) {
                    fye fyeVar3 = zzf;
                    fyeVar = fyeVar3;
                    if (fyeVar3 == null) {
                        ?? lpeVar = new lpe();
                        zzf = lpeVar;
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
