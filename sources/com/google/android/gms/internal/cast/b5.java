package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class b5 implements Cloneable {
    public final c5 a;
    public c5 b;

    public b5(c5 c5Var) {
        this.a = c5Var;
        if (c5Var.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = (c5) c5Var.h(4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r3 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c5 a() {
        c5 b10 = b();
        byte byteValue = ((Byte) b10.h(1, null)).byteValue();
        if (byteValue != 1) {
            if (byteValue != 0) {
                boolean f10 = b6.c.a(b10.getClass()).f(b10);
                b10.h(2, true == f10 ? b10 : null);
            }
            throw new androidx.car.app.j("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        }
        return b10;
    }

    public final c5 b() {
        if (!this.b.g()) {
            return this.b;
        }
        c5 c5Var = this.b;
        c5Var.getClass();
        b6.c.a(c5Var.getClass()).a(c5Var);
        c5Var.d();
        return this.b;
    }

    public final void c() {
        if (this.b.g()) {
            return;
        }
        c5 c5Var = (c5) this.a.h(4, null);
        b6.c.a(c5Var.getClass()).d(c5Var, this.b);
        this.b = c5Var;
    }

    public final Object clone() {
        b5 b5Var = (b5) this.a.h(5, null);
        b5Var.b = b();
        return b5Var;
    }
}
