package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class c2 extends e5 {
    private static final c2 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        c2 c2Var = new c2();
        zzb = c2Var;
        e5.e(c2.class, c2Var);
    }

    public static b2 l() {
        return (b2) zzb.j();
    }

    public static /* synthetic */ void m(c2 c2Var, int i10) {
        c2Var.zzd |= 2;
        c2Var.zzf = i10;
    }

    public static /* synthetic */ void n(c2 c2Var, int i10) {
        c2Var.zze = i10 - 1;
        c2Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.e5
    public final Object h(int i10, e5 e5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new f6(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"zzd", "zze", z0.w, "zzf"});
        }
        if (i11 == 3) {
            return new c2();
        }
        if (i11 == 4) {
            return new b2(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
