package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ir0 implements org.telegram.ui.Components.nn0 {
    public final /* synthetic */ mr0 a;

    public ir0(mr0 mr0Var) {
        this.a = mr0Var;
    }

    @Override // org.telegram.ui.Components.nn0
    public final void B0(float f7) {
        mr0 mr0Var = this.a;
        if (f7 != 1.0f || mr0Var.n[1].getVisibility() == 0) {
            if (mr0Var.v) {
                mr0Var.n[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                mr0Var.n[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * mr0Var.n[0].getMeasuredWidth()));
            } else {
                mr0Var.n[0].setTranslationX(r3.getMeasuredWidth() * f7);
                mr0Var.n[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - mr0Var.n[0].getMeasuredWidth());
            }
            if (f7 == 1.0f) {
                kr0[] kr0VarArr = mr0Var.n;
                kr0 kr0Var = kr0VarArr[0];
                kr0VarArr[0] = kr0VarArr[1];
                kr0VarArr[1] = kr0Var;
                kr0Var.setVisibility(8);
            }
        }
    }

    @Override // org.telegram.ui.Components.nn0
    public final void e(int i10, boolean z10) {
        mr0 mr0Var = this.a;
        if (mr0Var.n[0].e == i10) {
            return;
        }
        mr0Var.e = i10 == mr0Var.h.getFirstTabId();
        kr0 kr0Var = mr0Var.n[1];
        kr0Var.e = i10;
        kr0Var.setVisibility(0);
        mr0Var.j0(true);
        mr0Var.v = z10;
        if (i10 == 0) {
            mr0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            mr0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override // org.telegram.ui.Components.nn0
    public final /* synthetic */ boolean n1(int i10, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.nn0
    public final /* synthetic */ void C() {
    }
}
