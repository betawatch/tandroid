package com.google.android.gms.internal.cast;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class d5 extends s4 {
    private static final Map zzb = new ConcurrentHashMap();
    protected h6 zzc;
    private int zzd;

    public d5() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = h6.e;
    }

    public static i5 b(i5 i5Var) {
        int size = i5Var.size();
        return i5Var.zzg(size == 0 ? 10 : size + size);
    }

    public static Object c(Method method, d5 d5Var, Object... objArr) {
        try {
            return method.invoke(d5Var, objArr);
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

    public static void e(Class cls, d5 d5Var) {
        d5Var.d();
        zzb.put(cls, d5Var);
    }

    public static d5 k(Class cls) {
        Map map = zzb;
        d5 d5Var = (d5) map.get(cls);
        if (d5Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                d5Var = (d5) map.get(cls);
            } catch (ClassNotFoundException e6) {
                throw new IllegalStateException("Class initialization cannot fail.", e6);
            }
        }
        if (d5Var != null) {
            return d5Var;
        }
        d5 d5Var2 = (d5) ((d5) q6.g(cls)).h(6, null);
        if (d5Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, d5Var2);
        return d5Var2;
    }

    @Override // com.google.android.gms.internal.cast.s4
    public final int a(f6 f6Var) {
        if (g()) {
            int g10 = f6Var.g(this);
            if (g10 >= 0) {
                return g10;
            }
            throw new IllegalStateException(l.d.j(g10, "serialized size must be non-negative, was "));
        }
        int i10 = this.zzd & ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int g11 = f6Var.g(this);
        if (g11 < 0) {
            throw new IllegalStateException(l.d.j(g11, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & TLObject.FLAG_31) | g11;
        return g11;
    }

    public final void d() {
        this.zzd &= ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return c6.c.a(getClass()).c(this, (d5) obj);
    }

    public final void f() {
        this.zzd = (this.zzd & TLObject.FLAG_31) | ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public final boolean g() {
        return (this.zzd & TLObject.FLAG_31) != 0;
    }

    public abstract Object h(int i10, d5 d5Var);

    public final int hashCode() {
        if (g()) {
            return c6.c.a(getClass()).b(this);
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int b10 = c6.c.a(getClass()).b(this);
        this.zza = b10;
        return b10;
    }

    public final int i() {
        if (g()) {
            int g10 = c6.c.a(getClass()).g(this);
            if (g10 >= 0) {
                return g10;
            }
            throw new IllegalStateException(l.d.j(g10, "serialized size must be non-negative, was "));
        }
        int i10 = this.zzd & ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int g11 = c6.c.a(getClass()).g(this);
        if (g11 < 0) {
            throw new IllegalStateException(l.d.j(g11, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & TLObject.FLAG_31) | g11;
        return g11;
    }

    public final c5 j() {
        return (c5) h(5, null);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = w5.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        w5.c(this, sb, 0);
        return sb.toString();
    }
}
