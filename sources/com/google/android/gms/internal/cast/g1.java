package com.google.android.gms.internal.cast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class g1 extends d5 {
    private static final g5 zzb = new d1();
    private static final g1 zzd;
    private int zze;
    private k1 zzf;
    private w2 zzg;
    private i5 zzh = d6.d;
    private f5 zzi = e5.d;

    static {
        g1 g1Var = new g1();
        zzd = g1Var;
        d5.e(g1.class, g1Var);
    }

    public static f1 l() {
        return (f1) zzd.j();
    }

    public static /* synthetic */ void m(g1 g1Var, k1 k1Var) {
        g1Var.zzf = k1Var;
        g1Var.zze |= 1;
    }

    public static void n(g1 g1Var, ArrayList arrayList) {
        List list = g1Var.zzi;
        if (!((t4) list).a) {
            int size = list.size();
            int i10 = size == 0 ? 10 : size + size;
            e5 e5Var = (e5) list;
            if (i10 < e5Var.c) {
                throw new IllegalArgumentException();
            }
            g1Var.zzi = new e5(Arrays.copyOf(e5Var.b, i10), e5Var.c, true);
        }
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj = arrayList.get(i11);
            i11++;
            ((e5) g1Var.zzi).zzh(((c1) obj).a);
        }
    }

    @Override // com.google.android.gms.internal.cast.d5
    public final Object h(int i10, d5 d5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new e6(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ࠞ", new Object[]{"zze", "zzf", "zzg", "zzh", u2.class, "zzi", y0.C});
        }
        if (i11 == 3) {
            return new g1();
        }
        if (i11 == 4) {
            return new f1(zzd);
        }
        if (i11 != 5) {
            return null;
        }
        return zzd;
    }
}
