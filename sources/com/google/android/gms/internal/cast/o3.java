package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class o3 extends b5 {
    private static final o3 zzb;
    private int zzd;
    private int zze;
    private g5 zzf;
    private g5 zzg;
    private int zzh;

    static {
        o3 o3Var = new o3();
        zzb = o3Var;
        b5.e(o3.class, o3Var);
    }

    public o3() {
        b6 b6Var = b6.d;
        this.zzf = b6Var;
        this.zzg = b6Var;
    }

    @Override // com.google.android.gms.internal.cast.b5
    public final Object h(int i7, b5 b5Var) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0003\u001b\u0004င\u0001", new Object[]{"zzd", "zze", w0.x, "zzf", b3.class, "zzg", b3.class, "zzh"});
        }
        if (i10 == 3) {
            return new o3();
        }
        if (i10 == 4) {
            return new a3(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
