// default package

import android.os.Bundle;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class e99 extends aw6 implements a99 {
    public final String a;
    public final String b;
    public boolean c;
    public int d = -1;
    public int e;
    public z89 f;
    public int g;
    public final /* synthetic */ f99 h;

    public e99(f99 f99Var, String str, String str2) {
        this.h = f99Var;
        this.a = str;
        this.b = str2;
    }

    @Override // a99
    public final int a() {
        return this.g;
    }

    @Override // a99
    public final void b(z89 z89Var) {
        this.f = z89Var;
        int i = z89Var.e;
        z89Var.e = i + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.a);
        bundle.putString("routeGroupId", this.b);
        int i2 = z89Var.d;
        z89Var.d = i2 + 1;
        z89Var.b(3, i2, i, null, bundle);
        this.g = i;
        if (this.c) {
            z89Var.a(i);
            int i3 = this.d;
            if (i3 >= 0) {
                z89Var.c(this.g, i3);
                this.d = -1;
            }
            int i4 = this.e;
            if (i4 != 0) {
                z89Var.d(this.g, i4);
                this.e = 0;
            }
        }
    }

    @Override // a99
    public final void c() {
        z89 z89Var = this.f;
        if (z89Var != null) {
            int i = this.g;
            int i2 = z89Var.d;
            z89Var.d = i2 + 1;
            z89Var.b(4, i2, i, null, null);
            this.f = null;
            this.g = 0;
        }
    }

    @Override // aw6
    public final void d() {
        f99 f99Var = this.h;
        f99Var.w.remove(this);
        c();
        f99Var.r();
    }

    @Override // aw6
    public final void e() {
        this.c = true;
        z89 z89Var = this.f;
        if (z89Var != null) {
            z89Var.a(this.g);
        }
    }

    @Override // aw6
    public final void f(int i) {
        z89 z89Var = this.f;
        if (z89Var != null) {
            z89Var.c(this.g, i);
        } else {
            this.d = i;
            this.e = 0;
        }
    }

    @Override // aw6
    public final void g() {
        h(0);
    }

    @Override // aw6
    public final void h(int i) {
        this.c = false;
        z89 z89Var = this.f;
        if (z89Var != null) {
            int i2 = this.g;
            Bundle j = qu6.j(i, "unselectReason");
            int i3 = z89Var.d;
            z89Var.d = i3 + 1;
            z89Var.b(6, i3, i2, null, j);
        }
    }

    @Override // aw6
    public final void i(int i) {
        z89 z89Var = this.f;
        if (z89Var != null) {
            z89Var.d(this.g, i);
        } else {
            this.e += i;
        }
    }
}
