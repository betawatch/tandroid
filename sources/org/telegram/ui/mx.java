package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class mx extends org.telegram.ui.Components.hn0 {
    public final ff.c0 U0;
    public final ff.c0 V0;
    public final /* synthetic */ dy W0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx(dy dyVar, Activity activity, dy dyVar2, int i9, int i10, int i11, long j10, ix ixVar) {
        super(activity, dyVar2, i9, i10, i11, j10, ixVar);
        this.W0 = dyVar;
        this.U0 = new ff.c0(2);
        this.V0 = new ff.c0(8);
    }

    public final void S(int i9, int i10) {
        dy dyVar;
        ig.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = (dyVar = this.W0).h4) == null) {
            return;
        }
        eVar.f(i9, i10);
        dyVar.m3();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        super.dispatchDraw(canvas);
        dy dyVar = this.W0;
        if (dyVar.W != null || dyVar.T2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
            int dp2 = ((AndroidUtilities.dp(dyVar.a) + kVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f)) - (dyVar.T2 != 0 ? dp : 0);
            org.telegram.ui.Components.bs bsVar = dyVar.F1;
            int c10 = dp2 + (bsVar != null ? (int) bsVar.c(AndroidUtilities.dp(7.0f)) : 0);
            int l1 = org.telegram.ui.ActionBar.f6.l1(0.7f, dyVar.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
            ff.c0 c0Var = this.U0;
            c0Var.b(l1);
            c0Var.c(c10, 0);
            c0Var.setBounds(0, 0, getMeasuredWidth(), c10 + dp);
            c0Var.draw(canvas);
        }
        if (dyVar.c4 > AndroidUtilities.dp(32.0f)) {
            int l12 = org.telegram.ui.ActionBar.f6.l1(0.9f, dyVar.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
            ff.c0 c0Var2 = this.V0;
            c0Var2.b(l12);
            c0Var2.setBounds(0, getMeasuredHeight() - dyVar.c4, getMeasuredWidth(), getMeasuredHeight());
            c0Var2.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        this.W0.m3();
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        o31 o31Var = this.W0.V;
        if (o31Var != null) {
            o31Var.setTranslationY(f10);
        }
    }

    @Override // org.telegram.ui.Components.n71
    public final void w(boolean z10) {
        if (Build.VERSION.SDK_INT >= 31) {
            dy dyVar = this.W0;
            if (dyVar.h4 != null) {
                dyVar.m3();
            }
        }
    }

    @Override // org.telegram.ui.Components.n71
    public final void x(int i9) {
        org.telegram.ui.Components.gn0 gn0Var = this.P;
        this.W0.c5(gn0Var != null && gn0Var.h(i9) == 2);
    }
}
