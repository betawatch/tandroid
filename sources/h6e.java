// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class h6e extends ese {
    private static final h6e zzi;
    private static volatile u0f zzj;
    private int zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        h6e h6eVar = new h6e();
        zzi = h6eVar;
        ese.g(h6e.class, h6eVar);
    }

    public static g6e j() {
        return (g6e) ((ase) zzi.d(5));
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, u0f] */
    @Override // ese
    public final Object d(int i) {
        u0f u0fVar;
        switch (b7e.a[i - 1]) {
            case 1:
                return new h6e();
            case 2:
                return new g6e(zzi);
            case 3:
                return new j1f(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0004\u0005ဂ\u0003", new Object[]{"zzc", "zzd", r7e.g, "zze", "zzf", "zzh", "zzg"});
            case 4:
                return zzi;
            case 5:
                u0f u0fVar2 = zzj;
                if (u0fVar2 != null) {
                    return u0fVar2;
                }
                synchronized (h6e.class) {
                    u0f u0fVar3 = zzj;
                    u0fVar = u0fVar3;
                    if (u0fVar3 == null) {
                        ?? zreVar = new zre();
                        zzj = zreVar;
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

    public final void k(long j) {
        this.zzc |= 2;
        this.zze = j;
    }

    public final void l(long j) {
        this.zzc |= 4;
        this.zzf = j;
    }

    public final void m(long j) {
        this.zzc |= 8;
        this.zzg = j;
    }

    public final void n(long j) {
        this.zzc |= 16;
        this.zzh = j;
    }
}
