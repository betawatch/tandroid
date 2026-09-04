package androidx.datastore.preferences.protobuf;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class w extends a {
    private static Map<Object, w> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize;
    protected i1 unknownFields;

    public w() {
        this.memoizedHashCode = 0;
        this.unknownFields = i1.f;
        this.memoizedSerializedSize = -1;
    }

    public static w e(Class cls) {
        w wVar = defaultInstanceMap.get(cls);
        if (wVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                wVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = (w) ((w) r1.a(cls)).d(6);
        if (wVar2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, wVar2);
        return wVar2;
    }

    public static Object f(Method method, w wVar, Object... objArr) {
        try {
            return method.invoke(wVar, objArr);
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

    public static void h(Class cls, w wVar) {
        defaultInstanceMap.put(cls, wVar);
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final int a() {
        if (this.memoizedSerializedSize == -1) {
            y0 y0Var = y0.c;
            y0Var.getClass();
            this.memoizedSerializedSize = y0Var.a(getClass()).e(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final void c(j jVar) {
        y0 y0Var = y0.c;
        y0Var.getClass();
        b1 a2 = y0Var.a(getClass());
        k0 k0Var = jVar.c;
        if (k0Var == null) {
            k0Var = new k0(jVar);
        }
        a2.b(this, k0Var);
    }

    public abstract Object d(int i10);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((w) d(6)).getClass().isInstance(obj)) {
            return false;
        }
        y0 y0Var = y0.c;
        y0Var.getClass();
        return y0Var.a(getClass()).i(this, (w) obj);
    }

    public final boolean g() {
        byte byteValue = ((Byte) d(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        y0 y0Var = y0.c;
        y0Var.getClass();
        boolean f7 = y0Var.a(getClass()).f(this);
        d(2);
        return f7;
    }

    public final int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        y0 y0Var = y0.c;
        y0Var.getClass();
        int h = y0Var.a(getClass()).h(this);
        this.memoizedHashCode = h;
        return h;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        r0.k(this, sb2, 0);
        return sb2.toString();
    }
}
