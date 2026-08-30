package com.google.android.gms.internal.cast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class h1 extends e5 {
    private static final h5 zzb = new e1();
    private static final h1 zzd;
    private int zze;
    private l1 zzf;
    private x2 zzg;
    private j5 zzh = e6.d;
    private g5 zzi = f5.d;

    static {
        h1 h1Var = new h1();
        zzd = h1Var;
        e5.e(h1.class, h1Var);
    }

    public static g1 l() {
        return (g1) zzd.j();
    }

    public static /* synthetic */ void m(h1 h1Var, l1 l1Var) {
        h1Var.zzf = l1Var;
        h1Var.zze |= 1;
    }

    public static void n(h1 h1Var, ArrayList arrayList) {
        List list = h1Var.zzi;
        if (!((u4) list).a) {
            int size = list.size();
            int i10 = size == 0 ? 10 : size + size;
            f5 f5Var = (f5) list;
            if (i10 < f5Var.c) {
                throw new IllegalArgumentException();
            }
            h1Var.zzi = new f5(Arrays.copyOf(f5Var.b, i10), f5Var.c, true);
        }
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj = arrayList.get(i11);
            i11++;
            ((f5) h1Var.zzi).zzh(((d1) obj).a);
        }
    }

    @Override // com.google.android.gms.internal.cast.e5
    public final Object h(int i10, e5 e5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new f6(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ࠞ", new Object[]{"zze", "zzf", "zzg", "zzh", v2.class, "zzi", z0.C});
        }
        if (i11 == 3) {
            return new h1();
        }
        if (i11 == 4) {
            return new g1(zzd);
        }
        if (i11 != 5) {
            return null;
        }
        return zzd;
    }
}
