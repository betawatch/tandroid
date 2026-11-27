// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class i6e extends ese {
    private static final i6e zzj;
    private static volatile u0f zzk;
    private int zzc;
    private long zze;
    private o5e zzf;
    private b6e zzh;
    private q5e zzi;
    private String zzd = "";
    private String zzg = "";

    static {
        i6e i6eVar = new i6e();
        zzj = i6eVar;
        ese.g(i6e.class, i6eVar);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, u0f] */
    @Override // ese
    public final Object d(int i) {
        u0f u0fVar;
        switch (b7e.a[i - 1]) {
            case 1:
                return new i6e();
            case 2:
                return new p5e(zzj);
            case 3:
                return new j1f(zzj, "\u0001\u0006\u0000\u0001\u0001\u0011\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0006ဈ\u0003\u0010ဉ\u0004\u0011ဉ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                u0f u0fVar2 = zzk;
                if (u0fVar2 != null) {
                    return u0fVar2;
                }
                synchronized (i6e.class) {
                    u0f u0fVar3 = zzk;
                    u0fVar = u0fVar3;
                    if (u0fVar3 == null) {
                        ?? zreVar = new zre();
                        zzk = zreVar;
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
}
