package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class jw extends org.telegram.ui.Components.tm0 {
    public final bg.d0 c1;
    public final bg.d0 d1;
    public final /* synthetic */ bx e1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw(bx bxVar, Activity activity, bx bxVar2, int i7, int i10, int i11, long j3, gv gvVar) {
        super(activity, bxVar2, i7, i10, i11, j3, gvVar);
        this.e1 = bxVar;
        this.c1 = new bg.d0(2);
        this.d1 = new bg.d0(8);
    }

    public final void R() {
        ri.q qVar;
        qVar = ((org.telegram.ui.ActionBar.g2) this.e1).glassEngine;
        qVar.g++;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        super.dispatchDraw(canvas);
        bx bxVar = this.e1;
        if (bxVar.b0 != null || bxVar.a3 != 0) {
            int L = org.telegram.messenger.g0.L(54.0f);
            kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
            int L2 = ((org.telegram.messenger.g0.L(bxVar.a) + kVar.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f)) - (bxVar.a3 != 0 ? L : 0);
            org.telegram.ui.Components.bs bsVar = bxVar.L1;
            int d = L2 + (bsVar != null ? (int) bsVar.d(org.telegram.messenger.g0.L(7.0f)) : 0);
            int r12 = org.telegram.ui.ActionBar.n6.r1(0.7f, bxVar.getThemedColor(org.telegram.ui.ActionBar.n6.d6));
            bg.d0 d0Var = this.c1;
            d0Var.b(r12);
            d0Var.c(d, 0);
            d0Var.setBounds(0, 0, getMeasuredWidth(), d + L);
            d0Var.draw(canvas);
        }
        if (bxVar.k4 > org.telegram.messenger.g0.L(32.0f)) {
            int r13 = org.telegram.ui.ActionBar.n6.r1(0.9f, bxVar.getThemedColor(org.telegram.ui.ActionBar.n6.d6));
            bg.d0 d0Var2 = this.d1;
            d0Var2.b(r13);
            d0Var2.setBounds(0, getMeasuredHeight() - bxVar.k4, getMeasuredWidth(), getMeasuredHeight());
            d0Var2.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        ri.q qVar;
        super.setAlpha(f10);
        qVar = ((org.telegram.ui.ActionBar.g2) this.e1).glassEngine;
        qVar.g();
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        dz0 dz0Var = this.e1.a0;
        if (dz0Var != null) {
            dz0Var.setTranslationY(f10);
        }
    }

    @Override // org.telegram.ui.Components.k71
    public final void v(int i7) {
        di.i4 i4Var = this.W;
        this.e1.y5(i4Var != null && i4Var.h(i7) == 2);
    }
}
