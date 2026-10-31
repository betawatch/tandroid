package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class oa1 implements oh.d, org.telegram.messenger.gp, r0.m, org.telegram.ui.Components.jk0 {
    public final /* synthetic */ pb1 a;

    public /* synthetic */ oa1(pb1 pb1Var) {
        this.a = pb1Var;
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        int i10 = j1Var.a.f(519).d;
        pb1 pb1Var = this.a;
        pb1Var.f1 = i10;
        lb1 lb1Var = pb1Var.r0;
        if (lb1Var != null) {
            lb1Var.setPadding(0, 0, 0, i10);
        }
        ja1 ja1Var = pb1Var.n;
        if (ja1Var != null) {
            ((TextView) ja1Var.d).setTranslationY((-pb1Var.f1) - pb1Var.e1);
        }
        pb1Var.h.setTranslationY(((-pb1Var.X0) - pb1Var.f1) - pb1Var.e1);
        pb1Var.E0();
        return r0.j1.b;
    }

    @Override // org.telegram.messenger.gp
    public boolean a(TLRPC.TL_error tL_error) {
        return pb1.Y(this.a, tL_error);
    }

    @Override // org.telegram.ui.Components.jk0
    public boolean b(float f7, float f10, int i10, View view) {
        return pb1.a0(this.a, view, f7);
    }

    @Override // oh.d
    public void c(boolean z10, boolean z11) {
        pb1 pb1Var = this.a;
        pb1Var.U0.i(pb1Var.R0.b(), z10, z11);
    }

    @Override // org.telegram.ui.Components.jk0
    public /* synthetic */ void p(float f7) {
    }

    @Override // org.telegram.ui.Components.jk0
    public /* synthetic */ void g() {
    }
}
