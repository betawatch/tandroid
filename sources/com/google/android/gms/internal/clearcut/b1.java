package com.google.android.gms.internal.clearcut;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class b1 {
    public static final Class a;
    public static final d1 b;
    public static final d1 c;
    public static final d1 d;

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
        d = new d1();
    }

    public static void a(d1 d1Var, Object obj, Object obj2) {
        d1Var.getClass();
        z zVar = (z) obj;
        c1 c1Var = zVar.zzjp;
        c1 c1Var2 = ((z) obj2).zzjp;
        if (!c1Var2.equals(c1.e)) {
            int i10 = c1Var.a + c1Var2.a;
            int[] copyOf = Arrays.copyOf(c1Var.b, i10);
            System.arraycopy(c1Var2.b, 0, copyOf, c1Var.a, c1Var2.a);
            Object[] copyOf2 = Arrays.copyOf(c1Var.c, i10);
            System.arraycopy(c1Var2.c, 0, copyOf2, c1Var.a, c1Var2.a);
            c1Var = new c1(i10, copyOf, copyOf2, true);
        }
        zVar.zzjp = c1Var;
    }

    public static d1 b(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (d1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
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
