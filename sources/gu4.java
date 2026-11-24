// default package

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class gu4 extends o3 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, gu4> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected s7c unknownFields;

    public gu4() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = s7c.f;
    }

    public static gu4 d(Class cls) {
        gu4 gu4Var = defaultInstanceMap.get(cls);
        if (gu4Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                gu4Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                wa3.h("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (gu4Var != null) {
            return gu4Var;
        }
        try {
            gu4 gu4Var2 = (gu4) ((gu4) d8c.a.allocateInstance(cls)).c(6);
            if (gu4Var2 != null) {
                defaultInstanceMap.put(cls, gu4Var2);
                return gu4Var2;
            }
            rjb.h();
            return null;
        } catch (InstantiationException e2) {
            dq9.o(e2);
            return null;
        }
    }

    public static Object e(Method method, gu4 gu4Var, Object... objArr) {
        try {
            return method.invoke(gu4Var, objArr);
        } catch (IllegalAccessException e) {
            rjb.k("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            rjb.k("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static final boolean f(gu4 gu4Var, boolean z) {
        byte byteValue = ((Byte) gu4Var.c(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        gv8 gv8Var = gv8.c;
        gv8Var.getClass();
        boolean d = gv8Var.a(gu4Var.getClass()).d(gu4Var);
        if (z) {
            gu4Var.c(2);
        }
        return d;
    }

    public static void j(Class cls, gu4 gu4Var) {
        gu4Var.h();
        defaultInstanceMap.put(cls, gu4Var);
    }

    @Override // o3
    public final int a(os9 os9Var) {
        int h;
        int h2;
        if (g()) {
            if (os9Var == null) {
                gv8 gv8Var = gv8.c;
                gv8Var.getClass();
                h2 = gv8Var.a(getClass()).h(this);
            } else {
                h2 = os9Var.h(this);
            }
            if (h2 >= 0) {
                return h2;
            }
            dq9.m(hg9.j(h2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & ConnectionsManager.DEFAULT_DATACENTER_ID) != Integer.MAX_VALUE) {
            return i & ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        if (os9Var == null) {
            gv8 gv8Var2 = gv8.c;
            gv8Var2.getClass();
            h = gv8Var2.a(getClass()).h(this);
        } else {
            h = os9Var.h(this);
        }
        k(h);
        return h;
    }

    @Override // o3
    public final void b(pl2 pl2Var) {
        gv8 gv8Var = gv8.c;
        gv8Var.getClass();
        os9 a = gv8Var.a(getClass());
        k6d k6dVar = pl2Var.a;
        if (k6dVar == null) {
            k6dVar = new k6d(pl2Var);
        }
        a.g(this, k6dVar);
    }

    public abstract Object c(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        gv8 gv8Var = gv8.c;
        gv8Var.getClass();
        return gv8Var.a(getClass()).e(this, (gu4) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public final int hashCode() {
        if (g()) {
            gv8 gv8Var = gv8.c;
            gv8Var.getClass();
            return gv8Var.a(getClass()).f(this);
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        gv8 gv8Var2 = gv8.c;
        gv8Var2.getClass();
        int f = gv8Var2.a(getClass()).f(this);
        this.memoizedHashCode = f;
        return f;
    }

    public final gu4 i() {
        return (gu4) c(4);
    }

    public final void k(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = (this.memoizedSerializedSize & Integer.MIN_VALUE) | (i & ConnectionsManager.DEFAULT_DATACENTER_ID);
        } else {
            dq9.m(hg9.j(i, "serialized size must be non-negative, was "));
        }
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = x37.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        x37.c(this, sb, 0);
        return sb.toString();
    }
}
