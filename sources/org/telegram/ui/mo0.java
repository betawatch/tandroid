package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class mo0 implements org.telegram.ui.Components.xl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oo0 b;

    public /* synthetic */ mo0(oo0 oo0Var, int i10) {
        this.a = i10;
        this.b = oo0Var;
    }

    @Override // org.telegram.ui.Components.xl0
    public void E0(float f7) {
        oo0 oo0Var = this.b;
        if (f7 != 1.0f || oo0Var.n[1].getVisibility() == 0) {
            if (oo0Var.w) {
                oo0Var.n[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                oo0Var.n[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * oo0Var.n[0].getMeasuredWidth()));
            } else {
                oo0Var.n[0].setTranslationX(r3.getMeasuredWidth() * f7);
                oo0Var.n[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - oo0Var.n[0].getMeasuredWidth());
            }
            if (f7 == 1.0f) {
                org.telegram.ui.ActionBar.h5[] h5VarArr = oo0Var.n;
                org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[0];
                h5VarArr[0] = h5VarArr[1];
                h5VarArr[1] = h5Var;
                h5Var.setVisibility(8);
            }
        }
    }

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ boolean G1(int i10, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.xl0
    public void d(int i10, boolean z10) {
        oo0 oo0Var = this.b;
        if (oo0Var.n[0].b == i10) {
            return;
        }
        oo0Var.e = i10 == oo0Var.h.getFirstTabId();
        org.telegram.ui.ActionBar.h5 h5Var = oo0Var.n[1];
        h5Var.b = i10;
        h5Var.setVisibility(0);
        oo0Var.n0(true);
        oo0Var.w = z10;
        if (i10 == 0) {
            oo0Var.c.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745778, null));
        } else {
            oo0Var.c.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745781, null));
        }
    }

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ void D() {
    }
}
