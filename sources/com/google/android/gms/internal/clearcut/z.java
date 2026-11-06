package com.google.android.gms.internal.clearcut;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class z extends j {
    private static Map<Object, z> zzjr = new ConcurrentHashMap();
    protected c1 zzjp;
    private int zzjq;

    public z() {
        this.zzex = 0;
        this.zzjp = c1.e;
        this.zzjq = -1;
    }

    public static Object b(Method method, z zVar, Object... objArr) {
        try {
            return method.invoke(zVar, objArr);
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

    public static void c(Class cls, z zVar) {
        zzjr.put(cls, zVar);
    }

    public static z d(Class cls) {
        z zVar = zzjr.get(cls);
        if (zVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zVar = zzjr.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zVar != null) {
            return zVar;
        }
        String name = cls.getName();
        throw new IllegalStateException(name.length() != 0 ? "Unable to get default instance for: ".concat(name) : new String("Unable to get default instance for: "));
    }

    public abstract Object a(int i7);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((z) a(6)).getClass().isInstance(obj)) {
            return false;
        }
        v0 v0Var = v0.c;
        v0Var.getClass();
        return v0Var.a(getClass()).d(this, (z) obj);
    }

    public final int hashCode() {
        int i7 = this.zzex;
        if (i7 != 0) {
            return i7;
        }
        v0 v0Var = v0.c;
        v0Var.getClass();
        int e10 = v0Var.a(getClass()).e(this);
        this.zzex = e10;
        return e10;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        m1.i(this, sb2, 0);
        return sb2.toString();
    }
}
