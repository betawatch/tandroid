package c2;

import android.os.Bundle;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class x0 extends r implements s0 {
    public final String a;
    public final String b;
    public boolean c;
    public int d = -1;
    public int e;
    public r0 f;
    public int g;
    public final /* synthetic */ y0 h;

    public x0(y0 y0Var, String str, String str2) {
        this.h = y0Var;
        this.a = str;
        this.b = str2;
    }

    @Override // c2.s0
    public final void a(r0 r0Var) {
        this.f = r0Var;
        int i10 = r0Var.e;
        r0Var.e = i10 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.a);
        bundle.putString("routeGroupId", this.b);
        int i11 = r0Var.d;
        r0Var.d = i11 + 1;
        r0Var.b(3, i11, i10, null, bundle);
        this.g = i10;
        if (this.c) {
            r0Var.a(i10);
            int i12 = this.d;
            if (i12 >= 0) {
                r0Var.c(this.g, i12);
                this.d = -1;
            }
            int i13 = this.e;
            if (i13 != 0) {
                r0Var.d(this.g, i13);
                this.e = 0;
            }
        }
    }

    @Override // c2.s0
    public final int b() {
        return this.g;
    }

    @Override // c2.s0
    public final void c() {
        r0 r0Var = this.f;
        if (r0Var != null) {
            int i10 = this.g;
            int i11 = r0Var.d;
            r0Var.d = i11 + 1;
            r0Var.b(4, i11, i10, null, null);
            this.f = null;
            this.g = 0;
        }
    }

    @Override // c2.r
    public final void d() {
        y0 y0Var = this.h;
        y0Var.v.remove(this);
        c();
        y0Var.r();
    }

    @Override // c2.r
    public final void e() {
        this.c = true;
        r0 r0Var = this.f;
        if (r0Var != null) {
            r0Var.a(this.g);
        }
    }

    @Override // c2.r
    public final void f(int i10) {
        r0 r0Var = this.f;
        if (r0Var != null) {
            r0Var.c(this.g, i10);
        } else {
            this.d = i10;
            this.e = 0;
        }
    }

    @Override // c2.r
    public final void g() {
        h(0);
    }

    @Override // c2.r
    public final void h(int i10) {
        this.c = false;
        r0 r0Var = this.f;
        if (r0Var != null) {
            int i11 = this.g;
            Bundle g10 = a9.p.g(i10, "unselectReason");
            int i12 = r0Var.d;
            r0Var.d = i12 + 1;
            r0Var.b(6, i12, i11, null, g10);
        }
    }

    @Override // c2.r
    public final void i(int i10) {
        r0 r0Var = this.f;
        if (r0Var != null) {
            r0Var.d(this.g, i10);
        } else {
            this.e += i10;
        }
    }
}
