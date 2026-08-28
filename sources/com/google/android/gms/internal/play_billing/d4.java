package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d4 extends v1 {
    private static final d4 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;

    static {
        d4 d4Var = new d4();
        zzb = d4Var;
        v1.k(d4.class, d4Var);
    }

    public static /* synthetic */ void n(d4 d4Var, boolean z10) {
        d4Var.zzd |= 8;
        d4Var.zzh = z10;
    }

    public static /* synthetic */ void o(d4 d4Var) {
        d4Var.zzd |= 16;
        d4Var.zzi = 0;
    }

    public static /* synthetic */ void p(d4 d4Var, long j10) {
        d4Var.zzd |= 4;
        d4Var.zzg = j10;
    }

    public static /* synthetic */ void q(d4 d4Var) {
        d4Var.zzd |= 2;
        d4Var.zzf = true;
    }

    public static c4 r() {
        return (c4) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.v1
    public final Object d(int i9) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new s2(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i10 == 3) {
            return new d4();
        }
        if (i10 == 4) {
            return new c4(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
