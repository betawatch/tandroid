package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b1 extends v1 {
    private static final b1 zzb;
    private z1 zzd = r2.e;

    static {
        b1 b1Var = new b1();
        zzb = b1Var;
        v1.k(b1.class, b1Var);
    }

    public static a1 n() {
        return (a1) zzb.f();
    }

    public static void o(b1 b1Var, ArrayList arrayList) {
        z1 z1Var = b1Var.zzd;
        if (!((f1) z1Var).a) {
            int size = z1Var.size();
            b1Var.zzd = z1Var.zzd(size + size);
        }
        List list = b1Var.zzd;
        Charset charset = a2.a;
        int size2 = arrayList.size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size2);
        } else if (list instanceof r2) {
            r2 r2Var = (r2) list;
            int i3 = r2Var.c + size2;
            int length = r2Var.b.length;
            if (i3 > length) {
                if (length != 0) {
                    while (length < i3) {
                        length = Math.max(((length * 3) / 2) + 1, 10);
                    }
                    r2Var.b = Arrays.copyOf(r2Var.b, length);
                } else {
                    r2Var.b = new Object[Math.max(i3, 10)];
                }
            }
        }
        int size3 = list.size();
        int size4 = arrayList.size();
        for (int i10 = 0; i10 < size4; i10++) {
            Object obj = arrayList.get(i10);
            if (obj == null) {
                String j10 = k2.p1.j(list.size() - size3, "Element at index ", " is null.");
                int size5 = list.size();
                while (true) {
                    size5--;
                    if (size5 < size3) {
                        throw new NullPointerException(j10);
                    }
                    list.remove(size5);
                }
            } else {
                list.add(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.v1
    public final Object d(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new s2(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", z0.class});
        }
        if (i10 == 3) {
            return new b1();
        }
        if (i10 == 4) {
            return new a1(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
