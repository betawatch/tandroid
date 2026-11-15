package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class bl extends jg.s0 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ org.telegram.messenger.is F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(dl dlVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, z10, false);
        this.F = dlVar;
    }

    @Override // v4.h0
    public final void f() {
        int i7 = this.E;
        org.telegram.messenger.is isVar = this.F;
        switch (i7) {
            case 0:
                dl dlVar = (dl) isVar;
                bl blVar = dlVar.O;
                org.telegram.ui.ActionBar.q0 q0Var = dlVar.x;
                if (q0Var != null) {
                    q0Var.setShowSearchProgress(blVar.w);
                }
                TextView textView = dlVar.w;
                if (textView != null) {
                    textView.setText(org.telegram.messenger.hd.a0(null, null, 2131748165, blVar.h));
                }
                super.f();
                break;
            default:
                org.telegram.ui.pa0 pa0Var = (org.telegram.ui.pa0) isVar;
                org.telegram.ui.ActionBar.d5 d5Var = pa0Var.r;
                if (d5Var != null) {
                    d5Var.setShowSearchProgress(pa0Var.T.w);
                }
                TextView textView2 = pa0Var.n;
                if (textView2 != null) {
                    textView2.setText(org.telegram.messenger.hd.a0(null, null, 2131748165, pa0Var.T.h));
                }
                super.f();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(org.telegram.ui.pa0 pa0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, false, z10);
        this.F = pa0Var;
    }
}
