package com.google.android.gms.internal.cast;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class e1 extends b5 {
    private static final e5 zzb = new b1();
    private static final e1 zzd;
    private int zze;
    private i1 zzf;
    private u2 zzg;
    private g5 zzh = b6.d;
    private d5 zzi = c5.d;

    static {
        e1 e1Var = new e1();
        zzd = e1Var;
        b5.e(e1.class, e1Var);
    }

    public static d1 l() {
        return (d1) zzd.j();
    }

    public static /* synthetic */ void m(e1 e1Var, i1 i1Var) {
        e1Var.zzf = i1Var;
        e1Var.zze |= 1;
    }

    public static void n(e1 e1Var, ArrayList arrayList) {
        g5 g5Var = e1Var.zzi;
        if (!((r4) g5Var).a) {
            int size = g5Var.size();
            int i7 = size == 0 ? 10 : size + size;
            c5 c5Var = (c5) g5Var;
            if (i7 < c5Var.c) {
                throw new IllegalArgumentException();
            }
            e1Var.zzi = new c5(Arrays.copyOf(c5Var.b, i7), c5Var.c, true);
        }
        int size2 = arrayList.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj = arrayList.get(i10);
            i10++;
            ((c5) e1Var.zzi).zzh(((a1) obj).a);
        }
    }

    @Override // com.google.android.gms.internal.cast.b5
    public final Object h(int i7, b5 b5Var) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c6(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ࠞ", new Object[]{"zze", "zzf", "zzg", "zzh", s2.class, "zzi", w0.C});
        }
        if (i10 == 3) {
            return new e1();
        }
        if (i10 == 4) {
            return new d1(zzd);
        }
        if (i10 != 5) {
            return null;
        }
        return zzd;
    }
}
