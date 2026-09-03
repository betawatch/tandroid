package c2;

import android.os.Bundle;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class y0 extends s implements u0 {
    public final String a;
    public final String b;
    public boolean c;
    public int d = -1;
    public int e;
    public t0 f;
    public int g;
    public final /* synthetic */ z0 h;

    public y0(z0 z0Var, String str, String str2) {
        this.h = z0Var;
        this.a = str;
        this.b = str2;
    }

    @Override // c2.u0
    public final void a(t0 t0Var) {
        this.f = t0Var;
        int i10 = t0Var.e;
        t0Var.e = i10 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.a);
        bundle.putString("routeGroupId", this.b);
        int i11 = t0Var.d;
        t0Var.d = i11 + 1;
        t0Var.b(3, i11, i10, null, bundle);
        this.g = i10;
        if (this.c) {
            t0Var.a(i10);
            int i12 = this.d;
            if (i12 >= 0) {
                t0Var.c(this.g, i12);
                this.d = -1;
            }
            int i13 = this.e;
            if (i13 != 0) {
                t0Var.d(this.g, i13);
                this.e = 0;
            }
        }
    }

    @Override // c2.u0
    public final int b() {
        return this.g;
    }

    @Override // c2.u0
    public final void c() {
        t0 t0Var = this.f;
        if (t0Var != null) {
            int i10 = this.g;
            int i11 = t0Var.d;
            t0Var.d = i11 + 1;
            t0Var.b(4, i11, i10, null, null);
            this.f = null;
            this.g = 0;
        }
    }

    @Override // c2.s
    public final void d() {
        z0 z0Var = this.h;
        z0Var.v.remove(this);
        c();
        z0Var.r();
    }

    @Override // c2.s
    public final void e() {
        this.c = true;
        t0 t0Var = this.f;
        if (t0Var != null) {
            t0Var.a(this.g);
        }
    }

    @Override // c2.s
    public final void f(int i10) {
        t0 t0Var = this.f;
        if (t0Var != null) {
            t0Var.c(this.g, i10);
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
        t0 t0Var = this.f;
        if (t0Var != null) {
            int i11 = this.g;
            Bundle h = android.support.v4.media.a.h(i10, "unselectReason");
            int i12 = t0Var.d;
            t0Var.d = i12 + 1;
            t0Var.b(6, i12, i11, null, h);
        }
    }

    @Override // c2.s
    public final void i(int i10) {
        t0 t0Var = this.f;
        if (t0Var != null) {
            t0Var.d(this.g, i10);
        } else {
            this.e += i10;
        }
    }
}
