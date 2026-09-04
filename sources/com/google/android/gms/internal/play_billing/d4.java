package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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

    public static /* synthetic */ void p(d4 d4Var, long j3) {
        d4Var.zzd |= 4;
        d4Var.zzg = j3;
    }

    public static /* synthetic */ void q(d4 d4Var) {
        d4Var.zzd |= 2;
        d4Var.zzf = true;
    }

    public static c4 r() {
        return (c4) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.v1
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s2(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new d4();
        }
        if (i11 == 4) {
            return new c4(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
