// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class b3e extends qpe {
    private static final b3e zzf;
    private static volatile fye zzg;
    private int zzc;
    private String zzd = "";
    private String zze = "";

    static {
        b3e b3eVar = new b3e();
        zzf = b3eVar;
        qpe.g(b3e.class, b3eVar);
    }

    public static a3e k() {
        return (a3e) ((mpe) zzf.d(5));
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [fye, java.lang.Object] */
    @Override // qpe
    public final Object d(int i) {
        fye fyeVar;
        switch (o4e.a[i - 1]) {
            case 1:
                return new b3e();
            case 2:
                return new a3e(zzf);
            case 3:
                return new uye(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                fye fyeVar2 = zzg;
                if (fyeVar2 != null) {
                    return fyeVar2;
                }
                synchronized (b3e.class) {
                    fye fyeVar3 = zzg;
                    fyeVar = fyeVar3;
                    if (fyeVar3 == null) {
                        ?? lpeVar = new lpe();
                        zzg = lpeVar;
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

    public final void j(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    public final void m(String str) {
        this.zzc |= 2;
        this.zze = str;
    }
}
