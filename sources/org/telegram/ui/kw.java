package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class kw extends org.telegram.ui.Components.rm0 {
    public final bg.d0 c1;
    public final bg.d0 d1;
    public final /* synthetic */ cx e1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw(cx cxVar, Activity activity, cx cxVar2, int i7, int i10, int i11, long j3, hv hvVar) {
        super(activity, cxVar2, i7, i10, i11, j3, hvVar);
        this.e1 = cxVar;
        this.c1 = new bg.d0(2);
        this.d1 = new bg.d0(8);
    }

    public final void P() {
        ri.q qVar;
        qVar = ((org.telegram.ui.ActionBar.h2) this.e1).glassEngine;
        qVar.g++;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        super.dispatchDraw(canvas);
        cx cxVar = this.e1;
        if (cxVar.b0 != null || cxVar.a3 != 0) {
            int L = org.telegram.messenger.g0.L(54.0f);
            kVar = ((org.telegram.ui.ActionBar.h2) cxVar).actionBar;
            int L2 = ((org.telegram.messenger.g0.L(cxVar.a) + kVar.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f)) - (cxVar.a3 != 0 ? L : 0);
            org.telegram.ui.Components.cs csVar = cxVar.L1;
            int d = L2 + (csVar != null ? (int) csVar.d(org.telegram.messenger.g0.L(7.0f)) : 0);
            int r12 = org.telegram.ui.ActionBar.n6.r1(0.7f, cxVar.getThemedColor(org.telegram.ui.ActionBar.n6.d6));
            bg.d0 d0Var = this.c1;
            d0Var.b(r12);
            d0Var.c(d, 0);
            d0Var.setBounds(0, 0, getMeasuredWidth(), d + L);
            d0Var.draw(canvas);
        }
        if (cxVar.k4 > org.telegram.messenger.g0.L(32.0f)) {
            int r13 = org.telegram.ui.ActionBar.n6.r1(0.9f, cxVar.getThemedColor(org.telegram.ui.ActionBar.n6.d6));
            bg.d0 d0Var2 = this.d1;
            d0Var2.b(r13);
            d0Var2.setBounds(0, getMeasuredHeight() - cxVar.k4, getMeasuredWidth(), getMeasuredHeight());
            d0Var2.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        ri.q qVar;
        super.setAlpha(f10);
        qVar = ((org.telegram.ui.ActionBar.h2) this.e1).glassEngine;
        qVar.g();
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ez0 ez0Var = this.e1.a0;
        if (ez0Var != null) {
            ez0Var.setTranslationY(f10);
        }
    }

    @Override // org.telegram.ui.Components.g71
    public final void u(int i7) {
        di.i4 i4Var = this.W;
        this.e1.y5(i4Var != null && i4Var.h(i7) == 2);
    }
}
