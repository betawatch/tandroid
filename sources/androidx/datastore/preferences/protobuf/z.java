package androidx.datastore.preferences.protobuf;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class z extends a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, z> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected h1 unknownFields;

    public z() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = h1.f;
    }

    public static z d(Class cls) {
        z zVar = defaultInstanceMap.get(cls);
        if (zVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = (z) ((z) n1.d(cls)).c(6);
        if (zVar2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, zVar2);
        return zVar2;
    }

    public static Object e(Method method, z zVar, Object... objArr) {
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

    public static final boolean f(z zVar, boolean z9) {
        byte byteValue = ((Byte) zVar.c(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        y0 y0Var = y0.c;
        y0Var.getClass();
        boolean e10 = y0Var.a(zVar.getClass()).e(zVar);
        if (z9) {
            zVar.c(2);
        }
        return e10;
    }

    public static void j(Class cls, z zVar) {
        zVar.h();
        defaultInstanceMap.put(cls, zVar);
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final int a(b1 b1Var) {
        int f10;
        int f11;
        if (g()) {
            if (b1Var == null) {
                y0 y0Var = y0.c;
                y0Var.getClass();
                f11 = y0Var.a(getClass()).f(this);
            } else {
                f11 = b1Var.f(this);
            }
            if (f11 >= 0) {
                return f11;
            }
            throw new IllegalStateException(jg.g.j(f11, "serialized size must be non-negative, was "));
        }
        int i7 = this.memoizedSerializedSize;
        if ((i7 & ConnectionsManager.DEFAULT_DATACENTER_ID) != Integer.MAX_VALUE) {
            return i7 & ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        if (b1Var == null) {
            y0 y0Var2 = y0.c;
            y0Var2.getClass();
            f10 = y0Var2.a(getClass()).f(this);
        } else {
            f10 = b1Var.f(this);
        }
        k(f10);
        return f10;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final void b(m mVar) {
        y0 y0Var = y0.c;
        y0Var.getClass();
        b1 a10 = y0Var.a(getClass());
        l0 l0Var = mVar.a;
        if (l0Var == null) {
            l0Var = new l0(mVar);
        }
        a10.c(this, l0Var);
    }

    public abstract Object c(int i7);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        y0 y0Var = y0.c;
        y0Var.getClass();
        return y0Var.a(getClass()).h(this, (z) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public final int hashCode() {
        if (g()) {
            y0 y0Var = y0.c;
            y0Var.getClass();
            return y0Var.a(getClass()).g(this);
        }
        if (this.memoizedHashCode == 0) {
            y0 y0Var2 = y0.c;
            y0Var2.getClass();
            this.memoizedHashCode = y0Var2.a(getClass()).g(this);
        }
        return this.memoizedHashCode;
    }

    public final z i() {
        return (z) c(4);
    }

    public final void k(int i7) {
        if (i7 < 0) {
            throw new IllegalStateException(jg.g.j(i7, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i7 & ConnectionsManager.DEFAULT_DATACENTER_ID) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = s0.a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        s0.c(this, sb2, 0);
        return sb2.toString();
    }
}
