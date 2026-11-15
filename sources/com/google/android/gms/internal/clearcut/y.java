package com.google.android.gms.internal.clearcut;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class y extends i {
    private static Map<Object, y> zzjr = new ConcurrentHashMap();
    protected b1 zzjp;
    private int zzjq;

    public y() {
        this.zzex = 0;
        this.zzjp = b1.e;
        this.zzjq = -1;
    }

    public static Object b(Method method, y yVar, Object... objArr) {
        try {
            return method.invoke(yVar, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static void c(Class cls, y yVar) {
        zzjr.put(cls, yVar);
    }

    public static y d(Class cls) {
        y yVar = zzjr.get(cls);
        if (yVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                yVar = zzjr.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (yVar != null) {
            return yVar;
        }
        String name = cls.getName();
        throw new IllegalStateException(name.length() != 0 ? "Unable to get default instance for: ".concat(name) : new String("Unable to get default instance for: "));
    }

    public abstract Object a(int i7);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((y) a(6)).getClass().isInstance(obj)) {
            return false;
        }
        u0 u0Var = u0.c;
        u0Var.getClass();
        return u0Var.a(getClass()).d(this, (y) obj);
    }

    public final int hashCode() {
        int i7 = this.zzex;
        if (i7 != 0) {
            return i7;
        }
        u0 u0Var = u0.c;
        u0Var.getClass();
        int e10 = u0Var.a(getClass()).e(this);
        this.zzex = e10;
        return e10;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        l1.i(this, sb2, 0);
        return sb2.toString();
    }
}
