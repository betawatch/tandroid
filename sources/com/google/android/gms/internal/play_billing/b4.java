package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class b4 extends v1 {
    private static final b4 zzb;
    private int zzd;
    private l3 zze;
    private long zzf;

    static {
        b4 b4Var = new b4();
        zzb = b4Var;
        v1.k(b4.class, b4Var);
    }

    public static /* synthetic */ void n(b4 b4Var, l3 l3Var) {
        b4Var.zze = l3Var;
        b4Var.zzd |= 1;
    }

    public static /* synthetic */ void o(b4 b4Var, long j10) {
        b4Var.zzd |= 2;
        b4Var.zzf = j10;
    }

    public static a4 p() {
        return (a4) zzb.f();
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
            return new b4();
        }
        if (i11 == 4) {
            return new a4(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
