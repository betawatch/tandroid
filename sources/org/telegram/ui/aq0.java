package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class aq0 implements org.telegram.ui.Components.jm0 {
    public final /* synthetic */ eq0 a;

    public aq0(eq0 eq0Var) {
        this.a = eq0Var;
    }

    @Override // org.telegram.ui.Components.jm0
    public final void e(int i10, boolean z10) {
        eq0 eq0Var = this.a;
        if (eq0Var.n[0].e == i10) {
            return;
        }
        eq0Var.e = i10 == eq0Var.h.getFirstTabId();
        cq0 cq0Var = eq0Var.n[1];
        cq0Var.e = i10;
        cq0Var.setVisibility(0);
        eq0Var.j0(true);
        eq0Var.v = z10;
        if (i10 == 0) {
            eq0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            eq0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override // org.telegram.ui.Components.jm0
    public final /* synthetic */ boolean i1(int i10, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.jm0
    public final void u0(float f9) {
        eq0 eq0Var = this.a;
        if (f9 != 1.0f || eq0Var.n[1].getVisibility() == 0) {
            if (eq0Var.v) {
                eq0Var.n[0].setTranslationX((-f9) * r3.getMeasuredWidth());
                eq0Var.n[1].setTranslationX(r3[0].getMeasuredWidth() - (f9 * eq0Var.n[0].getMeasuredWidth()));
            } else {
                eq0Var.n[0].setTranslationX(r3.getMeasuredWidth() * f9);
                eq0Var.n[1].setTranslationX((f9 * r3[0].getMeasuredWidth()) - eq0Var.n[0].getMeasuredWidth());
            }
            if (f9 == 1.0f) {
                cq0[] cq0VarArr = eq0Var.n;
                cq0 cq0Var = cq0VarArr[0];
                cq0VarArr[0] = cq0VarArr[1];
                cq0VarArr[1] = cq0Var;
                cq0Var.setVisibility(8);
            }
        }
    }

    @Override // org.telegram.ui.Components.jm0
    public final /* synthetic */ void x() {
    }
}
