package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class hw extends org.telegram.ui.Components.gm0 {
    public final bg.c0 b1;
    public final bg.c0 c1;
    public final /* synthetic */ yw d1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw(yw ywVar, Activity activity, yw ywVar2, int i7, int i10, int i11, long j3, fv fvVar) {
        super(activity, ywVar2, i7, i10, i11, j3, fvVar);
        this.d1 = ywVar;
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
        yw ywVar = this.d1;
        if (ywVar.a0 != null || ywVar.Z2 != 0) {
            int L = org.telegram.messenger.g0.L(54.0f);
            kVar = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
            int L2 = ((org.telegram.messenger.g0.L(ywVar.a) + kVar.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f)) - (ywVar.Z2 != 0 ? L : 0);
            org.telegram.ui.Components.pr prVar = ywVar.K1;
            int c10 = L2 + (prVar != null ? (int) prVar.c(org.telegram.messenger.g0.L(7.0f)) : 0);
            int r12 = org.telegram.ui.ActionBar.l6.r1(0.7f, ywVar.getThemedColor(org.telegram.ui.ActionBar.l6.d6));
            bg.c0 c0Var = this.b1;
            c0Var.b(r12);
            c0Var.c(c10, 0);
            c0Var.setBounds(0, 0, getMeasuredWidth(), c10 + L);
            c0Var.draw(canvas);
        }
        if (ywVar.g4 > org.telegram.messenger.g0.L(32.0f)) {
            int r13 = org.telegram.ui.ActionBar.l6.r1(0.9f, ywVar.getThemedColor(org.telegram.ui.ActionBar.l6.d6));
            bg.c0 c0Var2 = this.c1;
            c0Var2.b(r13);
            c0Var2.setBounds(0, getMeasuredHeight() - ywVar.g4, getMeasuredWidth(), getMeasuredHeight());
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
        fz0 fz0Var = this.d1.Z;
        if (fz0Var != null) {
            fz0Var.setTranslationY(f10);
        }
    }

    @Override // org.telegram.ui.Components.w61
    public final void y(int i7) {
        bi.g5 g5Var = this.V;
        this.d1.q5(g5Var != null && g5Var.h(i7) == 2);
    }
}
