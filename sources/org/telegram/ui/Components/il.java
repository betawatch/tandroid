package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                org.telegram.ui.pa0 pa0Var = (org.telegram.ui.pa0) fsVar;
                org.telegram.ui.ActionBar.h5 h5Var = pa0Var.r;
                if (h5Var != null) {
                    h5Var.setShowSearchProgress(pa0Var.T.w);
                }
                TextView textView2 = pa0Var.n;
                if (textView2 != null) {
                    textView2.setText(org.telegram.messenger.gd.a0(null, null, 2131747973, pa0Var.T.h));
                }
                super.f();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il(org.telegram.ui.pa0 pa0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context, i6Var, false, z10);
        this.F = pa0Var;
    }
}
