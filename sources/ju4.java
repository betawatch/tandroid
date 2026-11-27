// default package

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class ju4 extends p3 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, ju4> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected s9c unknownFields;

    public ju4() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = s9c.f;
    }

    public static ju4 d(Class cls) {
        ju4 ju4Var = defaultInstanceMap.get(cls);
        if (ju4Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                ju4Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                su3.f("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (ju4Var != null) {
            return ju4Var;
        }
        try {
            ju4 ju4Var2 = (ju4) ((ju4) dac.a.allocateInstance(cls)).c(6);
            if (ju4Var2 != null) {
                defaultInstanceMap.put(cls, ju4Var2);
                return ju4Var2;
            }
            grb.g();
            return null;
        } catch (InstantiationException e2) {
            vr9.l(e2);
            return null;
        }
    }

    public static Object e(Method method, ju4 ju4Var, Object... objArr) {
        try {
            return method.invoke(ju4Var, objArr);
        } catch (IllegalAccessException e) {
            grb.j("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            grb.j("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static final boolean f(ju4 ju4Var, boolean z) {
        byte byteValue = ((Byte) ju4Var.c(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        ow8 ow8Var = ow8.c;
        ow8Var.getClass();
        boolean d = ow8Var.a(ju4Var.getClass()).d(ju4Var);
        if (z) {
            ju4Var.c(2);
        }
        return d;
    }

    public static void j(Class cls, ju4 ju4Var) {
        ju4Var.h();
        defaultInstanceMap.put(cls, ju4Var);
    }

    @Override // p3
    public final int a(fu9 fu9Var) {
        int h;
        int h2;
        if (g()) {
            if (fu9Var == null) {
                ow8 ow8Var = ow8.c;
                ow8Var.getClass();
                h2 = ow8Var.a(getClass()).h(this);
            } else {
                h2 = fu9Var.h(this);
            }
            if (h2 >= 0) {
                return h2;
            }
            grb.i(uh9.k(h2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & ConnectionsManager.DEFAULT_DATACENTER_ID) != Integer.MAX_VALUE) {
            return i & ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        if (fu9Var == null) {
            ow8 ow8Var2 = ow8.c;
            ow8Var2.getClass();
            h = ow8Var2.a(getClass()).h(this);
        } else {
            h = fu9Var.h(this);
        }
        k(h);
        return h;
    }

    @Override // p3
    public final void b(xk2 xk2Var) {
        ow8 ow8Var = ow8.c;
        ow8Var.getClass();
        fu9 a = ow8Var.a(getClass());
        z8d z8dVar = xk2Var.a;
        if (z8dVar == null) {
            z8dVar = new z8d(xk2Var);
        }
        a.g(this, z8dVar);
    }

    public abstract Object c(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ow8 ow8Var = ow8.c;
        ow8Var.getClass();
        return ow8Var.a(getClass()).e(this, (ju4) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public final int hashCode() {
        if (g()) {
            ow8 ow8Var = ow8.c;
            ow8Var.getClass();
            return ow8Var.a(getClass()).f(this);
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        ow8 ow8Var2 = ow8.c;
        ow8Var2.getClass();
        int f = ow8Var2.a(getClass()).f(this);
        this.memoizedHashCode = f;
        return f;
    }

    public final ju4 i() {
        return (ju4) c(4);
    }

    public final void k(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = (this.memoizedSerializedSize & Integer.MIN_VALUE) | (i & ConnectionsManager.DEFAULT_DATACENTER_ID);
        } else {
            grb.i(uh9.k(i, "serialized size must be non-negative, was "));
        }
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = e47.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        e47.c(this, sb, 0);
        return sb.toString();
    }
}
