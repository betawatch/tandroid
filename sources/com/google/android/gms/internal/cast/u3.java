package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class u3 extends h5 {
    private static final u3 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private m5 zzg;
    private m5 zzh;
    private int zzi;

    static {
        u3 u3Var = new u3();
        zzb = u3Var;
        h5.e(u3.class, u3Var);
    }

    public u3() {
        h6 h6Var = h6.d;
        this.zzg = h6Var;
        this.zzh = h6Var;
    }

    @Override // com.google.android.gms.internal.cast.h5
    public final Object h(int i10, h5 h5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003\u001b\u0004\u001b\u0005᠌\u0002", new Object[]{"zzd", "zze", b1.y, "zzf", b1.z, "zzg", m2.class, "zzh", m2.class, "zzi", b0.O});
        }
        if (i11 == 3) {
            return new u3();
        }
        if (i11 == 4) {
            return new f3(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
