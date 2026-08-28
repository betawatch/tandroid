package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class aq0 implements org.telegram.ui.Components.wl0 {
    public final /* synthetic */ eq0 a;

    public aq0(eq0 eq0Var) {
        this.a = eq0Var;
    }

    @Override // org.telegram.ui.Components.wl0
    public final void b(int i9, boolean z10) {
        eq0 eq0Var = this.a;
        if (eq0Var.n[0].e == i9) {
            return;
        }
        eq0Var.e = i9 == eq0Var.h.getFirstTabId();
        cq0 cq0Var = eq0Var.n[1];
        cq0Var.e = i9;
        cq0Var.setVisibility(0);
        eq0Var.i0(true);
        eq0Var.v = z10;
        if (i9 == 0) {
            eq0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            eq0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override // org.telegram.ui.Components.wl0
    public final /* synthetic */ boolean k1(int i9, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.wl0
    public final void v0(float f10) {
        eq0 eq0Var = this.a;
        if (f10 != 1.0f || eq0Var.n[1].getVisibility() == 0) {
            if (eq0Var.v) {
                eq0Var.n[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                eq0Var.n[1].setTranslationX(r3[0].getMeasuredWidth() - (f10 * eq0Var.n[0].getMeasuredWidth()));
            } else {
                eq0Var.n[0].setTranslationX(r3.getMeasuredWidth() * f10);
                eq0Var.n[1].setTranslationX((f10 * r3[0].getMeasuredWidth()) - eq0Var.n[0].getMeasuredWidth());
            }
            if (f10 == 1.0f) {
                cq0[] cq0VarArr = eq0Var.n;
                cq0 cq0Var = cq0VarArr[0];
                cq0VarArr[0] = cq0VarArr[1];
                cq0VarArr[1] = cq0Var;
                cq0Var.setVisibility(8);
            }
        }
    }

    @Override // org.telegram.ui.Components.wl0
    public final /* synthetic */ void p() {
    }
}
