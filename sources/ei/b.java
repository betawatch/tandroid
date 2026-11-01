package ei;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.at;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.uk0;
import w7.b6;
import w7.b9;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
    public final hi.f i;
    public Runnable j;
    public final hi.a k;
    public FrameLayout l;
    public ViewGroup m;
    public ug.a n;

    public b(r rVar, org.telegram.ui.ActionBar.o oVar) {
        this.a = rVar;
        rVar.a = new a1.c(this, 20);
        rVar.d = new gi.b(i0.L(48.0f));
        hi.c cVar = new hi.c();
        this.b = cVar;
        cVar.a(oVar.c());
        rVar.E.add(new p(cVar, oVar));
        if (Build.VERSION.SDK_INT < 31) {
            this.k = hi.e.a;
            this.g = null;
            this.h = null;
            this.i = null;
            tg.b bVar = new tg.b(cVar, cVar, cVar);
            this.c = bVar;
            bVar.j = rVar;
            this.e = null;
            this.d = bVar;
            this.f = bVar;
            return;
        }
        e eVar = new e();
        this.g = eVar;
        hi.f fVar = new hi.f(cVar);
        fVar.f = cVar;
        fVar.h = eVar.d(2);
        this.h = fVar;
        hi.f fVar2 = new hi.f(cVar);
        this.i = fVar2;
        fVar2.f = cVar;
        fVar2.h = eVar.d(3);
        tg.b bVar2 = new tg.b(fVar, fVar2, cVar);
        this.c = bVar2;
        bVar2.j = rVar;
        bVar2.k = true;
        hi.d dVar = new hi.d(fVar, fVar2);
        this.e = dVar;
        tg.b bVar3 = new tg.b(fVar2, fVar2, cVar);
        this.f = bVar3;
        bVar3.j = rVar;
        tg.b bVar4 = new tg.b(dVar, fVar2, cVar);
        this.d = bVar4;
        bVar4.j = rVar;
        bVar4.k = true;
        this.k = eVar.d(1);
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

    public final fi.g a(View view) {
        fi.g gVar = new fi.g(this.k);
        fi.h hVar = new fi.h(i0.L(32.0f));
        fi.h hVar2 = new fi.h(i0.L(56.0f));
        fi.h hVar3 = new fi.h(i0.L(48.0f));
        if (gVar.y != 1) {
            gVar.y = 1;
            gVar.w = true;
            gVar.x = true;
            gVar.invalidateSelf();
        }
        gVar.G = this.b;
        gVar.w = true;
        gVar.updateColors();
        gVar.invalidateSelf();
        gVar.I = at.q2;
        hi.c cVar = gVar.G;
        if (cVar != null) {
            gVar.H = t6.r1(at.q2 / 255.0f, cVar.b);
        }
        gVar.w = true;
        gVar.invalidateSelf();
        gVar.D = hVar;
        gVar.w = true;
        gVar.invalidateSelf();
        gVar.E = hVar2;
        gVar.w = true;
        gVar.invalidateSelf();
        gVar.K = at.n3;
        hi.c cVar2 = gVar.G;
        if (cVar2 != null) {
            gVar.J = t6.r1(at.n3 / 255.0f, cVar2.b);
        }
        gVar.x = true;
        gVar.invalidateSelf();
        gVar.F = hVar3;
        gVar.x = true;
        gVar.invalidateSelf();
        this.a.c.add(new q(view, gVar));
        return gVar;
    }

    public final fi.g b(View view) {
        fi.g gVar = new fi.g(this.k);
        fi.h hVar = new fi.h(i0.L(28.0f));
        fi.h hVar2 = new fi.h(i0.L(40.0f));
        fi.h hVar3 = new fi.h(i0.L(30.0f));
        if (gVar.y != 4) {
            gVar.y = 4;
            gVar.w = true;
            gVar.x = true;
            gVar.invalidateSelf();
        }
        gVar.G = this.b;
        gVar.w = true;
        gVar.updateColors();
        gVar.invalidateSelf();
        gVar.I = at.q2;
        hi.c cVar = gVar.G;
        if (cVar != null) {
            gVar.H = t6.r1(at.q2 / 255.0f, cVar.b);
        }
        gVar.w = true;
        gVar.invalidateSelf();
        gVar.D = hVar;
        gVar.w = true;
        gVar.invalidateSelf();
        gVar.E = hVar2;
        gVar.w = true;
        gVar.invalidateSelf();
        gVar.K = at.n3;
        hi.c cVar2 = gVar.G;
        if (cVar2 != null) {
            gVar.J = t6.r1(at.n3 / 255.0f, cVar2.b);
        }
        gVar.x = true;
        gVar.invalidateSelf();
        gVar.F = hVar3;
        gVar.x = true;
        gVar.invalidateSelf();
        this.a.c.add(new q(view, gVar));
        return gVar;
    }

    public final void f(FrameLayout frameLayout, uk0 uk0Var, View view, p6 p6Var) {
        this.l = frameLayout;
        this.m = uk0Var;
        uk0Var.setCaptureSectionsDecoratorAllowed(true);
        this.n = new a(1, uk0Var, frameLayout);
        this.a.b(uk0Var);
        uk0Var.setClipToPadding(false);
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
