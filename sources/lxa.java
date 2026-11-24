// default package

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lxa extends ogc {
    public final Context a;
    public final int b;
    public final boolean c;
    public final int d;
    public final ylb e;
    public final long f;
    public v59 g;
    public sy4 h;
    public final ArrayList i = new ArrayList();

    public lxa(Context context, int i, boolean z, long j, int i2, ylb ylbVar) {
        this.a = context;
        this.b = i;
        this.c = z;
        this.d = i2;
        this.e = ylbVar;
        this.f = j;
        i();
    }

    @Override // ogc
    public final void b(View view, int i, int i2) {
        v59 v59Var = this.g;
        if (v59Var != null) {
            v59Var.L(view);
        }
    }

    @Override // ogc
    public final View d(int i) {
        kxa kxaVar = new kxa(this.a, this.c, this.f, i, this.b, this.d, this.e);
        if (this.g != null) {
            kxaVar.setClipChildren(false);
            kxaVar.setClipToPadding(false);
            q7c q7cVar = kxaVar.a;
            q7cVar.setClipToPadding(false);
            q7cVar.s1(gm.L(12.0f), gm.L(16.0f), false);
            q7cVar.g3.r = false;
            q7cVar.setCaptureSectionsDecoratorAllowed(true);
            q7cVar.setOverScrollMode(0);
            sy4 sy4Var = this.h;
            if (sy4Var != null) {
                sy4Var.b(q7cVar);
            }
        }
        return kxaVar;
    }

    @Override // ogc
    public final int e() {
        return this.i.size();
    }

    @Override // ogc
    public final CharSequence g(int i) {
        int h = h(i);
        return h != 0 ? h != 1 ? h != 2 ? "" : jb6.M0(2131744607, null) : jb6.M0(2131744608, null) : jb6.M0(2131744609, null);
    }

    @Override // ogc
    public final int h(int i) {
        if (i < 0) {
            return 0;
        }
        ArrayList arrayList = this.i;
        if (i < arrayList.size()) {
            return ((c6c) arrayList.get(i)).A;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.i;
        arrayList.clear();
        long j = this.f;
        int i = this.b;
        if (j == 0) {
            jva v = jva.v(i, this.c);
            arrayList.add(c6c.D(0));
            if (v.K(1)) {
                arrayList.add(c6c.D(1));
            }
            if (v.K(2)) {
                arrayList.add(c6c.D(2));
                return;
            }
            return;
        }
        ku0 g = ku0.g(i);
        arrayList.add(c6c.D(0));
        if (!g.k(j).a[1].isEmpty()) {
            arrayList.add(c6c.D(1));
        }
        if (g.k(j).a[2].isEmpty()) {
            return;
        }
        arrayList.add(c6c.D(2));
    }
}
