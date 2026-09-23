package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class q60 implements org.telegram.ui.Components.d20, org.telegram.ui.ActionBar.a2, r0.n {
    public final /* synthetic */ int a;
    public final /* synthetic */ b70 b;

    public /* synthetic */ q60(b70 b70Var, int i10) {
        this.a = i10;
        this.b = b70Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(l1Var, false).d;
        b70 b70Var = this.b;
        b70Var.m0 = i10;
        ai.w7 w7Var = b70Var.F;
        if (w7Var != null) {
            w7Var.setPadding(0, 0, 0, i10);
        }
        b70Var.j0();
        b70Var.h0();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.d20
    public void a(int i10) {
        this.b.b.a(Math.min(i10, r0.c0));
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
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
