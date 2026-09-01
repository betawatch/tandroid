package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class le1 implements kh.d, MessagesController.ErrorDelegate, r0.o, org.telegram.ui.Components.ml0 {
    public final /* synthetic */ mf1 a;

    public /* synthetic */ le1(mf1 mf1Var) {
        this.a = mf1Var;
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        int i10 = m1Var.a.f(519).d;
        mf1 mf1Var = this.a;
        mf1Var.b1 = i10;
        if1 if1Var = mf1Var.o0;
        if (if1Var != null) {
            if1Var.setPadding(0, 0, 0, i10);
        }
        cf1 cf1Var = mf1Var.n;
        if (cf1Var != null) {
            cf1Var.a.setTranslationY((-mf1Var.b1) - mf1Var.a1);
        }
        mf1Var.h.setTranslationY(((-mf1Var.U0) - mf1Var.b1) - mf1Var.a1);
        mf1Var.B0();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.ml0
    public boolean c(float f10, float f11, int i10, View view) {
        return mf1.W(this.a, view, f10);
    }

    @Override // kh.d
    public void g(boolean z4, boolean z10) {
        mf1 mf1Var = this.a;
        mf1Var.R0.i(mf1Var.O0.c(), z4, z10);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        return mf1.U(this.a, tL_error);
    }

    @Override // org.telegram.ui.Components.ml0
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.ml0
    public /* synthetic */ void p(float f10) {
    }
}
