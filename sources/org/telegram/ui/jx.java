package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class jx extends org.telegram.ui.Components.hn0 {
    public final rf.w b1;
    public final rf.w c1;
    public final /* synthetic */ zx d1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx(zx zxVar, Activity activity, zx zxVar2, int i10, int i11, int i12, long j10, hw hwVar) {
        super(activity, zxVar2, i10, i11, i12, j10, hwVar);
        this.d1 = zxVar;
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
        zx zxVar = this.d1;
        if (zxVar.a0 != null || zxVar.Y2 != 0) {
            int L = org.telegram.messenger.i0.L(54.0f);
            lVar = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
            int L2 = ((org.telegram.messenger.i0.L(zxVar.a) + lVar.getMeasuredHeight()) - org.telegram.messenger.i0.L(2.0f)) - (zxVar.Y2 != 0 ? L : 0);
            org.telegram.ui.Components.zr zrVar = zxVar.J1;
            int c10 = L2 + (zrVar != null ? (int) zrVar.c(org.telegram.messenger.i0.L(7.0f)) : 0);
            int r12 = org.telegram.ui.ActionBar.t6.r1(0.7f, zxVar.getThemedColor(org.telegram.ui.ActionBar.t6.d6));
            rf.w wVar = this.b1;
            wVar.b(r12);
            wVar.c(c10, 0);
            wVar.setBounds(0, 0, getMeasuredWidth(), c10 + L);
            wVar.draw(canvas);
        }
        if (zxVar.f4 > org.telegram.messenger.i0.L(32.0f)) {
            int r13 = org.telegram.ui.ActionBar.t6.r1(0.9f, zxVar.getThemedColor(org.telegram.ui.ActionBar.t6.d6));
            rf.w wVar2 = this.c1;
            wVar2.b(r13);
            wVar2.setBounds(0, getMeasuredHeight() - zxVar.f4, getMeasuredWidth(), getMeasuredHeight());
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

    @Override // org.telegram.ui.Components.x71
    public final void y(int i10) {
        mg.s sVar = this.V;
        this.d1.q5(sVar != null && sVar.h(i10) == 2);
    }
}
