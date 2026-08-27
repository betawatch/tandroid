package c2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class w0 extends q implements s0 {
    public final String f;
    public String g;
    public String h;
    public boolean i;
    public int k;
    public r0 l;
    public final /* synthetic */ y0 n;
    public int j = -1;
    public int m = -1;

    public w0(y0 y0Var, String str) {
        this.n = y0Var;
        this.f = str;
    }

    @Override // c2.s0
    public final void a(r0 r0Var) {
        v0 v0Var = new v0(this);
        this.l = r0Var;
        int i10 = r0Var.e;
        r0Var.e = i10 + 1;
        int i11 = r0Var.d;
        r0Var.d = i11 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f);
        r0Var.b(11, i11, i10, null, bundle);
        r0Var.h.put(i11, v0Var);
        this.m = i10;
        if (this.i) {
            r0Var.a(i10);
            int i12 = this.j;
            if (i12 >= 0) {
                r0Var.c(this.m, i12);
                this.j = -1;
            }
            int i13 = this.k;
            if (i13 != 0) {
                r0Var.d(this.m, i13);
                this.k = 0;
            }
        }
    }

    @Override // c2.s0
    public final int b() {
        return this.m;
    }

    @Override // c2.s0
    public final void c() {
        r0 r0Var = this.l;
        if (r0Var != null) {
            int i10 = this.m;
            int i11 = r0Var.d;
            r0Var.d = i11 + 1;
            r0Var.b(4, i11, i10, null, null);
            this.l = null;
            this.m = 0;
        }
    }

    @Override // c2.r
    public final void d() {
        y0 y0Var = this.n;
        y0Var.v.remove(this);
        c();
        y0Var.r();
    }

    @Override // c2.r
    public final void e() {
        this.i = true;
        r0 r0Var = this.l;
        if (r0Var != null) {
            r0Var.a(this.m);
        }
    }

    @Override // c2.r
    public final void f(int i10) {
        r0 r0Var = this.l;
        if (r0Var != null) {
            r0Var.c(this.m, i10);
        } else {
            this.j = i10;
            this.k = 0;
        }
    }

    @Override // c2.r
    public final void g() {
        h(0);
    }

    @Override // c2.r
    public final void h(int i10) {
        this.i = false;
        r0 r0Var = this.l;
        if (r0Var != null) {
            int i11 = this.m;
            Bundle g10 = a9.p.g(i10, "unselectReason");
            int i12 = r0Var.d;
            r0Var.d = i12 + 1;
            r0Var.b(6, i12, i11, null, g10);
        }
    }

    @Override // c2.r
    public final void i(int i10) {
        r0 r0Var = this.l;
        if (r0Var != null) {
            r0Var.d(this.m, i10);
        } else {
            this.k += i10;
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
        r0 r0Var = this.l;
        if (r0Var != null) {
            int i10 = this.m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = r0Var.d;
            r0Var.d = i11 + 1;
            r0Var.b(12, i11, i10, null, bundle);
        }
    }

    @Override // c2.q
    public final void n(String str) {
        r0 r0Var = this.l;
        if (r0Var != null) {
            int i10 = this.m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = r0Var.d;
            r0Var.d = i11 + 1;
            r0Var.b(13, i11, i10, null, bundle);
        }
    }

    @Override // c2.q
    public final void o(List list) {
        r0 r0Var = this.l;
        if (r0Var != null) {
            int i10 = this.m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i11 = r0Var.d;
            r0Var.d = i11 + 1;
            r0Var.b(14, i11, i10, null, bundle);
        }
    }
}
