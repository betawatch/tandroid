// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class cse extends f4e {
    private static final cse zzb;
    private int zzd;
    private gle zze;
    private long zzf;

    static {
        cse cseVar = new cse();
        zzb = cseVar;
        f4e.k(cse.class, cseVar);
    }

    public static /* synthetic */ void n(cse cseVar, gle gleVar) {
        cseVar.zze = gleVar;
        cseVar.zzd |= 1;
    }

    public static /* synthetic */ void o(cse cseVar, long j) {
        cseVar.zzd |= 2;
        cseVar.zzf = j;
    }

    public static rre p() {
        return (rre) zzb.f();
    }

    @Override // f4e
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wce(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new cse();
        }
        if (i2 == 4) {
            return new rre(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
