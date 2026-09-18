package li;

import android.os.Build;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import k2.v;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.ActionBar.n;
import org.telegram.ui.Components.wl0;
import w7.y5;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class b {
    public final i a;
    public final ah.c b;
    public final ah.c c;
    public final ah.i d;
    public FrameLayout e;
    public ViewGroup f;
    public bh.a g;

    public b(i iVar, n nVar) {
        this.a = iVar;
        iVar.a = new v(this, 2);
        iVar.d = new mi.b(AndroidUtilities.dp(48.0f));
        fh.c cVar = new fh.c();
        cVar.a(nVar.a.getThemedColor(j6.a7));
        iVar.s.add(new g(cVar, nVar));
        this.c = new ah.c(cVar);
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.chatBlurEnabled()) {
            this.d = null;
            ah.c cVar2 = new ah.c(cVar);
            this.b = cVar2;
            cVar2.h = iVar;
            return;
        }
        ah.i iVar2 = new ah.i(false);
        this.d = iVar2;
        iVar.i.add(iVar2);
        fh.d dVar = new fh.d(cVar);
        dVar.f = cVar;
        ah.c cVar3 = new ah.c(dVar);
        this.b = cVar3;
        cVar3.h = iVar;
        int dp = AndroidUtilities.dp(LiteMode.isEnabled(262144) ? 8.0f : 48.0f);
        cVar3.b = dp;
        cVar3.c = dp;
        cVar3.i = LiteMode.isEnabled(262144);
        int i10 = LiteMode.isEnabled(262144) ? -2 : -3;
        dVar.d = iVar2;
        dVar.e = i10;
    }

    public static void a(ViewGroup viewGroup, int i10, int i11, int i12) {
        int min = Math.min(0, i10 - AndroidUtilities.dp(48.0f));
        int i13 = (i10 + i12) - min;
        int min2 = Math.min(0, i11 - AndroidUtilities.dp(48.0f));
        AndroidUtilities.setViewLayoutMargins(viewGroup, 0, min, 0, min2);
        viewGroup.setPadding(0, i13, 0, i11 - min2);
    }

    public final void b(FrameLayout frameLayout, wl0 wl0Var, k kVar, e6 e6Var) {
        this.e = frameLayout;
        this.f = wl0Var;
        wl0Var.setCaptureSectionsDecoratorAllowed(true);
        this.g = new a(0, wl0Var, frameLayout);
        this.a.a(wl0Var);
        kVar.setCenterTitleAndGlass(true);
        kVar.M(this.b, eh.b.m(e6Var), false);
        kVar.setAddToContainer(false);
        AndroidUtilities.removeFromParent(kVar);
        frameLayout.addView(kVar, y5.e(-1, -2, 48));
        ah.e eVar = new ah.e(this.c.c(kVar, null, false));
        eVar.b(-AndroidUtilities.dp(50.0f), true);
        eVar.q = 224;
        kVar.setBackground(eVar);
        kVar.setExtraHeight(AndroidUtilities.dp(12.0f));
        wl0Var.setClipToPadding(false);
    }
}
