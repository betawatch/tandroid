package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class kx extends org.telegram.ui.Components.gn0 {
    public final rf.w b1;
    public final rf.w c1;
    public final /* synthetic */ ay d1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx(ay ayVar, Activity activity, ay ayVar2, int i10, int i11, int i12, long j10, iw iwVar) {
        super(activity, ayVar2, i10, i11, i12, j10, iwVar);
        this.d1 = ayVar;
        this.b1 = new rf.w(2);
        this.c1 = new rf.w(8);
    }

    public final void T() {
        ei.r rVar;
        rVar = ((org.telegram.ui.ActionBar.k2) this.d1).glassEngine;
        rVar.g++;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        super.dispatchDraw(canvas);
        ay ayVar = this.d1;
        if (ayVar.a0 != null || ayVar.Y2 != 0) {
            int L = org.telegram.messenger.i0.L(54.0f);
            lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
            int L2 = ((org.telegram.messenger.i0.L(ayVar.a) + lVar.getMeasuredHeight()) - org.telegram.messenger.i0.L(2.0f)) - (ayVar.Y2 != 0 ? L : 0);
            org.telegram.ui.Components.zr zrVar = ayVar.J1;
            int c10 = L2 + (zrVar != null ? (int) zrVar.c(org.telegram.messenger.i0.L(7.0f)) : 0);
            int r12 = org.telegram.ui.ActionBar.t6.r1(0.7f, ayVar.getThemedColor(org.telegram.ui.ActionBar.t6.d6));
            rf.w wVar = this.b1;
            wVar.b(r12);
            wVar.c(c10, 0);
            wVar.setBounds(0, 0, getMeasuredWidth(), c10 + L);
            wVar.draw(canvas);
        }
        if (ayVar.f4 > org.telegram.messenger.i0.L(32.0f)) {
            int r13 = org.telegram.ui.ActionBar.t6.r1(0.9f, ayVar.getThemedColor(org.telegram.ui.ActionBar.t6.d6));
            rf.w wVar2 = this.c1;
            wVar2.b(r13);
            wVar2.setBounds(0, getMeasuredHeight() - ayVar.f4, getMeasuredWidth(), getMeasuredHeight());
            wVar2.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        ei.r rVar;
        super.setAlpha(f7);
        rVar = ((org.telegram.ui.ActionBar.k2) this.d1).glassEngine;
        rVar.g();
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        q01 q01Var = this.d1.Z;
        if (q01Var != null) {
            q01Var.setTranslationY(f7);
        }
    }

    @Override // org.telegram.ui.Components.w71
    public final void y(int i10) {
        mg.s sVar = this.V;
        this.d1.p5(sVar != null && sVar.h(i10) == 2);
    }
}
