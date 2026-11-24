// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class dre extends c2e {
    private static final dre zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;

    static {
        dre dreVar = new dre();
        zzb = dreVar;
        c2e.k(dre.class, dreVar);
    }

    public static /* synthetic */ void n(dre dreVar, boolean z) {
        dreVar.zzd |= 8;
        dreVar.zzh = z;
    }

    public static /* synthetic */ void o(dre dreVar) {
        dreVar.zzd |= 16;
        dreVar.zzi = 0;
    }

    public static /* synthetic */ void p(dre dreVar, long j) {
        dreVar.zzd |= 4;
        dreVar.zzg = j;
    }

    public static /* synthetic */ void q(dre dreVar) {
        dreVar.zzd |= 2;
        dreVar.zzf = true;
    }

    public static vqe r() {
        return (vqe) zzb.f();
    }

    @Override // c2e
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vae(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new dre();
        }
        if (i2 == 4) {
            return new vqe(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
