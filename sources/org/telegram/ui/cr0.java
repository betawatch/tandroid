package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class cr0 implements org.telegram.ui.Components.lm0 {
    public final /* synthetic */ gr0 a;

    public cr0(gr0 gr0Var) {
        this.a = gr0Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final void D0(float f7) {
        gr0 gr0Var = this.a;
        if (f7 != 1.0f || gr0Var.n[1].getVisibility() == 0) {
            if (gr0Var.v) {
                gr0Var.n[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                gr0Var.n[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * gr0Var.n[0].getMeasuredWidth()));
            } else {
                gr0Var.n[0].setTranslationX(r3.getMeasuredWidth() * f7);
                gr0Var.n[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - gr0Var.n[0].getMeasuredWidth());
            }
            if (f7 == 1.0f) {
                er0[] er0VarArr = gr0Var.n;
                er0 er0Var = er0VarArr[0];
                er0VarArr[0] = er0VarArr[1];
                er0VarArr[1] = er0Var;
                er0Var.setVisibility(8);
            }
        }
    }

    @Override // org.telegram.ui.Components.lm0
    public final void b(int i10, boolean z10) {
        gr0 gr0Var = this.a;
        if (gr0Var.n[0].e == i10) {
            return;
        }
        gr0Var.e = i10 == gr0Var.h.getFirstTabId();
        er0 er0Var = gr0Var.n[1];
        er0Var.e = i10;
        er0Var.setVisibility(0);
        gr0Var.j0(true);
        gr0Var.v = z10;
        if (i10 == 0) {
            gr0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            gr0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override // org.telegram.ui.Components.lm0
    public final /* synthetic */ boolean n1(int i10, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.lm0
    public final /* synthetic */ void C() {
    }
}
