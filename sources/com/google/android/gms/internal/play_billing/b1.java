package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b1 extends u1 {
    private static final b1 zzb;
    private y1 zzd = q2.e;

    static {
        b1 b1Var = new b1();
        zzb = b1Var;
        u1.k(b1.class, b1Var);
    }

    public static a1 n() {
        return (a1) zzb.f();
    }

    public static void o(b1 b1Var, ArrayList arrayList) {
        y1 y1Var = b1Var.zzd;
        if (!((f1) y1Var).a) {
            int size = y1Var.size();
            b1Var.zzd = y1Var.zzd(size + size);
        }
        List list = b1Var.zzd;
        Charset charset = z1.a;
        int size2 = arrayList.size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size2);
        } else if (list instanceof q2) {
            q2 q2Var = (q2) list;
            int i10 = q2Var.c + size2;
            int length = q2Var.b.length;
            if (i10 > length) {
                if (length != 0) {
                    while (length < i10) {
                        length = Math.max(((length * 3) / 2) + 1, 10);
                    }
                    q2Var.b = Arrays.copyOf(q2Var.b, length);
                } else {
                    q2Var.b = new Object[Math.max(i10, 10)];
                }
            }
        }
        int size3 = list.size();
        int size4 = arrayList.size();
        for (int i11 = 0; i11 < size4; i11++) {
            Object obj = arrayList.get(i11);
            if (obj == null) {
                String l10 = j7.l1.l(list.size() - size3, "Element at index ", " is null.");
                int size5 = list.size();
                while (true) {
                    size5--;
                    if (size5 < size3) {
                        throw new NullPointerException(l10);
                    }
                    list.remove(size5);
                }
            } else {
                list.add(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.u1
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r2(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", z0.class});
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
