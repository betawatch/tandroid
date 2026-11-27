// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class e6e extends ese {
    private static final e6e zzg;
    private static volatile u0f zzh;
    private int zzc;
    private h6e zzd;
    private j6e zze;
    private bue zzf = l1f.d;

    static {
        e6e e6eVar = new e6e();
        zzg = e6eVar;
        ese.g(e6e.class, e6eVar);
    }

    public static d6e l() {
        return (d6e) ((ase) zzg.d(5));
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, u0f] */
    @Override // ese
    public final Object d(int i) {
        u0f u0fVar;
        switch (b7e.a[i - 1]) {
            case 1:
                return new e6e();
            case 2:
                return new d6e(zzg);
            case 3:
                return new j1f(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", x5e.class});
            case 4:
                return zzg;
            case 5:
                u0f u0fVar2 = zzh;
                if (u0fVar2 != null) {
                    return u0fVar2;
                }
                synchronized (e6e.class) {
                    u0f u0fVar3 = zzh;
                    u0fVar = u0fVar3;
                    if (u0fVar3 == null) {
                        ?? zreVar = new zre();
                        zzh = zreVar;
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

    public final void j(h6e h6eVar) {
        this.zzd = h6eVar;
        this.zzc |= 1;
    }

    public final void k(ArrayList arrayList) {
        bue bueVar = this.zzf;
        if (!bueVar.zza()) {
            int size = bueVar.size();
            this.zzf = bueVar.zza(size == 0 ? 10 : size << 1);
        }
        hie.a(arrayList, this.zzf);
    }
}
