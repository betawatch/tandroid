package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class fw extends org.telegram.ui.Components.fm0 {
    public final bg.c0 b1;
    public final bg.c0 c1;
    public final /* synthetic */ ww d1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw(ww wwVar, Activity activity, ww wwVar2, int i7, int i10, int i11, long j3, dv dvVar) {
        super(activity, wwVar2, i7, i10, i11, j3, dvVar);
        this.d1 = wwVar;
        this.b1 = new bg.c0(2);
        this.c1 = new bg.c0(8);
    }

    public final void T() {
        oi.q qVar;
        qVar = ((org.telegram.ui.ActionBar.f2) this.d1).glassEngine;
        qVar.g++;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        super.dispatchDraw(canvas);
        ww wwVar = this.d1;
        if (wwVar.a0 != null || wwVar.Y2 != 0) {
            int L = org.telegram.messenger.g0.L(54.0f);
            kVar = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
            int L2 = ((org.telegram.messenger.g0.L(wwVar.a) + kVar.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f)) - (wwVar.Y2 != 0 ? L : 0);
            org.telegram.ui.Components.pr prVar = wwVar.J1;
            int c10 = L2 + (prVar != null ? (int) prVar.c(org.telegram.messenger.g0.L(7.0f)) : 0);
            int r12 = org.telegram.ui.ActionBar.k6.r1(0.7f, wwVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
            bg.c0 c0Var = this.b1;
            c0Var.b(r12);
            c0Var.c(c10, 0);
            c0Var.setBounds(0, 0, getMeasuredWidth(), c10 + L);
            c0Var.draw(canvas);
        }
        if (wwVar.f4 > org.telegram.messenger.g0.L(32.0f)) {
            int r13 = org.telegram.ui.ActionBar.k6.r1(0.9f, wwVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
            bg.c0 c0Var2 = this.c1;
            c0Var2.b(r13);
            c0Var2.setBounds(0, getMeasuredHeight() - wwVar.f4, getMeasuredWidth(), getMeasuredHeight());
            c0Var2.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        oi.q qVar;
        super.setAlpha(f10);
        qVar = ((org.telegram.ui.ActionBar.f2) this.d1).glassEngine;
        qVar.g();
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        cz0 cz0Var = this.d1.Z;
        if (cz0Var != null) {
            cz0Var.setTranslationY(f10);
        }
    }

    @Override // org.telegram.ui.Components.v61
    public final void y(int i7) {
        bi.g5 g5Var = this.V;
        this.d1.q5(g5Var != null && g5Var.h(i7) == 2);
    }
}
