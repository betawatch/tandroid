// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class k6e extends ese {
    private static final k6e zzf;
    private static volatile u0f zzg;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        k6e k6eVar = new k6e();
        zzf = k6eVar;
        ese.g(k6e.class, k6eVar);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, u0f] */
    @Override // ese
    public final Object d(int i) {
        u0f u0fVar;
        switch (b7e.a[i - 1]) {
            case 1:
                return new k6e();
            case 2:
                return new p5e(zzf);
            case 3:
                return new j1f(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                u0f u0fVar2 = zzg;
                if (u0fVar2 != null) {
                    return u0fVar2;
                }
                synchronized (k6e.class) {
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
}
