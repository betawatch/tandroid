// default package

import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class h1e extends nne {
    private static final h1e zzl;
    private static volatile dwe zzm;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private kpe zzf;
    private int zzg;
    private String zzh;
    private long zzi;
    private long zzj;
    private kpe zzk;

    static {
        h1e h1eVar = new h1e();
        zzl = h1eVar;
        nne.g(h1e.class, h1eVar);
    }

    public h1e() {
        uwe uweVar = uwe.d;
        this.zzf = uweVar;
        this.zzh = "";
        this.zzk = uweVar;
    }

    public static g1e m() {
        return (g1e) ((jne) zzl.d(5));
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [dwe, java.lang.Object] */
    @Override // nne
    public final Object d(int i) {
        dwe dweVar;
        switch (l2e.a[i - 1]) {
            case 1:
                return new h1e();
            case 2:
                return new g1e(zzl);
            case 3:
                return new swe(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဌ\u0002\u0005ဈ\u0003\u0006ဂ\u0004\u0007ဂ\u0005\b\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", b3e.c, "zzh", "zzi", "zzj", "zzk", v1e.class});
            case 4:
                return zzl;
            case 5:
                dwe dweVar2 = zzm;
                if (dweVar2 != null) {
                    return dweVar2;
                }
                synchronized (h1e.class) {
                    dwe dweVar3 = zzm;
                    dweVar = dweVar3;
                    if (dweVar3 == null) {
                        ?? ineVar = new ine();
                        zzm = ineVar;
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

    public final void j(long j) {
        this.zzc |= 16;
        this.zzi = j;
    }

    public final void k(List list) {
        kpe kpeVar = this.zzk;
        if (!kpeVar.zza()) {
            int size = kpeVar.size();
            this.zzk = kpeVar.zza(size == 0 ? 10 : size << 1);
        }
        qde.a(list, this.zzk);
    }

    public final void l(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    public final void n(long j) {
        this.zzc |= 32;
        this.zzj = j;
    }
}
