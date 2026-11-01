package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ko0 implements org.telegram.ui.Components.yl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mo0 b;

    public /* synthetic */ ko0(mo0 mo0Var, int i10) {
        this.a = i10;
        this.b = mo0Var;
    }

    @Override // org.telegram.ui.Components.yl0
    public void E0(float f7) {
        mo0 mo0Var = this.b;
        if (f7 != 1.0f || mo0Var.n[1].getVisibility() == 0) {
            if (mo0Var.w) {
                mo0Var.n[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                mo0Var.n[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * mo0Var.n[0].getMeasuredWidth()));
            } else {
                mo0Var.n[0].setTranslationX(r3.getMeasuredWidth() * f7);
                mo0Var.n[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - mo0Var.n[0].getMeasuredWidth());
            }
            if (f7 == 1.0f) {
                org.telegram.ui.ActionBar.h5[] h5VarArr = mo0Var.n;
                org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[0];
                h5VarArr[0] = h5VarArr[1];
                h5VarArr[1] = h5Var;
                h5Var.setVisibility(8);
            }
        }
    }

    @Override // org.telegram.ui.Components.yl0
    public /* synthetic */ boolean G1(int i10, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.yl0
    public void d(int i10, boolean z10) {
        mo0 mo0Var = this.b;
        if (mo0Var.n[0].b == i10) {
            return;
        }
        mo0Var.e = i10 == mo0Var.h.getFirstTabId();
        org.telegram.ui.ActionBar.h5 h5Var = mo0Var.n[1];
        h5Var.b = i10;
        h5Var.setVisibility(0);
        mo0Var.o0(true);
        mo0Var.w = z10;
        if (i10 == 0) {
            mo0Var.c.setSearchFieldHint(org.telegram.messenger.dd.L0(2131745778, null));
        } else {
            mo0Var.c.setSearchFieldHint(org.telegram.messenger.dd.L0(2131745781, null));
        }
    }

    @Override // org.telegram.ui.Components.yl0
    public /* synthetic */ void D() {
    }
}
