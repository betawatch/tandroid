package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class gq0 implements org.telegram.ui.Components.tm0 {
    public final /* synthetic */ kq0 a;

    public gq0(kq0 kq0Var) {
        this.a = kq0Var;
    }

    @Override // org.telegram.ui.Components.tm0
    public final void f(int i10, boolean z4) {
        kq0 kq0Var = this.a;
        if (kq0Var.n[0].e == i10) {
            return;
        }
        kq0Var.e = i10 == kq0Var.h.getFirstTabId();
        iq0 iq0Var = kq0Var.n[1];
        iq0Var.e = i10;
        iq0Var.setVisibility(0);
        kq0Var.j0(true);
        kq0Var.v = z4;
        if (i10 == 0) {
            kq0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            kq0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override // org.telegram.ui.Components.tm0
    public final /* synthetic */ boolean m1(int i10, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.tm0
    public final void v0(float f10) {
        kq0 kq0Var = this.a;
        if (f10 != 1.0f || kq0Var.n[1].getVisibility() == 0) {
            if (kq0Var.v) {
                kq0Var.n[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                kq0Var.n[1].setTranslationX(r3[0].getMeasuredWidth() - (f10 * kq0Var.n[0].getMeasuredWidth()));
            } else {
                kq0Var.n[0].setTranslationX(r3.getMeasuredWidth() * f10);
                kq0Var.n[1].setTranslationX((f10 * r3[0].getMeasuredWidth()) - kq0Var.n[0].getMeasuredWidth());
            }
            if (f10 == 1.0f) {
                iq0[] iq0VarArr = kq0Var.n;
                iq0 iq0Var = iq0VarArr[0];
                iq0VarArr[0] = iq0VarArr[1];
                iq0VarArr[1] = iq0Var;
                iq0Var.setVisibility(8);
            }
        }
    }

    @Override // org.telegram.ui.Components.tm0
    public final /* synthetic */ void C() {
    }
}
