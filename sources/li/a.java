package li;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import k2.v;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.bi;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.zl0;
import w7.z5;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class a {
    public final p a;
    public final fh.c b;
    public final ah.c c;
    public final ah.i d;
    public final d e;
    public final oi.a f;
    public FrameLayout g;
    public ViewGroup h;
    public bh.a i;

    public a(p pVar, org.telegram.ui.ActionBar.n nVar) {
        this.a = pVar;
        pVar.a = new v(this, 2);
        pVar.d = new ni.b(AndroidUtilities.dp(48.0f));
        fh.c cVar = new fh.c();
        this.b = cVar;
        cVar.a(nVar.f());
        pVar.A.add(new n(cVar, nVar));
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.chatBlurEnabled()) {
            this.f = oi.b.a;
            this.e = null;
            this.d = null;
            ah.c cVar2 = new ah.c(cVar);
            this.c = cVar2;
            cVar2.h = pVar;
            return;
        }
        ah.i iVar = new ah.i(false, false);
        this.d = iVar;
        d dVar = new d();
        this.e = dVar;
        pVar.a(iVar);
        fh.d dVar2 = new fh.d(cVar);
        dVar2.f = cVar;
        ah.f.c();
        ah.c cVar3 = new ah.c(dVar2);
        this.c = cVar3;
        cVar3.h = pVar;
        int dp = AndroidUtilities.dp(LiteMode.isEnabled(262144) ? 8.0f : 48.0f);
        cVar3.b = dp;
        cVar3.c = dp;
        cVar3.i = LiteMode.isEnabled(262144);
        dVar2.h = dVar.d(2);
        cVar3.b = 0;
        cVar3.c = 0;
        this.f = dVar.d(1);
    }

    public static void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13) {
        int C = bi.C(48.0f, i10, -AndroidUtilities.dp(8.0f));
        int i14 = (i10 + i12) - C;
        int C2 = bi.C(48.0f, i11, -AndroidUtilities.dp(8.0f));
        AndroidUtilities.setViewLayoutMargins(viewGroup, 0, C, 0, C2);
        viewGroup.setPadding(0, i14, 0, (i11 + i13) - C2);
    }

    public final mi.f a(View view) {
        mi.f fVar = new mi.f(this.f);
        mi.g gVar = new mi.g(AndroidUtilities.dp(32.0f));
        mi.g gVar2 = new mi.g(AndroidUtilities.dp(56.0f));
        mi.g gVar3 = new mi.g(AndroidUtilities.dp(48.0f));
        if (fVar.l != 1) {
            fVar.l = 1;
            fVar.j = true;
            fVar.k = true;
            fVar.invalidateSelf();
        }
        fVar.p = this.b;
        fVar.j = true;
        fVar.k();
        fVar.invalidateSelf();
        fVar.r = 160;
        fh.c cVar = fVar.p;
        if (cVar != null) {
            fVar.q = i6.l1(160 / 255.0f, cVar.b);
        }
        fVar.j = true;
        fVar.invalidateSelf();
        fVar.m = gVar;
        fVar.j = true;
        fVar.invalidateSelf();
        fVar.n = gVar2;
        fVar.j = true;
        fVar.invalidateSelf();
        fVar.t = 210;
        fh.c cVar2 = fVar.p;
        if (cVar2 != null) {
            fVar.s = i6.l1(210 / 255.0f, cVar2.b);
        }
        fVar.k = true;
        fVar.invalidateSelf();
        fVar.o = gVar3;
        fVar.k = true;
        fVar.invalidateSelf();
        this.a.c.add(new o(view, fVar));
        return fVar;
    }

    public final mi.f b(View view) {
        mi.f fVar = new mi.f(this.f);
        mi.g gVar = new mi.g(AndroidUtilities.dp(28.0f));
        mi.g gVar2 = new mi.g(AndroidUtilities.dp(40.0f));
        mi.g gVar3 = new mi.g(AndroidUtilities.dp(30.0f));
        if (fVar.l != 4) {
            fVar.l = 4;
            fVar.j = true;
            fVar.k = true;
            fVar.invalidateSelf();
        }
        fVar.p = this.b;
        fVar.j = true;
        fVar.k();
        fVar.invalidateSelf();
        fVar.r = 160;
        fh.c cVar = fVar.p;
        if (cVar != null) {
            fVar.q = i6.l1(160 / 255.0f, cVar.b);
        }
        fVar.j = true;
        fVar.invalidateSelf();
        fVar.m = gVar;
        fVar.j = true;
        fVar.invalidateSelf();
        fVar.n = gVar2;
        fVar.j = true;
        fVar.invalidateSelf();
        fVar.t = 210;
        fh.c cVar2 = fVar.p;
        if (cVar2 != null) {
            fVar.s = i6.l1(210 / 255.0f, cVar2.b);
        }
        fVar.k = true;
        fVar.invalidateSelf();
        fVar.o = gVar3;
        fVar.k = true;
        fVar.invalidateSelf();
        this.a.c.add(new o(view, fVar));
        return fVar;
    }

    public final void d(FrameLayout frameLayout, zl0 zl0Var, org.telegram.ui.ActionBar.k kVar, d6 d6Var) {
        this.g = frameLayout;
        this.h = zl0Var;
        zl0Var.setCaptureSectionsDecoratorAllowed(true);
        this.i = new di.f(1, zl0Var, frameLayout);
        this.a.b(zl0Var);
        zl0Var.setClipToPadding(false);
        AndroidUtilities.removeFromParent(kVar);
        frameLayout.addView(kVar, z5.e(-1, -2, 48));
        kVar.setAddToContainer(false);
        kVar.setCenterTitleAndGlass(true);
        kVar.setExtraHeight(AndroidUtilities.dp(6.0f));
        kVar.T0 = true;
        kVar.J(this.c, eh.b.m(d6Var), false);
    }

    public final void e(FrameLayout frameLayout, h91 h91Var, org.telegram.ui.ActionBar.k kVar, d6 d6Var) {
        this.g = frameLayout;
        this.h = h91Var;
        this.a.c(h91Var);
        AndroidUtilities.removeFromParent(kVar);
        frameLayout.addView(kVar, z5.e(-1, -2, 48));
        kVar.setAddToContainer(false);
        kVar.setCenterTitleAndGlass(true);
        kVar.setExtraHeight(AndroidUtilities.dp(6.0f));
        kVar.T0 = true;
        kVar.J(this.c, eh.b.m(d6Var), false);
    }
}
