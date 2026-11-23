package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class kl extends jg.s0 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ org.telegram.messenger.gs F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl(ml mlVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        super(context, h6Var, z10, false);
        this.F = mlVar;
    }

    @Override // v4.i0
    public final void f() {
        int i7 = this.E;
        org.telegram.messenger.gs gsVar = this.F;
        switch (i7) {
            case 0:
                ml mlVar = (ml) gsVar;
                kl klVar = mlVar.O;
                org.telegram.ui.ActionBar.q0 q0Var = mlVar.x;
                if (q0Var != null) {
                    q0Var.setShowSearchProgress(klVar.w);
                }
                TextView textView = mlVar.w;
                if (textView != null) {
                    textView.setText(org.telegram.messenger.hd.a0(null, null, 2131747972, klVar.h));
                }
                super.f();
                break;
            default:
                org.telegram.ui.qa0 qa0Var = (org.telegram.ui.qa0) gsVar;
                org.telegram.ui.ActionBar.g5 g5Var = qa0Var.r;
                if (g5Var != null) {
                    g5Var.setShowSearchProgress(qa0Var.T.w);
                }
                TextView textView2 = qa0Var.n;
                if (textView2 != null) {
                    textView2.setText(org.telegram.messenger.hd.a0(null, null, 2131747972, qa0Var.T.h));
                }
                super.f();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl(org.telegram.ui.qa0 qa0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        super(context, h6Var, false, z10);
        this.F = qa0Var;
    }
}
