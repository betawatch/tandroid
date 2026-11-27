// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class c6e extends ese {
    private static final c6e zzj;
    private static volatile u0f zzk;
    private int zzc;
    private float zzd;
    private float zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;

    static {
        c6e c6eVar = new c6e();
        zzj = c6eVar;
        ese.g(c6e.class, c6eVar);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, u0f] */
    @Override // ese
    public final Object d(int i) {
        u0f u0fVar;
        switch (b7e.a[i - 1]) {
            case 1:
                return new c6e();
            case 2:
                return new p5e(zzj);
            case 3:
                return new j1f(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                u0f u0fVar2 = zzk;
                if (u0fVar2 != null) {
                    return u0fVar2;
                }
                synchronized (c6e.class) {
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
