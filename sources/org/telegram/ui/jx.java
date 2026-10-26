package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class jx extends org.telegram.ui.Components.ep0 {
    public final ag.h0 b1;
    public final ag.h0 c1;
    public final /* synthetic */ cy d1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx(cy cyVar, Activity activity, cy cyVar2, int i10, int i11, int i12, long j10, ix ixVar) {
        super(activity, cyVar2, i10, i11, i12, j10, ixVar);
        this.d1 = cyVar;
        this.b1 = new ag.h0(2);
        this.c1 = new ag.h0(8);
    }

    public final void T() {
        oi.q qVar;
        qVar = ((org.telegram.ui.ActionBar.r2) this.d1).glassEngine;
        qVar.e++;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        super.dispatchDraw(canvas);
        cy cyVar = this.d1;
        if (cyVar.a0 != null || cyVar.Y2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            kVar = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
            int dp2 = ((AndroidUtilities.dp(cyVar.a) + kVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f)) - (cyVar.Y2 != 0 ? dp : 0);
            org.telegram.ui.Components.ws wsVar = cyVar.J1;
            int c10 = dp2 + (wsVar != null ? (int) wsVar.c(AndroidUtilities.dp(7.0f)) : 0);
            int o12 = org.telegram.ui.ActionBar.y6.o1(0.7f, cyVar.getThemedColor(org.telegram.ui.ActionBar.y6.d6));
            ag.h0 h0Var = this.b1;
            h0Var.b(o12);
            h0Var.c(c10, 0);
            h0Var.setBounds(0, 0, getMeasuredWidth(), c10 + dp);
            h0Var.draw(canvas);
        }
        if (cyVar.g4 > AndroidUtilities.dp(32.0f)) {
            int o13 = org.telegram.ui.ActionBar.y6.o1(0.9f, cyVar.getThemedColor(org.telegram.ui.ActionBar.y6.d6));
            ag.h0 h0Var2 = this.c1;
            h0Var2.b(o13);
            h0Var2.setBounds(0, getMeasuredHeight() - cyVar.g4, getMeasuredWidth(), getMeasuredHeight());
            h0Var2.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        oi.q qVar;
        super.setAlpha(f7);
        qVar = ((org.telegram.ui.ActionBar.r2) this.d1).glassEngine;
        qVar.g();
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        n31 n31Var = this.d1.Z;
        if (n31Var != null) {
            n31Var.setTranslationY(f7);
        }
    }

    @Override // org.telegram.ui.Components.u91
    public final void y(int i10) {
        org.telegram.ui.Components.dp0 dp0Var = this.V;
        this.d1.m5(dp0Var != null && dp0Var.h(i10) == 2);
    }
}
