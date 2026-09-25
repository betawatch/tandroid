package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o60 implements org.telegram.ui.Components.d20, org.telegram.ui.ActionBar.z1, r0.n {
    public final /* synthetic */ int a;
    public final /* synthetic */ z60 b;

    public /* synthetic */ o60(z60 z60Var, int i10) {
        this.a = i10;
        this.b = z60Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(l1Var, false).d;
        z60 z60Var = this.b;
        z60Var.m0 = i10;
        ai.w7 w7Var = z60Var.F;
        if (w7Var != null) {
            w7Var.setPadding(0, 0, 0, i10);
        }
        z60Var.j0();
        z60Var.h0();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.d20
    public void a(int i10) {
        this.b.b.a(Math.min(i10, r0.c0));
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
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
