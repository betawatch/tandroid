package com.google.android.gms.internal.vision;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class f1 extends l0 {
    private static Map<Object, f1> zzd = new ConcurrentHashMap();
    protected q2 zzb;
    private int zzc;

    public f1() {
        this.zza = 0;
        this.zzb = q2.f;
        this.zzc = -1;
    }

    public static f1 d(Class cls) {
        f1 f1Var = zzd.get(cls);
        if (f1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                f1Var = zzd.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (f1Var != null) {
            return f1Var;
        }
        f1 f1Var2 = (f1) ((f1) x2.b(cls)).e(6);
        if (f1Var2 == null) {
            throw new IllegalStateException();
        }
        zzd.put(cls, f1Var2);
        return f1Var2;
    }

    public static Object f(Method method, f1 f1Var, Object... objArr) {
        try {
            return method.invoke(f1Var, objArr);
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

    public static void g(Class cls, f1 f1Var) {
        zzd.put(cls, f1Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.vision.h1, com.google.android.gms.internal.vision.m1] */
    public static m1 i() {
        return h1.d;
    }

    @Override // com.google.android.gms.internal.vision.l0
    public final void b(int i10) {
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.vision.l0
    public final int c() {
        return this.zzc;
    }

    public abstract Object e(int i10);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k2 k2Var = k2.c;
        k2Var.getClass();
        return k2Var.a(getClass()).g(this, (f1) obj);
    }

    public final int h() {
        if (this.zzc == -1) {
            k2 k2Var = k2.c;
            k2Var.getClass();
            this.zzc = k2Var.a(getClass()).zzb(this);
        }
        return this.zzc;
    }

    public final int hashCode() {
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        k2 k2Var = k2.c;
        k2Var.getClass();
        int d = k2Var.a(getClass()).d(this);
        this.zza = d;
        return d;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        e1.p(this, sb2, 0);
        return sb2.toString();
    }
}
