// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class d4f extends vef {
    private static final d4f zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        d4f d4fVar = new d4f();
        zzb = d4fVar;
        vef.e(d4f.class, d4fVar);
    }

    public static b4f l() {
        return (b4f) zzb.j();
    }

    public static /* synthetic */ void m(d4f d4fVar, int i) {
        d4fVar.zzd |= 2;
        d4fVar.zzf = i;
    }

    public static /* synthetic */ void n(d4f d4fVar, int i) {
        d4fVar.zzd |= 4;
        d4fVar.zzg = i;
    }

    public static /* synthetic */ void o(d4f d4fVar, int i) {
        d4fVar.zzd |= 8;
        d4fVar.zzh = i;
    }

    public static /* synthetic */ void p(d4f d4fVar, int i) {
        d4fVar.zzd |= 16;
        d4fVar.zzi = i;
    }

    public static /* synthetic */ void q(d4f d4fVar, int i) {
        d4fVar.zze = i - 1;
        d4fVar.zzd |= 1;
    }

    @Override // vef
    public final Object h(int i, vef vefVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new sgf(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzd", "zze", cff.y, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new d4f();
        }
        if (i2 == 4) {
            return new b4f(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
