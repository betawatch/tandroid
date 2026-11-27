// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class o5e extends ese {
    private static final o5e zzf;
    private static volatile u0f zzg;
    private int zzc;
    private String zzd = "";
    private String zze = "";

    static {
        o5e o5eVar = new o5e();
        zzf = o5eVar;
        ese.g(o5e.class, o5eVar);
    }

    public static n5e k() {
        return (n5e) ((ase) zzf.d(5));
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, u0f] */
    @Override // ese
    public final Object d(int i) {
        u0f u0fVar;
        switch (b7e.a[i - 1]) {
            case 1:
                return new o5e();
            case 2:
                return new n5e(zzf);
            case 3:
                return new j1f(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                u0f u0fVar2 = zzg;
                if (u0fVar2 != null) {
                    return u0fVar2;
                }
                synchronized (o5e.class) {
                    u0f u0fVar3 = zzg;
                    u0fVar = u0fVar3;
                    if (u0fVar3 == null) {
                        ?? zreVar = new zre();
                        zzg = zreVar;
                        u0fVar = zreVar;
                    }
                }
                return u0fVar;
            case 6:
                return (byte) 1;
            default:
                p3d.a();
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
