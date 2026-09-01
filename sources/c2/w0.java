package c2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class w0 extends r implements t0 {
    public final String f;
    public String g;
    public String h;
    public boolean i;
    public int k;
    public s0 l;
    public final /* synthetic */ y0 n;
    public int j = -1;
    public int m = -1;

    public w0(y0 y0Var, String str) {
        this.n = y0Var;
        this.f = str;
    }

    @Override // c2.t0
    public final void a(s0 s0Var) {
        v0 v0Var = new v0(this);
        this.l = s0Var;
        int i10 = s0Var.e;
        s0Var.e = i10 + 1;
        int i11 = s0Var.d;
        s0Var.d = i11 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f);
        s0Var.b(11, i11, i10, null, bundle);
        s0Var.h.put(i11, v0Var);
        this.m = i10;
        if (this.i) {
            s0Var.a(i10);
            int i12 = this.j;
            if (i12 >= 0) {
                s0Var.c(this.m, i12);
                this.j = -1;
            }
            int i13 = this.k;
            if (i13 != 0) {
                s0Var.d(this.m, i13);
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
            int i10 = this.m;
            int i11 = s0Var.d;
            s0Var.d = i11 + 1;
            s0Var.b(4, i11, i10, null, null);
            this.l = null;
            this.m = 0;
        }
    }

    @Override // c2.s
    public final void d() {
        y0 y0Var = this.n;
        y0Var.v.remove(this);
        c();
        y0Var.r();
    }

    @Override // c2.s
    public final void e() {
        this.i = true;
        s0 s0Var = this.l;
        if (s0Var != null) {
            s0Var.a(this.m);
        }
    }

    @Override // c2.s
    public final void f(int i10) {
        s0 s0Var = this.l;
        if (s0Var != null) {
            s0Var.c(this.m, i10);
        } else {
            this.j = i10;
            this.k = 0;
        }
    }

    @Override // c2.s
    public final void g() {
        h(0);
    }

    @Override // c2.s
    public final void h(int i10) {
        this.i = false;
        s0 s0Var = this.l;
        if (s0Var != null) {
            int i11 = this.m;
            Bundle h = android.support.v4.media.a.h(i10, "unselectReason");
            int i12 = s0Var.d;
            s0Var.d = i12 + 1;
            s0Var.b(6, i12, i11, null, h);
        }
    }

    @Override // c2.s
    public final void i(int i10) {
        s0 s0Var = this.l;
        if (s0Var != null) {
            s0Var.d(this.m, i10);
        } else {
            this.k += i10;
        }
    }

    @Override // c2.r
    public final String j() {
        return this.g;
    }

    @Override // c2.r
    public final String k() {
        return this.h;
    }

    @Override // c2.r
    public final void m(String str) {
        s0 s0Var = this.l;
        if (s0Var != null) {
            int i10 = this.m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = s0Var.d;
            s0Var.d = i11 + 1;
            s0Var.b(12, i11, i10, null, bundle);
        }
    }

    @Override // c2.r
    public final void n(String str) {
        s0 s0Var = this.l;
        if (s0Var != null) {
            int i10 = this.m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = s0Var.d;
            s0Var.d = i11 + 1;
            s0Var.b(13, i11, i10, null, bundle);
        }
    }

    @Override // c2.r
    public final void o(List list) {
        s0 s0Var = this.l;
        if (s0Var != null) {
            int i10 = this.m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i11 = s0Var.d;
            s0Var.d = i11 + 1;
            s0Var.b(14, i11, i10, null, bundle);
        }
    }
}
