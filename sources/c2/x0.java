package c2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class x0 extends q implements t0 {
    public final String f;
    public String g;
    public String h;
    public boolean i;
    public int k;
    public s0 l;
    public final /* synthetic */ z0 n;
    public int j = -1;
    public int m = -1;

    public x0(z0 z0Var, String str) {
        this.n = z0Var;
        this.f = str;
    }

    @Override // c2.t0
    public final void a(s0 s0Var) {
        w0 w0Var = new w0(this);
        this.l = s0Var;
        int i9 = s0Var.e;
        s0Var.e = i9 + 1;
        int i10 = s0Var.d;
        s0Var.d = i10 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f);
        s0Var.b(11, i10, i9, null, bundle);
        s0Var.h.put(i10, w0Var);
        this.m = i9;
        if (this.i) {
            s0Var.a(i9);
            int i11 = this.j;
            if (i11 >= 0) {
                s0Var.c(this.m, i11);
                this.j = -1;
            }
            int i12 = this.k;
            if (i12 != 0) {
                s0Var.d(this.m, i12);
                this.k = 0;
            }
        }
    }

    @Override // c2.t0
    public final int b() {
        return this.m;
    }

    @Override // c2.t0
    public final void c() {
        s0 s0Var = this.l;
        if (s0Var != null) {
            int i9 = this.m;
            int i10 = s0Var.d;
            s0Var.d = i10 + 1;
            s0Var.b(4, i10, i9, null, null);
            this.l = null;
            this.m = 0;
        }
    }

    @Override // c2.r
    public final void d() {
        z0 z0Var = this.n;
        z0Var.v.remove(this);
        c();
        z0Var.r();
    }

    @Override // c2.r
    public final void e() {
        this.i = true;
        s0 s0Var = this.l;
        if (s0Var != null) {
            s0Var.a(this.m);
        }
    }

    @Override // c2.r
    public final void f(int i9) {
        s0 s0Var = this.l;
        if (s0Var != null) {
            s0Var.c(this.m, i9);
        } else {
            this.j = i9;
            this.k = 0;
        }
    }

    @Override // c2.r
    public final void g() {
        h(0);
    }

    @Override // c2.r
    public final void h(int i9) {
        this.i = false;
        s0 s0Var = this.l;
        if (s0Var != null) {
            int i10 = this.m;
            Bundle h = aa.d.h(i9, "unselectReason");
            int i11 = s0Var.d;
            s0Var.d = i11 + 1;
            s0Var.b(6, i11, i10, null, h);
        }
    }

    @Override // c2.r
    public final void i(int i9) {
        s0 s0Var = this.l;
        if (s0Var != null) {
            s0Var.d(this.m, i9);
        } else {
            this.k += i9;
        }
    }

    @Override // c2.q
    public final String j() {
        return this.g;
    }

    @Override // c2.q
    public final String k() {
        return this.h;
    }

    @Override // c2.q
    public final void m(String str) {
        s0 s0Var = this.l;
        if (s0Var != null) {
            int i9 = this.m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i10 = s0Var.d;
            s0Var.d = i10 + 1;
            s0Var.b(12, i10, i9, null, bundle);
        }
    }

    @Override // c2.q
    public final void n(String str) {
        s0 s0Var = this.l;
        if (s0Var != null) {
            int i9 = this.m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i10 = s0Var.d;
            s0Var.d = i10 + 1;
            s0Var.b(13, i10, i9, null, bundle);
        }
    }

    @Override // c2.q
    public final void o(List list) {
        s0 s0Var = this.l;
        if (s0Var != null) {
            int i9 = this.m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i10 = s0Var.d;
            s0Var.d = i10 + 1;
            s0Var.b(14, i10, i9, null, bundle);
        }
    }
}
