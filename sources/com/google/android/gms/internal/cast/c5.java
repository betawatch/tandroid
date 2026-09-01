package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class c5 implements Cloneable {
    public final d5 a;
    public d5 b;

    public c5(d5 d5Var) {
        this.a = d5Var;
        if (d5Var.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = (d5) d5Var.h(4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r3 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d5 a() {
        d5 b10 = b();
        byte byteValue = ((Byte) b10.h(1, null)).byteValue();
        if (byteValue != 1) {
            if (byteValue != 0) {
                boolean f10 = c6.c.a(b10.getClass()).f(b10);
                b10.h(2, true == f10 ? b10 : null);
            }
            throw new a7.b("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        }
        return b10;
    }

    public final d5 b() {
        if (!this.b.g()) {
            return this.b;
        }
        d5 d5Var = this.b;
        d5Var.getClass();
        c6.c.a(d5Var.getClass()).a(d5Var);
        d5Var.d();
        return this.b;
    }

    public final void c() {
        if (this.b.g()) {
            return;
        }
        d5 d5Var = (d5) this.a.h(4, null);
        c6.c.a(d5Var.getClass()).d(d5Var, this.b);
        this.b = d5Var;
    }

    public final Object clone() {
        c5 c5Var = (c5) this.a.h(5, null);
        c5Var.b = b();
        return c5Var;
    }
}
