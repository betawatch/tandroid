package c2;

import android.os.Bundle;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class y0 extends r implements t0 {
    public final String a;
    public final String b;
    public boolean c;
    public int d = -1;
    public int e;
    public s0 f;
    public int g;
    public final /* synthetic */ z0 h;

    public y0(z0 z0Var, String str, String str2) {
        this.h = z0Var;
        this.a = str;
        this.b = str2;
    }

    @Override // c2.t0
    public final void a(s0 s0Var) {
        this.f = s0Var;
        int i9 = s0Var.e;
        s0Var.e = i9 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.a);
        bundle.putString("routeGroupId", this.b);
        int i10 = s0Var.d;
        s0Var.d = i10 + 1;
        s0Var.b(3, i10, i9, null, bundle);
        this.g = i9;
        if (this.c) {
            s0Var.a(i9);
            int i11 = this.d;
            if (i11 >= 0) {
                s0Var.c(this.g, i11);
                this.d = -1;
            }
            int i12 = this.e;
            if (i12 != 0) {
                s0Var.d(this.g, i12);
                this.e = 0;
            }
        }
    }

    @Override // c2.t0
    public final int b() {
        return this.g;
    }

    @Override // c2.t0
    public final void c() {
        s0 s0Var = this.f;
        if (s0Var != null) {
            int i9 = this.g;
            int i10 = s0Var.d;
            s0Var.d = i10 + 1;
            s0Var.b(4, i10, i9, null, null);
            this.f = null;
            this.g = 0;
        }
    }

    @Override // c2.r
    public final void d() {
        z0 z0Var = this.h;
        z0Var.v.remove(this);
        c();
        z0Var.r();
    }

    @Override // c2.r
    public final void e() {
        this.c = true;
        s0 s0Var = this.f;
        if (s0Var != null) {
            s0Var.a(this.g);
        }
    }

    @Override // c2.r
    public final void f(int i9) {
        s0 s0Var = this.f;
        if (s0Var != null) {
            s0Var.c(this.g, i9);
        } else {
            this.d = i9;
            this.e = 0;
        }
    }

    @Override // c2.r
    public final void g() {
        h(0);
    }

    @Override // c2.r
    public final void h(int i9) {
        this.c = false;
        s0 s0Var = this.f;
        if (s0Var != null) {
            int i10 = this.g;
            Bundle h = aa.d.h(i9, "unselectReason");
            int i11 = s0Var.d;
            s0Var.d = i11 + 1;
            s0Var.b(6, i11, i10, null, h);
        }
    }

    @Override // c2.r
    public final void i(int i9) {
        s0 s0Var = this.f;
        if (s0Var != null) {
            s0Var.d(this.g, i9);
        } else {
            this.e += i9;
        }
    }
}
