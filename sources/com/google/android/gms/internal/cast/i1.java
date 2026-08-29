package com.google.android.gms.internal.cast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i1 extends f5 {
    private static final i5 zzb = new f1();
    private static final i1 zzd;
    private int zze;
    private m1 zzf;
    private y2 zzg;
    private k5 zzh = f6.d;
    private h5 zzi = g5.d;

    static {
        i1 i1Var = new i1();
        zzd = i1Var;
        f5.e(i1.class, i1Var);
    }

    public static h1 l() {
        return (h1) zzd.j();
    }

    public static /* synthetic */ void m(i1 i1Var, m1 m1Var) {
        i1Var.zzf = m1Var;
        i1Var.zze |= 1;
    }

    public static void n(i1 i1Var, ArrayList arrayList) {
        List list = i1Var.zzi;
        if (!((u4) list).a) {
            int size = list.size();
            int i10 = size == 0 ? 10 : size + size;
            g5 g5Var = (g5) list;
            if (i10 < g5Var.c) {
                throw new IllegalArgumentException();
            }
            i1Var.zzi = new g5(Arrays.copyOf(g5Var.b, i10), g5Var.c, true);
        }
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj = arrayList.get(i11);
            i11++;
            ((g5) i1Var.zzi).zzh(((e1) obj).a);
        }
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i10, f5 f5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new g6(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ࠞ", new Object[]{"zze", "zzf", "zzg", "zzh", w2.class, "zzi", a1.C});
        }
        if (i11 == 3) {
            return new i1();
        }
        if (i11 == 4) {
            return new h1(zzd);
        }
        if (i11 != 5) {
            return null;
        }
        return zzd;
    }
}
