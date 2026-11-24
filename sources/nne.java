// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class nne extends f4e {
    private static final nne zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private int zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private long zzn;

    static {
        nne nneVar = new nne();
        zzb = nneVar;
        f4e.k(nne.class, nneVar);
    }

    public static /* synthetic */ void n(nne nneVar, int i) {
        nneVar.zzd |= 128;
        nneVar.zzl = i;
    }

    public static /* synthetic */ void o(nne nneVar, int i) {
        nneVar.zzd |= 256;
        nneVar.zzm = i;
    }

    public static /* synthetic */ void p(nne nneVar, int i) {
        nneVar.zzd |= 8;
        nneVar.zzh = i;
    }

    public static /* synthetic */ void q(nne nneVar, long j) {
        nneVar.zzd |= 16;
        nneVar.zzi = j;
    }

    public static /* synthetic */ void r(nne nneVar, long j) {
        nneVar.zzd |= 32;
        nneVar.zzj = j;
    }

    public static /* synthetic */ void s(nne nneVar) {
        nneVar.zzd |= 512;
        nneVar.zzn = 772604006L;
    }

    public static /* synthetic */ void t(nne nneVar, String str) {
        str.getClass();
        nneVar.zzd |= 4;
        nneVar.zzg = str;
    }

    public static /* synthetic */ void u(nne nneVar) {
        nneVar.zzd |= 64;
        nneVar.zzk = false;
    }

    public static /* synthetic */ void v(nne nneVar) {
        nneVar.zzd |= 1;
        nneVar.zze = "8.0.0";
    }

    public static /* synthetic */ void w(nne nneVar, String str) {
        nneVar.zzd |= 2;
        nneVar.zzf = str;
    }

    public static cne x() {
        return (cne) zzb.f();
    }

    @Override // f4e
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wce(zzb, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t", new Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzf", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i2 == 3) {
            return new nne();
        }
        if (i2 == 4) {
            return new cne(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
