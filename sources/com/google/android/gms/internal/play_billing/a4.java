package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a4 extends v1 {
    private static final a4 zzb;
    private int zzd;
    private k3 zze;
    private long zzf;

    static {
        a4 a4Var = new a4();
        zzb = a4Var;
        v1.k(a4.class, a4Var);
    }

    public static /* synthetic */ void n(a4 a4Var, k3 k3Var) {
        a4Var.zze = k3Var;
        a4Var.zzd |= 1;
    }

    public static /* synthetic */ void o(a4 a4Var, long j10) {
        a4Var.zzd |= 2;
        a4Var.zzf = j10;
    }

    public static z3 p() {
        return (z3) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.v1
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new a4();
        }
        if (i11 == 4) {
            return new z3(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
