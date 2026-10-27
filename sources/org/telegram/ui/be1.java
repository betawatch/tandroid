package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class be1 implements yh.c, MessagesController.ErrorDelegate, r0.n, org.telegram.ui.Components.dm0 {
    public final /* synthetic */ cf1 a;

    public /* synthetic */ be1(cf1 cf1Var) {
        this.a = cf1Var;
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        int i10 = k1Var.a.f(519).d;
        cf1 cf1Var = this.a;
        cf1Var.f1 = i10;
        ye1 ye1Var = cf1Var.r0;
        if (ye1Var != null) {
            ye1Var.setPadding(0, 0, 0, i10);
        }
        se1 se1Var = cf1Var.n;
        if (se1Var != null) {
            se1Var.a.setTranslationY((-cf1Var.f1) - cf1Var.e1);
        }
        cf1Var.h.setTranslationY(((-cf1Var.X0) - cf1Var.f1) - cf1Var.e1);
        cf1Var.B0();
        return r0.k1.b;
    }

    @Override // yh.c
    public void d(boolean z10, boolean z11) {
        cf1 cf1Var = this.a;
        cf1Var.U0.i(cf1Var.R0.b(), z10, z11);
    }

    @Override // org.telegram.ui.Components.dm0
    public boolean e(float f7, float f10, int i10, View view) {
        return cf1.X(this.a, view, f7);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        return cf1.V(this.a, tL_error);
    }

    @Override // org.telegram.ui.Components.dm0
    public /* synthetic */ void g() {
    }

    @Override // org.telegram.ui.Components.dm0
    public /* synthetic */ void o(float f7) {
    }
}
