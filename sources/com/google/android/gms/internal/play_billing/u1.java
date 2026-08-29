package com.google.android.gms.internal.play_billing;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class u1 extends e1 {
    private static final Map zzb = new ConcurrentHashMap();
    protected w2 zzc;
    private int zzd;

    public u1() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = w2.f;
    }

    public static final boolean c(u1 u1Var, boolean z10) {
        byte byteValue = ((Byte) u1Var.d(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c3 = p2.c.a(u1Var.getClass()).c(u1Var);
        if (z10) {
            u1Var.d(2);
        }
        return c3;
    }

    public static u1 h(Class cls) {
        Map map = zzb;
        u1 u1Var = (u1) map.get(cls);
        if (u1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                u1Var = (u1) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (u1Var != null) {
            return u1Var;
        }
        u1 u1Var2 = (u1) ((u1) b3.g(cls)).d(6);
        if (u1Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, u1Var2);
        return u1Var2;
    }

    public static Object i(Method method, u1 u1Var, Object... objArr) {
        try {
            return method.invoke(u1Var, objArr);
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

    public static void k(Class cls, u1 u1Var) {
        u1Var.j();
        zzb.put(cls, u1Var);
    }

    @Override // com.google.android.gms.internal.play_billing.e1
    public final int b(s2 s2Var) {
        if (m()) {
            int e10 = s2Var.e(this);
            if (e10 >= 0) {
                return e10;
            }
            throw new IllegalStateException(j7.l1.k(e10, "serialized size must be non-negative, was "));
        }
        int i10 = this.zzd & ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int e11 = s2Var.e(this);
        if (e11 < 0) {
            throw new IllegalStateException(j7.l1.k(e11, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & TLObject.FLAG_31) | e11;
        return e11;
    }

    public abstract Object d(int i10);

    public final int e() {
        if (m()) {
            int e10 = p2.c.a(getClass()).e(this);
            if (e10 >= 0) {
                return e10;
            }
            throw new IllegalStateException(j7.l1.k(e10, "serialized size must be non-negative, was "));
        }
        int i10 = this.zzd & ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int e11 = p2.c.a(getClass()).e(this);
        if (e11 < 0) {
            throw new IllegalStateException(j7.l1.k(e11, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & TLObject.FLAG_31) | e11;
        return e11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return p2.c.a(getClass()).f(this, (u1) obj);
    }

    public final t1 f() {
        return (t1) d(5);
    }

    public final t1 g() {
        t1 t1Var = (t1) d(5);
        if (!t1Var.a.equals(this)) {
            if (!t1Var.b.m()) {
                u1 u1Var = (u1) t1Var.a.d(4);
                p2.c.a(u1Var.getClass()).zzg(u1Var, t1Var.b);
                t1Var.b = u1Var;
            }
            u1 u1Var2 = t1Var.b;
            p2.c.a(u1Var2.getClass()).zzg(u1Var2, this);
        }
        return t1Var;
    }

    public final int hashCode() {
        if (m()) {
            return p2.c.a(getClass()).b(this);
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int b10 = p2.c.a(getClass()).b(this);
        this.zza = b10;
        return b10;
    }

    public final void j() {
        this.zzd &= ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public final void l() {
        this.zzd = (this.zzd & TLObject.FLAG_31) | ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public final boolean m() {
        return (this.zzd & TLObject.FLAG_31) != 0;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = l2.a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        l2.c(this, sb2, 0);
        return sb2.toString();
    }
}
