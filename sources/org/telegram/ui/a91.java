package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a91 implements yh.c, org.telegram.messenger.bp, r0.m, org.telegram.ui.Components.ej0 {
    public final /* synthetic */ z91 a;

    public /* synthetic */ a91(z91 z91Var) {
        this.a = z91Var;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        int i7 = k1Var.a.f(519).d;
        z91 z91Var = this.a;
        z91Var.f1 = i7;
        v91 v91Var = z91Var.r0;
        if (v91Var != null) {
            v91Var.setPadding(0, 0, 0, i7);
        }
        v81 v81Var = z91Var.n;
        if (v81Var != null) {
            ((TextView) v81Var.d).setTranslationY((-z91Var.f1) - z91Var.e1);
        }
        z91Var.h.setTranslationY(((-z91Var.X0) - z91Var.f1) - z91Var.e1);
        z91Var.F0();
        return r0.k1.b;
    }

    @Override // org.telegram.messenger.bp
    public boolean a(TLRPC.TL_error tL_error) {
        return z91.Z(this.a, tL_error);
    }

    @Override // yh.c
    public void d(boolean z9, boolean z10) {
        z91 z91Var = this.a;
        z91Var.U0.i(z91Var.R0.b(), z9, z10);
    }

    @Override // org.telegram.ui.Components.ej0
    public boolean f(float f10, float f11, int i7, View view) {
        return z91.b0(this.a, view, f10);
    }

    @Override // org.telegram.ui.Components.ej0
    public /* synthetic */ void q(float f10) {
    }

    @Override // org.telegram.ui.Components.ej0
    public /* synthetic */ void i() {
    }
}
