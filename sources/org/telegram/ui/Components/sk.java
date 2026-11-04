package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sk extends kg.p0 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ org.telegram.messenger.cs F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk(uk ukVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, z10, false);
        this.F = ukVar;
    }

    @Override // u4.h0
    public final void f() {
        int i3 = this.E;
        org.telegram.messenger.cs csVar = this.F;
        switch (i3) {
            case 0:
                uk ukVar = (uk) csVar;
                sk skVar = ukVar.O;
                org.telegram.ui.ActionBar.q0 q0Var = ukVar.x;
                if (q0Var != null) {
                    q0Var.setShowSearchProgress(skVar.w);
                }
                TextView textView = ukVar.w;
                if (textView != null) {
                    textView.setText(org.telegram.messenger.bd.a0(null, null, 2131748173, skVar.h));
                }
                super.f();
                break;
            default:
                org.telegram.ui.la0 la0Var = (org.telegram.ui.la0) csVar;
                org.telegram.ui.ActionBar.f5 f5Var = la0Var.r;
                if (f5Var != null) {
                    f5Var.setShowSearchProgress(la0Var.T.w);
                }
                TextView textView2 = la0Var.n;
                if (textView2 != null) {
                    textView2.setText(org.telegram.messenger.bd.a0(null, null, 2131748173, la0Var.T.h));
                }
                super.f();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk(org.telegram.ui.la0 la0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, false, z10);
        this.F = la0Var;
    }
}
