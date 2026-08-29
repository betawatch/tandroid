package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c4 extends u1 {
    private static final c4 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;

    static {
        c4 c4Var = new c4();
        zzb = c4Var;
        u1.k(c4.class, c4Var);
    }

    public static /* synthetic */ void n(c4 c4Var, boolean z10) {
        c4Var.zzd |= 8;
        c4Var.zzh = z10;
    }

    public static /* synthetic */ void o(c4 c4Var) {
        c4Var.zzd |= 16;
        c4Var.zzi = 0;
    }

    public static /* synthetic */ void p(c4 c4Var, long j10) {
        c4Var.zzd |= 4;
        c4Var.zzg = j10;
    }

    public static /* synthetic */ void q(c4 c4Var) {
        c4Var.zzd |= 2;
        c4Var.zzf = true;
    }

    public static b4 r() {
        return (b4) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.u1
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r2(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new c4();
        }
        if (i11 == 4) {
            return new b4(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
