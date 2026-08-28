package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class e5 implements Cloneable {
    public final f5 a;
    public f5 b;

    public e5(f5 f5Var) {
        this.a = f5Var;
        if (f5Var.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = (f5) f5Var.h(4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r3 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f5 a() {
        f5 b10 = b();
        byte byteValue = ((Byte) b10.h(1, null)).byteValue();
        if (byteValue != 1) {
            if (byteValue != 0) {
                boolean f10 = e6.c.a(b10.getClass()).f(b10);
                b10.h(2, true == f10 ? b10 : null);
            }
            throw new androidx.car.app.j("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        }
        return b10;
    }

    public final f5 b() {
        if (!this.b.g()) {
            return this.b;
        }
        f5 f5Var = this.b;
        f5Var.getClass();
        e6.c.a(f5Var.getClass()).a(f5Var);
        f5Var.d();
        return this.b;
    }

    public final void c() {
        if (this.b.g()) {
            return;
        }
        f5 f5Var = (f5) this.a.h(4, null);
        e6.c.a(f5Var.getClass()).d(f5Var, this.b);
        this.b = f5Var;
    }

    public final Object clone() {
        e5 e5Var = (e5) this.a.h(5, null);
        e5Var.b = b();
        return e5Var;
    }
}
