// default package

import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class k3e extends qpe {
    private static final k3e zzl;
    private static volatile fye zzm;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private nre zzf;
    private int zzg;
    private String zzh;
    private long zzi;
    private long zzj;
    private nre zzk;

    static {
        k3e k3eVar = new k3e();
        zzl = k3eVar;
        qpe.g(k3e.class, k3eVar);
    }

    public k3e() {
        wye wyeVar = wye.d;
        this.zzf = wyeVar;
        this.zzh = "";
        this.zzk = wyeVar;
    }

    public static j3e m() {
        return (j3e) ((mpe) zzl.d(5));
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [fye, java.lang.Object] */
    @Override // qpe
    public final Object d(int i) {
        fye fyeVar;
        switch (o4e.a[i - 1]) {
            case 1:
                return new k3e();
            case 2:
                return new j3e(zzl);
            case 3:
                return new uye(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဌ\u0002\u0005ဈ\u0003\u0006ဂ\u0004\u0007ဂ\u0005\b\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", e5e.c, "zzh", "zzi", "zzj", "zzk", y3e.class});
            case 4:
                return zzl;
            case 5:
                fye fyeVar2 = zzm;
                if (fyeVar2 != null) {
                    return fyeVar2;
                }
                synchronized (k3e.class) {
                    fye fyeVar3 = zzm;
                    fyeVar = fyeVar3;
                    if (fyeVar3 == null) {
                        ?? lpeVar = new lpe();
                        zzm = lpeVar;
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

    public final void j(long j) {
        this.zzc |= 16;
        this.zzi = j;
    }

    public final void k(List list) {
        nre nreVar = this.zzk;
        if (!nreVar.zza()) {
            int size = nreVar.size();
            this.zzk = nreVar.zza(size == 0 ? 10 : size << 1);
        }
        rfe.a(list, this.zzk);
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
