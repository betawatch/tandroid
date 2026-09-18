package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class dr0 implements org.telegram.ui.Components.ym0 {
    public final /* synthetic */ hr0 a;

    public dr0(hr0 hr0Var) {
        this.a = hr0Var;
    }

    @Override // org.telegram.ui.Components.ym0
    public final void C0(float f7) {
        hr0 hr0Var = this.a;
        if (f7 != 1.0f || hr0Var.n[1].getVisibility() == 0) {
            if (hr0Var.v) {
                hr0Var.n[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                hr0Var.n[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * hr0Var.n[0].getMeasuredWidth()));
            } else {
                hr0Var.n[0].setTranslationX(r3.getMeasuredWidth() * f7);
                hr0Var.n[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - hr0Var.n[0].getMeasuredWidth());
            }
            if (f7 == 1.0f) {
                fr0[] fr0VarArr = hr0Var.n;
                fr0 fr0Var = fr0VarArr[0];
                fr0VarArr[0] = fr0VarArr[1];
                fr0VarArr[1] = fr0Var;
                fr0Var.setVisibility(8);
            }
        }
    }

    @Override // org.telegram.ui.Components.ym0
    public final void d(int i10, boolean z10) {
        hr0 hr0Var = this.a;
        if (hr0Var.n[0].e == i10) {
            return;
        }
        hr0Var.e = i10 == hr0Var.h.getFirstTabId();
        fr0 fr0Var = hr0Var.n[1];
        fr0Var.e = i10;
        fr0Var.setVisibility(0);
        hr0Var.j0(true);
        hr0Var.v = z10;
        if (i10 == 0) {
            hr0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            hr0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override // org.telegram.ui.Components.ym0
    public final /* synthetic */ boolean n1(int i10, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.ym0
    public final /* synthetic */ void C() {
    }
}
