// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class l6e extends ese {
    private static final l6e zzh;
    private static volatile u0f zzi;
    private int zzc;
    private s5e zzd;
    private int zze;
    private c6e zzf;
    private r5e zzg;

    static {
        l6e l6eVar = new l6e();
        zzh = l6eVar;
        ese.g(l6e.class, l6eVar);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, u0f] */
    @Override // ese
    public final Object d(int i) {
        u0f u0fVar;
        switch (b7e.a[i - 1]) {
            case 1:
                return new l6e();
            case 2:
                return new p5e(zzh);
            case 3:
                return new j1f(zzh, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0010ဉ\u0002\u0011ဉ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                u0f u0fVar2 = zzi;
                if (u0fVar2 != null) {
                    return u0fVar2;
                }
                synchronized (l6e.class) {
                    u0f u0fVar3 = zzi;
                    u0fVar = u0fVar3;
                    if (u0fVar3 == null) {
                        ?? zreVar = new zre();
                        zzi = zreVar;
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
