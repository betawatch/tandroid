package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class mx extends org.telegram.ui.Components.fp0 {
    public final ag.h0 b1;
    public final ag.h0 c1;
    public final /* synthetic */ ey d1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx(ey eyVar, Activity activity, ey eyVar2, int i10, int i11, int i12, long j10, lx lxVar) {
        super(activity, eyVar2, i10, i11, i12, j10, lxVar);
        this.d1 = eyVar;
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
        ey eyVar = this.d1;
        if (eyVar.a0 != null || eyVar.Y2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            kVar = ((org.telegram.ui.ActionBar.r2) eyVar).actionBar;
            int dp2 = ((AndroidUtilities.dp(eyVar.a) + kVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f)) - (eyVar.Y2 != 0 ? dp : 0);
            org.telegram.ui.Components.ws wsVar = eyVar.J1;
            int c10 = dp2 + (wsVar != null ? (int) wsVar.c(AndroidUtilities.dp(7.0f)) : 0);
            int o12 = org.telegram.ui.ActionBar.y6.o1(0.7f, eyVar.getThemedColor(org.telegram.ui.ActionBar.y6.d6));
            ag.h0 h0Var = this.b1;
            h0Var.b(o12);
            h0Var.c(c10, 0);
            h0Var.setBounds(0, 0, getMeasuredWidth(), c10 + dp);
            h0Var.draw(canvas);
        }
        if (eyVar.g4 > AndroidUtilities.dp(32.0f)) {
            int o13 = org.telegram.ui.ActionBar.y6.o1(0.9f, eyVar.getThemedColor(org.telegram.ui.ActionBar.y6.d6));
            ag.h0 h0Var2 = this.c1;
            h0Var2.b(o13);
            h0Var2.setBounds(0, getMeasuredHeight() - eyVar.g4, getMeasuredWidth(), getMeasuredHeight());
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
        p31 p31Var = this.d1.Z;
        if (p31Var != null) {
            p31Var.setTranslationY(f7);
        }
    }

    @Override // org.telegram.ui.Components.v91
    public final void y(int i10) {
        org.telegram.ui.Components.ep0 ep0Var = this.V;
        this.d1.m5(ep0Var != null && ep0Var.h(i10) == 2);
    }
}
