package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class iw extends org.telegram.ui.Components.fm0 {
    public final bg.c0 b1;
    public final bg.c0 c1;
    public final /* synthetic */ zw d1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw(zw zwVar, Activity activity, zw zwVar2, int i7, int i10, int i11, long j3, gv gvVar) {
        super(activity, zwVar2, i7, i10, i11, j3, gvVar);
        this.d1 = zwVar;
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
        org.telegram.ui.ActionBar.l lVar;
        super.dispatchDraw(canvas);
        zw zwVar = this.d1;
        if (zwVar.a0 != null || zwVar.Z2 != 0) {
            int L = org.telegram.messenger.g0.L(54.0f);
            lVar = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
            int L2 = ((org.telegram.messenger.g0.L(zwVar.a) + lVar.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f)) - (zwVar.Z2 != 0 ? L : 0);
            org.telegram.ui.Components.or orVar = zwVar.K1;
            int c10 = L2 + (orVar != null ? (int) orVar.c(org.telegram.messenger.g0.L(7.0f)) : 0);
            int r12 = org.telegram.ui.ActionBar.m6.r1(0.7f, zwVar.getThemedColor(org.telegram.ui.ActionBar.m6.d6));
            bg.c0 c0Var = this.b1;
            c0Var.b(r12);
            c0Var.c(c10, 0);
            c0Var.setBounds(0, 0, getMeasuredWidth(), c10 + L);
            c0Var.draw(canvas);
        }
        if (zwVar.g4 > org.telegram.messenger.g0.L(32.0f)) {
            int r13 = org.telegram.ui.ActionBar.m6.r1(0.9f, zwVar.getThemedColor(org.telegram.ui.ActionBar.m6.d6));
            bg.c0 c0Var2 = this.c1;
            c0Var2.b(r13);
            c0Var2.setBounds(0, getMeasuredHeight() - zwVar.g4, getMeasuredWidth(), getMeasuredHeight());
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
        gz0 gz0Var = this.d1.Z;
        if (gz0Var != null) {
            gz0Var.setTranslationY(f10);
        }
    }

    @Override // org.telegram.ui.Components.v61
    public final void y(int i7) {
        bi.g5 g5Var = this.V;
        this.d1.q5(g5Var != null && g5Var.h(i7) == 2);
    }
}
