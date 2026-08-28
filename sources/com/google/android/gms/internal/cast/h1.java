package com.google.android.gms.internal.cast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h1 extends f5 {
    private static final i5 zzb = new e1();
    private static final h1 zzd;
    private int zze;
    private l1 zzf;
    private x2 zzg;
    private k5 zzh = f6.d;
    private h5 zzi = g5.d;

    static {
        h1 h1Var = new h1();
        zzd = h1Var;
        f5.e(h1.class, h1Var);
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
            int i9 = size == 0 ? 10 : size + size;
            g5 g5Var = (g5) list;
            if (i9 < g5Var.c) {
                throw new IllegalArgumentException();
            }
            h1Var.zzi = new g5(Arrays.copyOf(g5Var.b, i9), g5Var.c, true);
        }
        int size2 = arrayList.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj = arrayList.get(i10);
            i10++;
            ((g5) h1Var.zzi).zzh(((d1) obj).a);
        }
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i9, f5 f5Var) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ࠞ", new Object[]{"zze", "zzf", "zzg", "zzh", v2.class, "zzi", z0.C});
        }
        if (i10 == 3) {
            return new h1();
        }
        if (i10 == 4) {
            return new g1(zzd);
        }
        if (i10 != 5) {
            return null;
        }
        return zzd;
    }
}
