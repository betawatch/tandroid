package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class f3 extends c5 {
    private static final f3 zzb;
    private int zzd;
    private h5 zze;
    private h5 zzf;
    private k3 zzg;

    static {
        f3 f3Var = new f3();
        zzb = f3Var;
        c5.e(f3.class, f3Var);
    }

    public f3() {
        c6 c6Var = c6.d;
        this.zze = c6Var;
        this.zzf = c6Var;
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i10, c5 c5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new d6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"zzd", "zze", n3.class, "zzf", f2.class, "zzg"});
        }
        if (i11 == 3) {
            return new f3();
        }
        if (i11 == 4) {
            return new a3(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
