package com.google.android.gms.internal.vision;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract class f1 extends l0 {
    private static Map<Object, f1> zzd = new ConcurrentHashMap();
    protected r2 zzb;
    private int zzc;

    public f1() {
        this.zza = 0;
        this.zzb = r2.f;
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
        f1 f1Var2 = (f1) ((f1) y2.b(cls)).e(6);
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
    public final void b(int i7) {
        this.zzc = i7;
    }

    @Override // com.google.android.gms.internal.vision.l0
    public final int c() {
        return this.zzc;
    }

    public abstract Object e(int i7);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l2 l2Var = l2.c;
        l2Var.getClass();
        return l2Var.a(getClass()).g(this, (f1) obj);
    }

    public final int h() {
        if (this.zzc == -1) {
            l2 l2Var = l2.c;
            l2Var.getClass();
            this.zzc = l2Var.a(getClass()).zzb(this);
        }
        return this.zzc;
    }

    public final int hashCode() {
        int i7 = this.zza;
        if (i7 != 0) {
            return i7;
        }
        l2 l2Var = l2.c;
        l2Var.getClass();
        int d = l2Var.a(getClass()).d(this);
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
