package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jf1 implements xh.c, MessagesController.ErrorDelegate, r0.n, org.telegram.ui.Components.dm0 {
    public final /* synthetic */ kg1 a;

    public /* synthetic */ jf1(kg1 kg1Var) {
        this.a = kg1Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = l1Var.a.f(519).d;
        kg1 kg1Var = this.a;
        kg1Var.e1 = i10;
        gg1 gg1Var = kg1Var.r0;
        if (gg1Var != null) {
            gg1Var.setPadding(0, 0, 0, i10);
        }
        ag1 ag1Var = kg1Var.n;
        if (ag1Var != null) {
            ag1Var.a.setTranslationY((-kg1Var.e1) - kg1Var.d1);
        }
        kg1Var.h.setTranslationY(((-kg1Var.X0) - kg1Var.e1) - kg1Var.d1);
        kg1Var.B0();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.dm0
    public boolean d(float f7, float f10, int i10, View view) {
        return kg1.W(this.a, view, f7);
    }

    @Override // xh.c
    public void f(boolean z10, boolean z11) {
        kg1 kg1Var = this.a;
        kg1Var.U0.i(kg1Var.R0.c(), z10, z11);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        return kg1.U(this.a, tL_error);
    }

    @Override // org.telegram.ui.Components.dm0
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.dm0
    public /* synthetic */ void q(float f7) {
    }
}
