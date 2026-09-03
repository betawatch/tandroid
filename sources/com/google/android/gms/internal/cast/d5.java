package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class d5 implements Cloneable {
    public final e5 a;
    public e5 b;

    public d5(e5 e5Var) {
        this.a = e5Var;
        if (e5Var.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = (e5) e5Var.h(4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r3 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e5 a() {
        e5 b10 = b();
        byte byteValue = ((Byte) b10.h(1, null)).byteValue();
        if (byteValue != 1) {
            if (byteValue != 0) {
                boolean f10 = d6.c.a(b10.getClass()).f(b10);
                b10.h(2, true == f10 ? b10 : null);
            }
            throw new a7.b("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        }
        return b10;
    }

    public final e5 b() {
        if (!this.b.g()) {
            return this.b;
        }
        e5 e5Var = this.b;
        e5Var.getClass();
        d6.c.a(e5Var.getClass()).a(e5Var);
        e5Var.d();
        return this.b;
    }

    public final void c() {
        if (this.b.g()) {
            return;
        }
        e5 e5Var = (e5) this.a.h(4, null);
        d6.c.a(e5Var.getClass()).d(e5Var, this.b);
        this.b = e5Var;
    }

    public final Object clone() {
        d5 d5Var = (d5) this.a.h(5, null);
        d5Var.b = b();
        return d5Var;
    }
}
