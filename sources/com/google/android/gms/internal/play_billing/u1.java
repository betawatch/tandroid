package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class u1 implements Cloneable {
    public final v1 a;
    public v1 b;

    public u1(v1 v1Var) {
        this.a = v1Var;
        if (v1Var.m()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = (v1) v1Var.d(4);
    }

    public final v1 a() {
        v1 b10 = b();
        b10.getClass();
        if (v1.c(b10, true)) {
            return b10;
        }
        throw new w2();
    }

    public final v1 b() {
        if (!this.b.m()) {
            return this.b;
        }
        v1 v1Var = this.b;
        v1Var.getClass();
        q2.c.a(v1Var.getClass()).zzf(v1Var);
        v1Var.j();
        return this.b;
    }

    public final void c() {
        if (this.b.m()) {
            return;
        }
        v1 v1Var = (v1) this.a.d(4);
        q2.c.a(v1Var.getClass()).zzg(v1Var, this.b);
        this.b = v1Var;
    }

    public final Object clone() {
        u1 u1Var = (u1) this.a.d(5);
        u1Var.b = b();
        return u1Var;
    }
}
