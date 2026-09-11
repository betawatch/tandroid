package com.google.android.gms.internal.clearcut;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class a1 {
    public static final Class a;
    public static final c1 b;
    public static final c1 c;
    public static final c1 d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = b(false);
        c = b(true);
        d = new c1();
    }

    public static void a(c1 c1Var, Object obj, Object obj2) {
        c1Var.getClass();
        y yVar = (y) obj;
        b1 b1Var = yVar.zzjp;
        b1 b1Var2 = ((y) obj2).zzjp;
        if (!b1Var2.equals(b1.e)) {
            int i10 = b1Var.a + b1Var2.a;
            int[] copyOf = Arrays.copyOf(b1Var.b, i10);
            System.arraycopy(b1Var2.b, 0, copyOf, b1Var.a, b1Var2.a);
            Object[] copyOf2 = Arrays.copyOf(b1Var.c, i10);
            System.arraycopy(b1Var2.c, 0, copyOf2, b1Var.a, b1Var2.a);
            b1Var = new b1(i10, copyOf, copyOf2, true);
        }
        yVar.zzjp = b1Var;
    }

    public static c1 b(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (c1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
