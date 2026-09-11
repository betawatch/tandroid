package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public abstract class g5 implements Cloneable {
    public final h5 a;
    public h5 b;

    public g5(h5 h5Var) {
        this.a = h5Var;
        if (h5Var.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = (h5) h5Var.h(4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r3 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final h5 a() {
        h5 b10 = b();
        byte byteValue = ((Byte) b10.h(1, null)).byteValue();
        if (byteValue != 1) {
            if (byteValue != 0) {
                boolean f7 = g6.c.a(b10.getClass()).f(b10);
                b10.h(2, true == f7 ? b10 : null);
            }
            throw new androidx.car.app.j("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        }
        return b10;
    }

    public final h5 b() {
        if (!this.b.g()) {
            return this.b;
        }
        h5 h5Var = this.b;
        h5Var.getClass();
        g6.c.a(h5Var.getClass()).a(h5Var);
        h5Var.d();
        return this.b;
    }

    public final void c() {
        if (this.b.g()) {
            return;
        }
        h5 h5Var = (h5) this.a.h(4, null);
        g6.c.a(h5Var.getClass()).d(h5Var, this.b);
        this.b = h5Var;
    }

    public final Object clone() {
        g5 g5Var = (g5) this.a.h(5, null);
        g5Var.b = b();
        return g5Var;
    }
}
