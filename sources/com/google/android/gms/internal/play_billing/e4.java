package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class e4 extends v1 {
    private static final e4 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;

    static {
        e4 e4Var = new e4();
        zzb = e4Var;
        v1.k(e4.class, e4Var);
    }

    public static /* synthetic */ void n(e4 e4Var, boolean z10) {
        e4Var.zzd |= 8;
        e4Var.zzh = z10;
    }

    public static /* synthetic */ void o(e4 e4Var) {
        e4Var.zzd |= 16;
        e4Var.zzi = 0;
    }

    public static /* synthetic */ void p(e4 e4Var, long j10) {
        e4Var.zzd |= 4;
        e4Var.zzg = j10;
    }

    public static /* synthetic */ void q(e4 e4Var) {
        e4Var.zzd |= 2;
        e4Var.zzf = true;
    }

    public static d4 r() {
        return (d4) zzb.f();
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
            return new e4();
        }
        if (i11 == 4) {
            return new d4(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
