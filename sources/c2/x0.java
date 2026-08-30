package c2;

import android.os.Bundle;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class x0 extends s implements t0 {
    public final String a;
    public final String b;
    public boolean c;
    public int d = -1;
    public int e;
    public s0 f;
    public int g;
    public final /* synthetic */ y0 h;

    public x0(y0 y0Var, String str, String str2) {
        this.h = y0Var;
        this.a = str;
        this.b = str2;
    }

    @Override // c2.t0
    public final void a(s0 s0Var) {
        this.f = s0Var;
        int i10 = s0Var.e;
        s0Var.e = i10 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.a);
        bundle.putString("routeGroupId", this.b);
        int i11 = s0Var.d;
        s0Var.d = i11 + 1;
        s0Var.b(3, i11, i10, null, bundle);
        this.g = i10;
        if (this.c) {
            s0Var.a(i10);
            int i12 = this.d;
            if (i12 >= 0) {
                s0Var.c(this.g, i12);
                this.d = -1;
            }
            int i13 = this.e;
            if (i13 != 0) {
                s0Var.d(this.g, i13);
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
            int i10 = this.g;
            int i11 = s0Var.d;
            s0Var.d = i11 + 1;
            s0Var.b(4, i11, i10, null, null);
            this.f = null;
            this.g = 0;
        }
    }

    @Override // c2.s
    public final void d() {
        y0 y0Var = this.h;
        y0Var.v.remove(this);
        c();
        y0Var.r();
    }

    @Override // c2.s
    public final void e() {
        this.c = true;
        s0 s0Var = this.f;
        if (s0Var != null) {
            s0Var.a(this.g);
        }
    }

    @Override // c2.s
    public final void f(int i10) {
        s0 s0Var = this.f;
        if (s0Var != null) {
            s0Var.c(this.g, i10);
        } else {
            this.d = i10;
            this.e = 0;
        }
    }

    @Override // c2.s
    public final void g() {
        h(0);
    }

    @Override // c2.s
    public final void h(int i10) {
        this.c = false;
        s0 s0Var = this.f;
        if (s0Var != null) {
            int i11 = this.g;
            Bundle h = android.support.v4.media.a.h(i10, "unselectReason");
            int i12 = s0Var.d;
            s0Var.d = i12 + 1;
            s0Var.b(6, i12, i11, null, h);
        }
    }

    @Override // c2.s
    public final void i(int i10) {
        s0 s0Var = this.f;
        if (s0Var != null) {
            s0Var.d(this.g, i10);
        } else {
            this.e += i10;
        }
    }
}
