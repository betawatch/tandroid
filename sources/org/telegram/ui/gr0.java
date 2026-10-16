package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class gr0 implements org.telegram.ui.Components.nn0 {
    public final /* synthetic */ kr0 a;

    public gr0(kr0 kr0Var) {
        this.a = kr0Var;
    }

    @Override // org.telegram.ui.Components.nn0
    public final void f(int i10, boolean z10) {
        kr0 kr0Var = this.a;
        if (kr0Var.n[0].e == i10) {
            return;
        }
        kr0Var.e = i10 == kr0Var.h.getFirstTabId();
        ir0 ir0Var = kr0Var.n[1];
        ir0Var.e = i10;
        ir0Var.setVisibility(0);
        kr0Var.j0(true);
        kr0Var.v = z10;
        if (i10 == 0) {
            kr0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            kr0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override // org.telegram.ui.Components.nn0
    public final /* synthetic */ boolean n1(int i10, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.nn0
    public final void w0(float f7) {
        kr0 kr0Var = this.a;
        if (f7 != 1.0f || kr0Var.n[1].getVisibility() == 0) {
            if (kr0Var.v) {
                kr0Var.n[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                kr0Var.n[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * kr0Var.n[0].getMeasuredWidth()));
            } else {
                kr0Var.n[0].setTranslationX(r3.getMeasuredWidth() * f7);
                kr0Var.n[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - kr0Var.n[0].getMeasuredWidth());
            }
            if (f7 == 1.0f) {
                ir0[] ir0VarArr = kr0Var.n;
                ir0 ir0Var = ir0VarArr[0];
                ir0VarArr[0] = ir0VarArr[1];
                ir0VarArr[1] = ir0Var;
                ir0Var.setVisibility(8);
            }
        }
    }

    @Override // org.telegram.ui.Components.nn0
    public final /* synthetic */ void A() {
    }
}
