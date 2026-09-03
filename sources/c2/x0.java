package c2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class x0 extends r implements u0 {
    public final String f;
    public String g;
    public String h;
    public boolean i;
    public int k;
    public t0 l;
    public final /* synthetic */ z0 n;
    public int j = -1;
    public int m = -1;

    public x0(z0 z0Var, String str) {
        this.n = z0Var;
        this.f = str;
    }

    @Override // c2.u0
    public final void a(t0 t0Var) {
        w0 w0Var = new w0(this);
        this.l = t0Var;
        int i10 = t0Var.e;
        t0Var.e = i10 + 1;
        int i11 = t0Var.d;
        t0Var.d = i11 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f);
        t0Var.b(11, i11, i10, null, bundle);
        t0Var.h.put(i11, w0Var);
        this.m = i10;
        if (this.i) {
            t0Var.a(i10);
            int i12 = this.j;
            if (i12 >= 0) {
                t0Var.c(this.m, i12);
                this.j = -1;
            }
            int i13 = this.k;
            if (i13 != 0) {
                t0Var.d(this.m, i13);
                this.k = 0;
            }
        }
    }

    @Override // c2.u0
    public final int b() {
        return this.m;
    }

    @Override // c2.u0
    public final void c() {
        t0 t0Var = this.l;
        if (t0Var != null) {
            int i10 = this.m;
            int i11 = t0Var.d;
            t0Var.d = i11 + 1;
            t0Var.b(4, i11, i10, null, null);
            this.l = null;
            this.m = 0;
        }
    }

    @Override // c2.s
    public final void d() {
        z0 z0Var = this.n;
        z0Var.v.remove(this);
        c();
        z0Var.r();
    }

    @Override // c2.s
    public final void e() {
        this.i = true;
        t0 t0Var = this.l;
        if (t0Var != null) {
            t0Var.a(this.m);
        }
    }

    @Override // c2.s
    public final void f(int i10) {
        t0 t0Var = this.l;
        if (t0Var != null) {
            t0Var.c(this.m, i10);
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
        t0 t0Var = this.l;
        if (t0Var != null) {
            int i11 = this.m;
            Bundle h = android.support.v4.media.a.h(i10, "unselectReason");
            int i12 = t0Var.d;
            t0Var.d = i12 + 1;
            t0Var.b(6, i12, i11, null, h);
        }
    }

    @Override // c2.s
    public final void i(int i10) {
        t0 t0Var = this.l;
        if (t0Var != null) {
            t0Var.d(this.m, i10);
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
        t0 t0Var = this.l;
        if (t0Var != null) {
            int i10 = this.m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = t0Var.d;
            t0Var.d = i11 + 1;
            t0Var.b(12, i11, i10, null, bundle);
        }
    }

    @Override // c2.r
    public final void n(String str) {
        t0 t0Var = this.l;
        if (t0Var != null) {
            int i10 = this.m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = t0Var.d;
            t0Var.d = i11 + 1;
            t0Var.b(13, i11, i10, null, bundle);
        }
    }

    @Override // c2.r
    public final void o(List list) {
        t0 t0Var = this.l;
        if (t0Var != null) {
            int i10 = this.m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i11 = t0Var.d;
            t0Var.d = i11 + 1;
            t0Var.b(14, i11, i10, null, bundle);
        }
    }
}
