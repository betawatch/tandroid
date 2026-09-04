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
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e7);
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

    public static void c(Class cls, y yVar) {
        zzjr.put(cls, yVar);
    }

    public static y d(Class cls) {
        y yVar = zzjr.get(cls);
        if (yVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                yVar = zzjr.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (yVar != null) {
            return yVar;
        }
        String name = cls.getName();
        throw new IllegalStateException(name.length() != 0 ? "Unable to get default instance for: ".concat(name) : new String("Unable to get default instance for: "));
    }

    public abstract Object a(int i10);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((y) a(6)).getClass().isInstance(obj)) {
            return false;
        }
        v0 v0Var = v0.c;
        v0Var.getClass();
        return v0Var.a(getClass()).d(this, (y) obj);
    }

    public final int hashCode() {
        int i10 = this.zzex;
        if (i10 != 0) {
            return i10;
        }
        v0 v0Var = v0.c;
        v0Var.getClass();
        int e7 = v0Var.a(getClass()).e(this);
        this.zzex = e7;
        return e7;
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
