package androidx.datastore.preferences.protobuf;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class x extends a {
    private static Map<Object, x> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize;
    protected j1 unknownFields;

    public x() {
        this.memoizedHashCode = 0;
        this.unknownFields = j1.f;
        this.memoizedSerializedSize = -1;
    }

    public static x e(Class cls) {
        x xVar = defaultInstanceMap.get(cls);
        if (xVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                xVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e6) {
                throw new IllegalStateException("Class initialization cannot fail.", e6);
            }
        }
        if (xVar != null) {
            return xVar;
        }
        x xVar2 = (x) ((x) s1.a(cls)).d(6);
        if (xVar2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, xVar2);
        return xVar2;
    }

    public static Object f(Method method, x xVar, Object... objArr) {
        try {
            return method.invoke(xVar, objArr);
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e6);
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

    public static void h(Class cls, x xVar) {
        defaultInstanceMap.put(cls, xVar);
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final int a() {
        if (this.memoizedSerializedSize == -1) {
            z0 z0Var = z0.c;
            z0Var.getClass();
            this.memoizedSerializedSize = z0Var.a(getClass()).d(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final void c(k kVar) {
        z0 z0Var = z0.c;
        z0Var.getClass();
        c1 a2 = z0Var.a(getClass());
        l0 l0Var = kVar.c;
        if (l0Var == null) {
            l0Var = new l0(kVar);
        }
        a2.b(this, l0Var);
    }

    public abstract Object d(int i10);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((x) d(6)).getClass().isInstance(obj)) {
            return false;
        }
        z0 z0Var = z0.c;
        z0Var.getClass();
        return z0Var.a(getClass()).h(this, (x) obj);
    }

    public final boolean g() {
        byte byteValue = ((Byte) d(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        z0 z0Var = z0.c;
        z0Var.getClass();
        boolean e6 = z0Var.a(getClass()).e(this);
        d(2);
        return e6;
    }

    public final int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        z0 z0Var = z0.c;
        z0Var.getClass();
        int g10 = z0Var.a(getClass()).g(this);
        this.memoizedHashCode = g10;
        return g10;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        s0.k(this, sb, 0);
        return sb.toString();
    }
}
