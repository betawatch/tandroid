package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n60 implements org.telegram.ui.Components.d20, org.telegram.ui.ActionBar.c2, r0.o {
    public final /* synthetic */ int a;
    public final /* synthetic */ y60 b;

    public /* synthetic */ n60(y60 y60Var, int i10) {
        this.a = i10;
        this.b = y60Var;
    }

    @Override // r0.o
    public r0.m1 N0(View view, r0.m1 m1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(m1Var, false).d;
        y60 y60Var = this.b;
        y60Var.j0 = i10;
        dg.v3 v3Var = y60Var.C;
        if (v3Var != null) {
            v3Var.setPadding(0, 0, 0, i10);
        }
        y60Var.j0();
        y60Var.h0();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.d20
    public void a(int i10) {
        this.b.b.a(Math.min(i10, r0.Z));
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
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
