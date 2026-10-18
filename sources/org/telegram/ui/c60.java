package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c60 implements org.telegram.ui.Components.l20, org.telegram.ui.ActionBar.a2, r0.n {
    public final /* synthetic */ int a;
    public final /* synthetic */ n60 b;

    public /* synthetic */ c60(n60 n60Var, int i10) {
        this.a = i10;
        this.b = n60Var;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(k1Var, false).d;
        n60 n60Var = this.b;
        n60Var.m0 = i10;
        ai.w1 w1Var = n60Var.F;
        if (w1Var != null) {
            w1Var.setPadding(0, 0, 0, i10);
        }
        n60Var.j0();
        n60Var.h0();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.l20
    public void a(int i10) {
        this.b.b.a(Math.min(i10, r0.c0));
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                this.b.o0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }
}
