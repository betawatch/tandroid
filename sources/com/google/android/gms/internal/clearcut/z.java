package com.google.android.gms.internal.clearcut;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class z extends j {
    private static Map<Object, z> zzjr = new ConcurrentHashMap();
    protected d1 zzjp;
    private int zzjq;

    public z() {
        this.zzex = 0;
        this.zzjp = d1.e;
        this.zzjq = -1;
    }

    public static Object b(Method method, z zVar, Object... objArr) {
        try {
            return method.invoke(zVar, objArr);
        } catch (IllegalAccessException e9) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e9);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static void c(Class cls, z zVar) {
        zzjr.put(cls, zVar);
    }

    public static z d(Class cls) {
        z zVar = zzjr.get(cls);
        if (zVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zVar = zzjr.get(cls);
            } catch (ClassNotFoundException e9) {
                throw new IllegalStateException("Class initialization cannot fail.", e9);
            }
        }
        if (zVar != null) {
            return zVar;
        }
        String name = cls.getName();
        throw new IllegalStateException(name.length() != 0 ? "Unable to get default instance for: ".concat(name) : new String("Unable to get default instance for: "));
    }

    public abstract Object a(int i10);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((z) a(6)).getClass().isInstance(obj)) {
            return false;
        }
        w0 w0Var = w0.c;
        w0Var.getClass();
        return w0Var.a(getClass()).d(this, (z) obj);
    }

    public final int hashCode() {
        int i10 = this.zzex;
        if (i10 != 0) {
            return i10;
        }
        w0 w0Var = w0.c;
        w0Var.getClass();
        int e9 = w0Var.a(getClass()).e(this);
        this.zzex = e9;
        return e9;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        o1.i(this, sb2, 0);
        return sb2.toString();
    }
}
