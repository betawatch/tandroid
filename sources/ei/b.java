package ei;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.i0;
import org.telegram.messenger.sc;
import org.telegram.messenger.tz;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.tk0;
import w7.b6;
import w7.b9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class b {
    public final r a;
    public final hi.c b;
    public final tg.b c;
    public final tg.b d;
    public final hi.d e;
    public final tg.b f;
    public final e g;
    public final hi.f h;
    public Runnable i;
    public final hi.a j;
    public FrameLayout k;
    public ViewGroup l;
    public ug.a m;

    public b(r rVar, org.telegram.ui.ActionBar.o oVar) {
        this.a = rVar;
        rVar.a = new a1.c(this, 20);
        rVar.d = new gi.b(i0.L(48.0f));
        hi.c cVar = new hi.c();
        this.b = cVar;
        cVar.a(oVar.c());
        rVar.E.add(new p(cVar, oVar));
        if (Build.VERSION.SDK_INT < 31 || !tz.f()) {
            this.j = hi.e.a;
            this.g = null;
            this.h = null;
            tg.b bVar = new tg.b(cVar);
            this.c = bVar;
            bVar.h = rVar;
            this.e = null;
            this.d = bVar;
            this.f = bVar;
            return;
        }
        e eVar = new e();
        this.g = eVar;
        hi.f fVar = new hi.f(cVar);
        fVar.f = cVar;
        tg.b bVar2 = new tg.b(fVar);
        this.c = bVar2;
        bVar2.h = rVar;
        int L = i0.L(sc.e(262144) ? 8.0f : 48.0f);
        bVar2.b = L;
        bVar2.c = L;
        bVar2.i = true;
        fVar.h = eVar.d(2);
        bVar2.b = 0;
        bVar2.c = 0;
        this.h = fVar;
        hi.f fVar2 = new hi.f(cVar);
        fVar2.f = cVar;
        fVar2.h = eVar.d(3);
        hi.d dVar = new hi.d(fVar, fVar2);
        this.e = dVar;
        tg.b bVar3 = new tg.b(fVar2);
        this.f = bVar3;
        bVar3.h = rVar;
        tg.b bVar4 = new tg.b(dVar);
        this.d = bVar4;
        bVar4.h = rVar;
        bVar4.i = true;
        this.j = eVar.d(1);
    }

    public static int c(int i10) {
        return Math.max(i0.L(8.0f), i0.L(48.0f) - i10);
    }

    public static int d(int i10) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        return i0.L(7.0f) + ((i10 + currentActionBarHeight) - ((currentActionBarHeight - i0.L(46.0f)) / 2));
    }

    public static void e(ViewGroup viewGroup, int i10, int i11, int i12, int i13) {
        int i14 = -c(i10);
        int i15 = (i10 + i12) - i14;
        int i16 = -c(i11);
        i0.A3(viewGroup, 0, i14, 0, i16);
        viewGroup.setPadding(0, i15, 0, (i11 + i13) - i16);
    }

    public final fi.f a(View view) {
        fi.f fVar = new fi.f(this.j);
        fi.g gVar = new fi.g(i0.L(32.0f));
        fi.g gVar2 = new fi.g(i0.L(56.0f));
        fi.g gVar3 = new fi.g(i0.L(48.0f));
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
        fVar.I = zs.q2;
        hi.c cVar = fVar.G;
        if (cVar != null) {
            fVar.H = t6.r1(zs.q2 / 255.0f, cVar.b);
        }
        fVar.w = true;
        fVar.invalidateSelf();
        fVar.D = gVar;
        fVar.w = true;
        fVar.invalidateSelf();
        fVar.E = gVar2;
        fVar.w = true;
        fVar.invalidateSelf();
        fVar.K = zs.n3;
        hi.c cVar2 = fVar.G;
        if (cVar2 != null) {
            fVar.J = t6.r1(zs.n3 / 255.0f, cVar2.b);
        }
        fVar.x = true;
        fVar.invalidateSelf();
        fVar.F = gVar3;
        fVar.x = true;
        fVar.invalidateSelf();
        this.a.c.add(new q(view, fVar));
        return fVar;
    }

    public final fi.f b(View view) {
        fi.f fVar = new fi.f(this.j);
        fi.g gVar = new fi.g(i0.L(28.0f));
        fi.g gVar2 = new fi.g(i0.L(40.0f));
        fi.g gVar3 = new fi.g(i0.L(30.0f));
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
        fVar.I = zs.q2;
        hi.c cVar = fVar.G;
        if (cVar != null) {
            fVar.H = t6.r1(zs.q2 / 255.0f, cVar.b);
        }
        fVar.w = true;
        fVar.invalidateSelf();
        fVar.D = gVar;
        fVar.w = true;
        fVar.invalidateSelf();
        fVar.E = gVar2;
        fVar.w = true;
        fVar.invalidateSelf();
        fVar.K = zs.n3;
        hi.c cVar2 = fVar.G;
        if (cVar2 != null) {
            fVar.J = t6.r1(zs.n3 / 255.0f, cVar2.b);
        }
        fVar.x = true;
        fVar.invalidateSelf();
        fVar.F = gVar3;
        fVar.x = true;
        fVar.invalidateSelf();
        this.a.c.add(new q(view, fVar));
        return fVar;
    }

    public final void f(FrameLayout frameLayout, tk0 tk0Var, View view, p6 p6Var) {
        this.k = frameLayout;
        this.l = tk0Var;
        tk0Var.setCaptureSectionsDecoratorAllowed(true);
        this.m = new a(1, tk0Var, frameLayout);
        this.a.b(tk0Var);
        tk0Var.setClipToPadding(false);
        g(frameLayout, view, p6Var);
    }

    public final void g(FrameLayout frameLayout, View view, p6 p6Var) {
        if (view == null) {
            return;
        }
        i0.E2(view);
        frameLayout.addView(view, b6.e(-1, -2, 48));
        boolean z10 = view instanceof i5;
        tg.b bVar = this.c;
        if (z10) {
            i5 i5Var = (i5) view;
            i5Var.setExtraHeight(i0.L(6.0f));
            wg.d m10 = b9.m(p6Var);
            i5Var.L = bVar;
            i5Var.M = m10;
            i5Var.m();
            i5Var.n0 = this.d;
            i5Var.o0 = this.e;
            return;
        }
        if (view instanceof org.telegram.ui.ActionBar.l) {
            org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) view;
            lVar.setAddToContainer(false);
            lVar.setCenterTitleAndGlass(true);
            lVar.setExtraHeight(i0.L(6.0f));
            lVar.T0 = true;
            lVar.M(bVar, b9.m(p6Var), false);
        }
    }
}
