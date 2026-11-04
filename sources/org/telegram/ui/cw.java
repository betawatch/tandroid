package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class cw extends org.telegram.ui.Components.im0 {
    public final cg.b0 c1;
    public final cg.b0 d1;
    public final /* synthetic */ uw e1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw(uw uwVar, Activity activity, uw uwVar2, int i3, int i10, int i11, long j10, av avVar) {
        super(activity, uwVar2, i3, i10, i11, j10, avVar);
        this.e1 = uwVar;
        this.c1 = new cg.b0(2);
        this.d1 = new cg.b0(8);
    }

    public final void T() {
        pi.q qVar;
        qVar = ((org.telegram.ui.ActionBar.d2) this.e1).glassEngine;
        qVar.g++;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        super.dispatchDraw(canvas);
        uw uwVar = this.e1;
        if (uwVar.b0 != null || uwVar.Z2 != 0) {
            int L = org.telegram.messenger.g0.L(54.0f);
            kVar = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
            int L2 = ((org.telegram.messenger.g0.L(uwVar.a) + kVar.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f)) - (uwVar.Z2 != 0 ? L : 0);
            org.telegram.ui.Components.pr prVar = uwVar.K1;
            int c2 = L2 + (prVar != null ? (int) prVar.c(org.telegram.messenger.g0.L(7.0f)) : 0);
            int r12 = org.telegram.ui.ActionBar.k6.r1(0.7f, uwVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
            cg.b0 b0Var = this.c1;
            b0Var.b(r12);
            b0Var.c(c2, 0);
            b0Var.setBounds(0, 0, getMeasuredWidth(), c2 + L);
            b0Var.draw(canvas);
        }
        if (uwVar.g4 > org.telegram.messenger.g0.L(32.0f)) {
            int r13 = org.telegram.ui.ActionBar.k6.r1(0.9f, uwVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
            cg.b0 b0Var2 = this.d1;
            b0Var2.b(r13);
            b0Var2.setBounds(0, getMeasuredHeight() - uwVar.g4, getMeasuredWidth(), getMeasuredHeight());
            b0Var2.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        pi.q qVar;
        super.setAlpha(f10);
        qVar = ((org.telegram.ui.ActionBar.d2) this.e1).glassEngine;
        qVar.g();
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        sy0 sy0Var = this.e1.a0;
        if (sy0Var != null) {
            sy0Var.setTranslationY(f10);
        }
    }

    @Override // org.telegram.ui.Components.n61
    public final void x(int i3) {
        ci.o4 o4Var = this.W;
        this.e1.q5(o4Var != null && o4Var.h(i3) == 2);
    }
}
