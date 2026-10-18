package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class mq0 implements org.telegram.ui.Components.jn0 {
    public final /* synthetic */ qq0 a;

    public mq0(qq0 qq0Var) {
        this.a = qq0Var;
    }

    @Override // org.telegram.ui.Components.jn0
    public final /* synthetic */ boolean b1(int i10, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.jn0
    public final void f(int i10, boolean z10) {
        qq0 qq0Var = this.a;
        if (qq0Var.n[0].e == i10) {
            return;
        }
        qq0Var.e = i10 == qq0Var.h.getFirstTabId();
        oq0 oq0Var = qq0Var.n[1];
        oq0Var.e = i10;
        oq0Var.setVisibility(0);
        qq0Var.j0(true);
        qq0Var.v = z10;
        if (i10 == 0) {
            qq0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            qq0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override // org.telegram.ui.Components.jn0
    public final void k0(float f7) {
        qq0 qq0Var = this.a;
        if (f7 != 1.0f || qq0Var.n[1].getVisibility() == 0) {
            if (qq0Var.v) {
                qq0Var.n[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                qq0Var.n[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * qq0Var.n[0].getMeasuredWidth()));
            } else {
                qq0Var.n[0].setTranslationX(r3.getMeasuredWidth() * f7);
                qq0Var.n[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - qq0Var.n[0].getMeasuredWidth());
            }
            if (f7 == 1.0f) {
                oq0[] oq0VarArr = qq0Var.n;
                oq0 oq0Var = oq0VarArr[0];
                oq0VarArr[0] = oq0VarArr[1];
                oq0VarArr[1] = oq0Var;
                oq0Var.setVisibility(8);
            }
        }
    }

    @Override // org.telegram.ui.Components.jn0
    public final /* synthetic */ void x() {
    }
}
