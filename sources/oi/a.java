package oi;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.ha;
import l2.y;
import org.telegram.messenger.g0;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.y4;
import org.telegram.ui.Components.pj0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class a {
    public final q a;
    public final ri.c b;
    public final dh.c c;
    public final dh.c d;
    public final ri.d e;
    public final dh.c f;
    public final d g;
    public final ri.f h;
    public final ri.f i;
    public Runnable j;
    public final ri.a k;
    public boolean l;
    public FrameLayout m;
    public ViewGroup n;
    public eh.a o;

    public a(q qVar, org.telegram.ui.ActionBar.n nVar) {
        this.a = qVar;
        qVar.a = new y(this, 21);
        qVar.d = new qi.b(g0.L(48.0f));
        ri.c cVar = new ri.c();
        this.b = cVar;
        cVar.a(nVar.h());
        qVar.E.add(new o(cVar, nVar));
        if (Build.VERSION.SDK_INT < 31) {
            this.k = ri.e.a;
            this.g = null;
            this.h = null;
            this.i = null;
            dh.c cVar2 = new dh.c(cVar, cVar, cVar);
            this.c = cVar2;
            cVar2.j = qVar;
            this.e = null;
            this.d = cVar2;
            this.f = cVar2;
            return;
        }
        d dVar = new d();
        this.g = dVar;
        ri.f fVar = new ri.f(cVar);
        fVar.f = cVar;
        fVar.h = dVar.d(2);
        this.h = fVar;
        ri.f fVar2 = new ri.f(cVar);
        this.i = fVar2;
        fVar2.f = cVar;
        fVar2.h = dVar.d(3);
        dh.c cVar3 = new dh.c(fVar, fVar2, cVar);
        this.c = cVar3;
        cVar3.j = qVar;
        cVar3.k = true;
        ri.d dVar2 = new ri.d(fVar, fVar2);
        this.e = dVar2;
        dh.c cVar4 = new dh.c(fVar2, fVar2, cVar);
        this.f = cVar4;
        cVar4.j = qVar;
        dh.c cVar5 = new dh.c(dVar2, fVar2, cVar);
        this.d = cVar5;
        cVar5.j = qVar;
        cVar5.k = true;
        this.k = dVar.d(1);
    }

    public static int c(int i7) {
        return Math.max(g0.L(8.0f), g0.L(48.0f) - i7);
    }

    public static int d(int i7) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        return g0.L(7.0f) + ((i7 + currentActionBarHeight) - ((currentActionBarHeight - g0.L(46.0f)) / 2));
    }

    public static void e(ViewGroup viewGroup, int i7, int i10, int i11, int i12) {
        int i13 = -c(i7);
        int i14 = (i7 + i11) - i13;
        int i15 = -c(i10);
        g0.B3(viewGroup, 0, i13, 0, i15);
        viewGroup.setPadding(0, i14, 0, (i10 + i12) - i15);
    }

    public final pi.f a(View view) {
        pi.f fVar = new pi.f(this.k);
        pi.g gVar = new pi.g(g0.L(32.0f));
        pi.g gVar2 = new pi.g(g0.L(56.0f));
        pi.g gVar3 = new pi.g(g0.L(48.0f));
        if (fVar.y != 1) {
            fVar.y = 1;
            fVar.w = true;
            fVar.x = true;
            fVar.invalidateSelf();
        }
        fVar.G = this.b;
        fVar.w = true;
        fVar.updateColors();
        fVar.invalidateSelf();
        fVar.I = qs.q2;
        ri.c cVar = fVar.G;
        if (cVar != null) {
            fVar.H = k6.r1(qs.q2 / 255.0f, cVar.b);
        }
        fVar.w = true;
        fVar.invalidateSelf();
        fVar.D = gVar;
        fVar.w = true;
        fVar.invalidateSelf();
        fVar.E = gVar2;
        fVar.w = true;
        fVar.invalidateSelf();
        fVar.K = qs.n3;
        ri.c cVar2 = fVar.G;
        if (cVar2 != null) {
            fVar.J = k6.r1(qs.n3 / 255.0f, cVar2.b);
        }
        fVar.x = true;
        fVar.invalidateSelf();
        fVar.F = gVar3;
        fVar.x = true;
        fVar.invalidateSelf();
        this.a.c.add(new p(view, fVar));
        return fVar;
    }

    public final pi.f b(View view) {
        pi.f fVar = new pi.f(this.k);
        pi.g gVar = new pi.g(g0.L(28.0f));
        pi.g gVar2 = new pi.g(g0.L(40.0f));
        pi.g gVar3 = new pi.g(g0.L(30.0f));
        if (fVar.y != 4) {
            fVar.y = 4;
            fVar.w = true;
            fVar.x = true;
            fVar.invalidateSelf();
        }
        fVar.G = this.b;
        fVar.w = true;
        fVar.updateColors();
        fVar.invalidateSelf();
        fVar.I = qs.q2;
        ri.c cVar = fVar.G;
        if (cVar != null) {
            fVar.H = k6.r1(qs.q2 / 255.0f, cVar.b);
        }
        fVar.w = true;
        fVar.invalidateSelf();
        fVar.D = gVar;
        fVar.w = true;
        fVar.invalidateSelf();
        fVar.E = gVar2;
        fVar.w = true;
        fVar.invalidateSelf();
        fVar.K = qs.n3;
        ri.c cVar2 = fVar.G;
        if (cVar2 != null) {
            fVar.J = k6.r1(qs.n3 / 255.0f, cVar2.b);
        }
        fVar.x = true;
        fVar.invalidateSelf();
        fVar.F = gVar3;
        fVar.x = true;
        fVar.invalidateSelf();
        this.a.c.add(new p(view, fVar));
        return fVar;
    }

    public final void f(FrameLayout frameLayout, pj0 pj0Var, View view, f6 f6Var) {
        this.m = frameLayout;
        this.n = pj0Var;
        pj0Var.setCaptureSectionsDecoratorAllowed(true);
        this.o = new bi.g(4, pj0Var, frameLayout);
        this.a.b(pj0Var);
        pj0Var.setClipToPadding(false);
        g(frameLayout, view, f6Var);
    }

    public final void g(FrameLayout frameLayout, View view, f6 f6Var) {
        if (view == null) {
            return;
        }
        g0.E2(view);
        frameLayout.addView(view, ha.e(-1, -2, 48));
        boolean z9 = view instanceof y4;
        dh.c cVar = this.c;
        if (z9) {
            y4 y4Var = (y4) view;
            y4Var.setExtraHeight(g0.L(6.0f));
            gh.e m10 = c8.g0.m(f6Var);
            y4Var.L = cVar;
            y4Var.M = m10;
            y4Var.m();
            y4Var.n0 = this.d;
            y4Var.o0 = this.e;
            return;
        }
        if (view instanceof org.telegram.ui.ActionBar.k) {
            org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) view;
            kVar.setAddToContainer(false);
            kVar.setCenterTitleAndGlass(true);
            kVar.setExtraHeight(g0.L(6.0f));
            kVar.T0 = true;
            kVar.M(cVar, c8.g0.m(f6Var), false);
        }
    }
}
