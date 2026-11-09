package com.google.android.gms.internal.play_billing;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public abstract class v1 extends e1 {
    private static final Map zzb = new ConcurrentHashMap();
    protected x2 zzc;
    private int zzd;

    public v1() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = x2.f;
    }

    public static final boolean c(v1 v1Var, boolean z9) {
        byte byteValue = ((Byte) v1Var.d(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean b10 = q2.c.a(v1Var.getClass()).b(v1Var);
        if (z9) {
            v1Var.d(2);
        }
        return b10;
    }

    public static v1 h(Class cls) {
        Map map = zzb;
        v1 v1Var = (v1) map.get(cls);
        if (v1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                v1Var = (v1) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (v1Var != null) {
            return v1Var;
        }
        v1 v1Var2 = (v1) ((v1) c3.g(cls)).d(6);
        if (v1Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, v1Var2);
        return v1Var2;
    }

    public static Object i(Method method, v1 v1Var, Object... objArr) {
        try {
            return method.invoke(v1Var, objArr);
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

    public static void k(Class cls, v1 v1Var) {
        v1Var.j();
        zzb.put(cls, v1Var);
    }

    @Override // com.google.android.gms.internal.play_billing.e1
    public final int b(t2 t2Var) {
        if (m()) {
            int d = t2Var.d(this);
            if (d >= 0) {
                return d;
            }
            throw new IllegalStateException(jg.g.j(d, "serialized size must be non-negative, was "));
        }
        int i7 = this.zzd & ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (i7 != Integer.MAX_VALUE) {
            return i7;
        }
        int d2 = t2Var.d(this);
        if (d2 < 0) {
            throw new IllegalStateException(jg.g.j(d2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & TLObject.FLAG_31) | d2;
        return d2;
    }

    public abstract Object d(int i7);

    public final int e() {
        if (m()) {
            int d = q2.c.a(getClass()).d(this);
            if (d >= 0) {
                return d;
            }
            throw new IllegalStateException(jg.g.j(d, "serialized size must be non-negative, was "));
        }
        int i7 = this.zzd & ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (i7 != Integer.MAX_VALUE) {
            return i7;
        }
        int d2 = q2.c.a(getClass()).d(this);
        if (d2 < 0) {
            throw new IllegalStateException(jg.g.j(d2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & TLObject.FLAG_31) | d2;
        return d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return q2.c.a(getClass()).f(this, (v1) obj);
    }

    public final u1 f() {
        return (u1) d(5);
    }

    public final u1 g() {
        u1 u1Var = (u1) d(5);
        if (!u1Var.a.equals(this)) {
            if (!u1Var.b.m()) {
                v1 v1Var = (v1) u1Var.a.d(4);
                q2.c.a(v1Var.getClass()).zzg(v1Var, u1Var.b);
                u1Var.b = v1Var;
            }
            v1 v1Var2 = u1Var.b;
            q2.c.a(v1Var2.getClass()).zzg(v1Var2, this);
        }
        return u1Var;
    }

    public final int hashCode() {
        if (m()) {
            return q2.c.a(getClass()).a(this);
        }
        int i7 = this.zza;
        if (i7 != 0) {
            return i7;
        }
        int a10 = q2.c.a(getClass()).a(this);
        this.zza = a10;
        return a10;
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
        char[] cArr = m2.a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        m2.c(this, sb2, 0);
        return sb2.toString();
    }
}
