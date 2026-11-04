package com.google.android.gms.internal.cast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f1 extends c5 {
    private static final f5 zzb = new c1();
    private static final f1 zzd;
    private int zze;
    private j1 zzf;
    private v2 zzg;
    private h5 zzh = c6.d;
    private e5 zzi = d5.d;

    static {
        f1 f1Var = new f1();
        zzd = f1Var;
        c5.e(f1.class, f1Var);
    }

    public static e1 l() {
        return (e1) zzd.j();
    }

    public static /* synthetic */ void m(f1 f1Var, j1 j1Var) {
        f1Var.zzf = j1Var;
        f1Var.zze |= 1;
    }

    public static void n(f1 f1Var, ArrayList arrayList) {
        List list = f1Var.zzi;
        if (!((s4) list).a) {
            int size = list.size();
            int i3 = size == 0 ? 10 : size + size;
            d5 d5Var = (d5) list;
            if (i3 < d5Var.c) {
                throw new IllegalArgumentException();
            }
            f1Var.zzi = new d5(Arrays.copyOf(d5Var.b, i3), d5Var.c, true);
        }
        int size2 = arrayList.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj = arrayList.get(i10);
            i10++;
            ((d5) f1Var.zzi).zzh(((b1) obj).a);
        }
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i3, c5 c5Var) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new d6(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ࠞ", new Object[]{"zze", "zzf", "zzg", "zzh", t2.class, "zzi", x0.C});
        }
        if (i10 == 3) {
            return new f1();
        }
        if (i10 == 4) {
            return new e1(zzd);
        }
        if (i10 != 5) {
            return null;
        }
        return zzd;
    }
}
