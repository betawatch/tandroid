package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class t1 implements Cloneable {
    public final u1 a;
    public u1 b;

    public t1(u1 u1Var) {
        this.a = u1Var;
        if (u1Var.m()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = (u1) u1Var.d(4);
    }

    public final u1 a() {
        u1 b10 = b();
        b10.getClass();
        if (u1.c(b10, true)) {
            return b10;
        }
        throw new v2();
    }

    public final u1 b() {
        if (!this.b.m()) {
            return this.b;
        }
        u1 u1Var = this.b;
        u1Var.getClass();
        p2.c.a(u1Var.getClass()).zzf(u1Var);
        u1Var.j();
        return this.b;
    }

    public final void c() {
        if (this.b.m()) {
            return;
        }
        u1 u1Var = (u1) this.a.d(4);
        p2.c.a(u1Var.getClass()).zzg(u1Var, this.b);
        this.b = u1Var;
    }

    public final Object clone() {
        t1 t1Var = (t1) this.a.d(5);
        t1Var.b = b();
        return t1Var;
    }
}
