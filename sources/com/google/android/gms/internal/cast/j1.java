package com.google.android.gms.internal.cast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class j1 extends h5 {
    private static final k5 zzb = new g1();
    private static final j1 zzd;
    private int zze;
    private n1 zzf;
    private z2 zzg;
    private m5 zzh = h6.d;
    private j5 zzi = i5.d;

    static {
        j1 j1Var = new j1();
        zzd = j1Var;
        h5.e(j1.class, j1Var);
    }

    public static i1 l() {
        return (i1) zzd.j();
    }

    public static /* synthetic */ void m(j1 j1Var, n1 n1Var) {
        j1Var.zzf = n1Var;
        j1Var.zze |= 1;
    }

    public static void n(j1 j1Var, ArrayList arrayList) {
        List list = j1Var.zzi;
        if (!((w4) list).a) {
            int size = list.size();
            int i10 = size == 0 ? 10 : size + size;
            i5 i5Var = (i5) list;
            if (i10 < i5Var.c) {
                throw new IllegalArgumentException();
            }
            j1Var.zzi = new i5(Arrays.copyOf(i5Var.b, i10), i5Var.c, true);
        }
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj = arrayList.get(i11);
            i11++;
            ((i5) j1Var.zzi).zzh(((f1) obj).a);
        }
    }

    @Override // com.google.android.gms.internal.cast.h5
    public final Object h(int i10, h5 h5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ࠞ", new Object[]{"zze", "zzf", "zzg", "zzh", x2.class, "zzi", b1.C});
        }
        if (i11 == 3) {
            return new j1();
        }
        if (i11 == 4) {
            return new i1(zzd);
        }
        if (i11 != 5) {
            return null;
        }
        return zzd;
    }
}
