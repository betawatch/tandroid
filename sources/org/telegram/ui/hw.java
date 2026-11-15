package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class hw extends org.telegram.ui.Components.jm0 {
    public final bg.c0 c1;
    public final bg.c0 d1;
    public final /* synthetic */ yw e1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw(yw ywVar, Activity activity, yw ywVar2, int i7, int i10, int i11, long j3, ev evVar) {
        super(activity, ywVar2, i7, i10, i11, j3, evVar);
        this.e1 = ywVar;
        this.c1 = new bg.c0(2);
        this.d1 = new bg.c0(8);
    }

    public final void S() {
        ri.q qVar;
        qVar = ((org.telegram.ui.ActionBar.e2) this.e1).glassEngine;
        qVar.g++;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        super.dispatchDraw(canvas);
        yw ywVar = this.e1;
        if (ywVar.b0 != null || ywVar.a3 != 0) {
            int L = org.telegram.messenger.g0.L(54.0f);
            kVar = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
            int L2 = ((org.telegram.messenger.g0.L(ywVar.a) + kVar.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f)) - (ywVar.a3 != 0 ? L : 0);
            org.telegram.ui.Components.vr vrVar = ywVar.L1;
            int c10 = L2 + (vrVar != null ? (int) vrVar.c(org.telegram.messenger.g0.L(7.0f)) : 0);
            int r12 = org.telegram.ui.ActionBar.j6.r1(0.7f, ywVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            bg.c0 c0Var = this.c1;
            c0Var.b(r12);
            c0Var.c(c10, 0);
            c0Var.setBounds(0, 0, getMeasuredWidth(), c10 + L);
            c0Var.draw(canvas);
        }
        if (ywVar.h4 > org.telegram.messenger.g0.L(32.0f)) {
            int r13 = org.telegram.ui.ActionBar.j6.r1(0.9f, ywVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            bg.c0 c0Var2 = this.d1;
            c0Var2.b(r13);
            c0Var2.setBounds(0, getMeasuredHeight() - ywVar.h4, getMeasuredWidth(), getMeasuredHeight());
            c0Var2.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        ri.q qVar;
        super.setAlpha(f10);
        qVar = ((org.telegram.ui.ActionBar.e2) this.e1).glassEngine;
        qVar.g();
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        az0 az0Var = this.e1.a0;
        if (az0Var != null) {
            az0Var.setTranslationY(f10);
        }
    }

    @Override // org.telegram.ui.Components.w61
    public final void v(int i7) {
        di.f4 f4Var = this.W;
        this.e1.q5(f4Var != null && f4Var.h(i7) == 2);
    }
}
