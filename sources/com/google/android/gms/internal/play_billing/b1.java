package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
            int i10 = r2Var.c + size2;
            int length = r2Var.b.length;
            if (i10 > length) {
                if (length != 0) {
                    while (length < i10) {
                        length = Math.max(((length * 3) / 2) + 1, 10);
                    }
                    r2Var.b = Arrays.copyOf(r2Var.b, length);
                } else {
                    r2Var.b = new Object[Math.max(i10, 10)];
                }
            }
        }
        int size3 = list.size();
        int size4 = arrayList.size();
        for (int i11 = 0; i11 < size4; i11++) {
            Object obj = arrayList.get(i11);
            if (obj == null) {
                String k10 = hc.b.k(list.size() - size3, "Element at index ", " is null.");
                int size5 = list.size();
                while (true) {
                    size5--;
                    if (size5 < size3) {
                        throw new NullPointerException(k10);
                    }
                    list.remove(size5);
                }
            } else {
                list.add(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.v1
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s2(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", z0.class});
        }
        if (i11 == 3) {
            return new b1();
        }
        if (i11 == 4) {
            return new a1(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
