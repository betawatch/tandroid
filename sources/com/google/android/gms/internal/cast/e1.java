package com.google.android.gms.internal.cast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class e1 extends c5 {
    private static final f5 zzb = new b1();
    private static final e1 zzd;
    private int zze;
    private i1 zzf;
    private u2 zzg;
    private h5 zzh = c6.d;
    private e5 zzi = d5.d;

    static {
        e1 e1Var = new e1();
        zzd = e1Var;
        c5.e(e1.class, e1Var);
    }

    public static d1 l() {
        return (d1) zzd.j();
    }

    public static /* synthetic */ void m(e1 e1Var, i1 i1Var) {
        e1Var.zzf = i1Var;
        e1Var.zze |= 1;
    }

    public static void n(e1 e1Var, ArrayList arrayList) {
        List list = e1Var.zzi;
        if (!((r4) list).a) {
            int size = list.size();
            int i10 = size == 0 ? 10 : size + size;
            d5 d5Var = (d5) list;
            if (i10 < d5Var.c) {
                throw new IllegalArgumentException();
            }
            e1Var.zzi = new d5(Arrays.copyOf(d5Var.b, i10), d5Var.c, true);
        }
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj = arrayList.get(i11);
            i11++;
            ((d5) e1Var.zzi).zzh(((a1) obj).a);
        }
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i10, c5 c5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new d6(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ࠞ", new Object[]{"zze", "zzf", "zzg", "zzh", s2.class, "zzi", w0.C});
        }
        if (i11 == 3) {
            return new e1();
        }
        if (i11 == 4) {
            return new d1(zzd);
        }
        if (i11 != 5) {
            return null;
        }
        return zzd;
    }
}
