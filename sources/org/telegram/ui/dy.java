package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class dy extends org.telegram.ui.Components.qo0 {
    public final yf.y a1;
    public final yf.y b1;
    public final /* synthetic */ uy c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy(uy uyVar, Activity activity, uy uyVar2, int i10, int i11, int i12, long j3, cy cyVar) {
        super(activity, uyVar2, i10, i11, i12, j3, cyVar);
        this.c1 = uyVar;
        this.a1 = new yf.y(2);
        this.b1 = new yf.y(8);
    }

    public final void U() {
        li.m mVar;
        mVar = ((org.telegram.ui.ActionBar.n2) this.c1).glassEngine;
        mVar.e++;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        super.dispatchDraw(canvas);
        uy uyVar = this.c1;
        if (uyVar.a0 != null || uyVar.X2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
            int dp2 = ((AndroidUtilities.dp(uyVar.a) + kVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f)) - (uyVar.X2 != 0 ? dp : 0);
            org.telegram.ui.Components.ns nsVar = uyVar.J1;
            int c10 = dp2 + (nsVar != null ? (int) nsVar.c(AndroidUtilities.dp(7.0f)) : 0);
            int l1 = org.telegram.ui.ActionBar.i6.l1(0.7f, uyVar.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
            yf.y yVar = this.a1;
            yVar.b(l1);
            yVar.c(c10, 0);
            yVar.setBounds(0, 0, getMeasuredWidth(), c10 + dp);
            yVar.draw(canvas);
        }
        if (uyVar.f4 > AndroidUtilities.dp(32.0f)) {
            int l12 = org.telegram.ui.ActionBar.i6.l1(0.9f, uyVar.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
            yf.y yVar2 = this.b1;
            yVar2.b(l12);
            yVar2.setBounds(0, getMeasuredHeight() - uyVar.f4, getMeasuredWidth(), getMeasuredHeight());
            yVar2.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        li.m mVar;
        super.setAlpha(f7);
        mVar = ((org.telegram.ui.ActionBar.n2) this.c1).glassEngine;
        mVar.g();
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        p41 p41Var = this.c1.Z;
        if (p41Var != null) {
            p41Var.setTranslationY(f7);
        }
    }

    @Override // org.telegram.ui.Components.g91
    public final void y(int i10) {
        org.telegram.ui.Components.po0 po0Var = this.U;
        this.c1.l5(po0Var != null && po0Var.h(i10) == 2);
    }
}
