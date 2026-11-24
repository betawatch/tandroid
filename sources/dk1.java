// default package

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class dk1 extends ogc {
    public final Activity a;
    public final int b;
    public final int c;
    public final ylb d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ ek1 f;

    public dk1(ek1 ek1Var, Activity activity, int i, long j, int i2, ylb ylbVar) {
        this.f = ek1Var;
        this.a = activity;
        this.b = i;
        this.c = i2;
        this.d = ylbVar;
        i();
    }

    @Override // ogc
    public final void b(View view, int i, int i2) {
        this.f.b.L(view);
    }

    @Override // ogc
    public final View d(int i) {
        return new ck1(this.f, this.a, i, this.b, this.c, new eh((Object) this, i, (byte) 13), this.d);
    }

    @Override // ogc
    public final int e() {
        return this.e.size();
    }

    @Override // ogc
    public final CharSequence g(int i) {
        int h = h(i);
        return h != 0 ? h != 1 ? "" : jb6.M0(2131748109, null) : jb6.M0(2131748110, null);
    }

    @Override // ogc
    public final int h(int i) {
        if (i < 0) {
            return 1;
        }
        ArrayList arrayList = this.e;
        if (i < arrayList.size()) {
            return ((c6c) arrayList.get(i)).A;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ek1 ek1Var = this.f;
        if (!ek1Var.n.isEmpty()) {
            arrayList.add(c6c.D(1));
        }
        if (ek1Var.r.isEmpty()) {
            return;
        }
        arrayList.add(c6c.D(0));
    }
}
