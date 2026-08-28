package com.google.android.gms.internal.clearcut;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class c1 {
    public static final Class a;
    public static final e1 b;
    public static final e1 c;
    public static final e1 d;

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
        d = new e1();
    }

    public static void a(e1 e1Var, Object obj, Object obj2) {
        e1Var.getClass();
        z zVar = (z) obj;
        d1 d1Var = zVar.zzjp;
        d1 d1Var2 = ((z) obj2).zzjp;
        if (!d1Var2.equals(d1.e)) {
            int i9 = d1Var.a + d1Var2.a;
            int[] copyOf = Arrays.copyOf(d1Var.b, i9);
            System.arraycopy(d1Var2.b, 0, copyOf, d1Var.a, d1Var2.a);
            Object[] copyOf2 = Arrays.copyOf(d1Var.c, i9);
            System.arraycopy(d1Var2.c, 0, copyOf2, d1Var.a, d1Var2.a);
            d1Var = new d1(i9, copyOf, copyOf2, true);
        }
        zVar.zzjp = d1Var;
    }

    public static e1 b(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (e1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
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
