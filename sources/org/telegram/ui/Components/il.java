package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class il extends jg.s0 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ org.telegram.messenger.fs F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il(kl klVar, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context, i6Var, z10, false);
        this.F = klVar;
    }

    @Override // v4.i0
    public final void f() {
        int i7 = this.E;
        org.telegram.messenger.fs fsVar = this.F;
        switch (i7) {
            case 0:
                kl klVar = (kl) fsVar;
                il ilVar = klVar.O;
                org.telegram.ui.ActionBar.r0 r0Var = klVar.x;
                if (r0Var != null) {
                    r0Var.setShowSearchProgress(ilVar.w);
                }
                TextView textView = klVar.w;
                if (textView != null) {
                    textView.setText(org.telegram.messenger.gd.a0(null, null, 2131747973, ilVar.h));
                }
                super.f();
                break;
            default:
                org.telegram.ui.qa0 qa0Var = (org.telegram.ui.qa0) fsVar;
                org.telegram.ui.ActionBar.h5 h5Var = qa0Var.r;
                if (h5Var != null) {
                    h5Var.setShowSearchProgress(qa0Var.T.w);
                }
                TextView textView2 = qa0Var.n;
                if (textView2 != null) {
                    textView2.setText(org.telegram.messenger.gd.a0(null, null, 2131747973, qa0Var.T.h));
                }
                super.f();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il(org.telegram.ui.qa0 qa0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context, i6Var, false, z10);
        this.F = qa0Var;
    }
}
