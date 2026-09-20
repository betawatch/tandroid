package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class ef1 implements wh.c, MessagesController.ErrorDelegate, r0.n, org.telegram.ui.Components.ml0 {
    public final /* synthetic */ fg1 a;

    public /* synthetic */ ef1(fg1 fg1Var) {
        this.a = fg1Var;
    }

    @Override // r0.n
    public r0.l1 P0(View view, r0.l1 l1Var) {
        int i10 = l1Var.a.f(519).d;
        fg1 fg1Var = this.a;
        fg1Var.e1 = i10;
        bg1 bg1Var = fg1Var.r0;
        if (bg1Var != null) {
            bg1Var.setPadding(0, 0, 0, i10);
        }
        vf1 vf1Var = fg1Var.n;
        if (vf1Var != null) {
            vf1Var.a.setTranslationY((-fg1Var.e1) - fg1Var.d1);
        }
        fg1Var.h.setTranslationY(((-fg1Var.X0) - fg1Var.e1) - fg1Var.d1);
        fg1Var.B0();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.ml0
    public boolean c(float f7, float f10, int i10, View view) {
        return fg1.W(this.a, view, f7);
    }

    @Override // wh.c
    public void f(boolean z10, boolean z11) {
        fg1 fg1Var = this.a;
        fg1Var.U0.i(fg1Var.R0.c(), z10, z11);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        return fg1.U(this.a, tL_error);
    }

    @Override // org.telegram.ui.Components.ml0
    public /* synthetic */ void g() {
    }

    @Override // org.telegram.ui.Components.ml0
    public /* synthetic */ void q(float f7) {
    }
}
