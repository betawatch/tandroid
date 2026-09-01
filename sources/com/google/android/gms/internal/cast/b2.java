package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class b2 extends d5 {
    private static final b2 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        b2 b2Var = new b2();
        zzb = b2Var;
        d5.e(b2.class, b2Var);
    }

    public static a2 l() {
        return (a2) zzb.j();
    }

    public static /* synthetic */ void m(b2 b2Var, int i10) {
        b2Var.zzd |= 2;
        b2Var.zzf = i10;
    }

    public static /* synthetic */ void n(b2 b2Var, int i10) {
        b2Var.zze = i10 - 1;
        b2Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.d5
    public final Object h(int i10, d5 d5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new e6(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"zzd", "zze", y0.w, "zzf"});
        }
        if (i11 == 3) {
            return new b2();
        }
        if (i11 == 4) {
            return new a2(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
