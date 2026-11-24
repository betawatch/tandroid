// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class o1e extends nne {
    private static final o1e zzg;
    private static volatile dwe zzh;
    private int zzc;
    private r1e zzd;
    private t1e zze;
    private kpe zzf = uwe.d;

    static {
        o1e o1eVar = new o1e();
        zzg = o1eVar;
        nne.g(o1e.class, o1eVar);
    }

    public static n1e l() {
        return (n1e) ((jne) zzg.d(5));
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [dwe, java.lang.Object] */
    @Override // nne
    public final Object d(int i) {
        dwe dweVar;
        switch (l2e.a[i - 1]) {
            case 1:
                return new o1e();
            case 2:
                return new n1e(zzg);
            case 3:
                return new swe(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", h1e.class});
            case 4:
                return zzg;
            case 5:
                dwe dweVar2 = zzh;
                if (dweVar2 != null) {
                    return dweVar2;
                }
                synchronized (o1e.class) {
                    dwe dweVar3 = zzh;
                    dweVar = dweVar3;
                    if (dweVar3 == null) {
                        ?? ineVar = new ine();
                        zzh = ineVar;
                        dweVar = ineVar;
                    }
                }
                return dweVar;
            case 6:
                return (byte) 1;
            default:
                fvc.b();
            case 7:
                return null;
        }
    }

    public final void j(r1e r1eVar) {
        this.zzd = r1eVar;
        this.zzc |= 1;
    }

    public final void k(ArrayList arrayList) {
        kpe kpeVar = this.zzf;
        if (!kpeVar.zza()) {
            int size = kpeVar.size();
            this.zzf = kpeVar.zza(size == 0 ? 10 : size << 1);
        }
        qde.a(arrayList, this.zzf);
    }
}
