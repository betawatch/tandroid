package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class a5 implements Cloneable {
    public final b5 a;
    public b5 b;

    public a5(b5 b5Var) {
        this.a = b5Var;
        if (b5Var.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = (b5) b5Var.h(4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r3 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b5 a() {
        b5 b10 = b();
        byte byteValue = ((Byte) b10.h(1, null)).byteValue();
        if (byteValue != 1) {
            if (byteValue != 0) {
                boolean f10 = a6.c.a(b10.getClass()).f(b10);
                b10.h(2, true == f10 ? b10 : null);
            }
            throw new androidx.car.app.j("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        }
        return b10;
    }

    public final b5 b() {
        if (!this.b.g()) {
            return this.b;
        }
        b5 b5Var = this.b;
        b5Var.getClass();
        a6.c.a(b5Var.getClass()).a(b5Var);
        b5Var.d();
        return this.b;
    }

    public final void c() {
        if (this.b.g()) {
            return;
        }
        b5 b5Var = (b5) this.a.h(4, null);
        a6.c.a(b5Var.getClass()).d(b5Var, this.b);
        this.b = b5Var;
    }

    public final Object clone() {
        a5 a5Var = (a5) this.a.h(5, null);
        a5Var.b = b();
        return a5Var;
    }
}
