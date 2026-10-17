package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class lq0 implements org.telegram.ui.Components.jn0 {
    public final /* synthetic */ pq0 a;

    public lq0(pq0 pq0Var) {
        this.a = pq0Var;
    }

    @Override // org.telegram.ui.Components.jn0
    public final /* synthetic */ boolean b1(int i10, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.jn0
    public final void f(int i10, boolean z10) {
        pq0 pq0Var = this.a;
        if (pq0Var.n[0].e == i10) {
            return;
        }
        pq0Var.e = i10 == pq0Var.h.getFirstTabId();
        nq0 nq0Var = pq0Var.n[1];
        nq0Var.e = i10;
        nq0Var.setVisibility(0);
        pq0Var.j0(true);
        pq0Var.v = z10;
        if (i10 == 0) {
            pq0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            pq0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override // org.telegram.ui.Components.jn0
    public final void k0(float f7) {
        pq0 pq0Var = this.a;
        if (f7 != 1.0f || pq0Var.n[1].getVisibility() == 0) {
            if (pq0Var.v) {
                pq0Var.n[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                pq0Var.n[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * pq0Var.n[0].getMeasuredWidth()));
            } else {
                pq0Var.n[0].setTranslationX(r3.getMeasuredWidth() * f7);
                pq0Var.n[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - pq0Var.n[0].getMeasuredWidth());
            }
            if (f7 == 1.0f) {
                nq0[] nq0VarArr = pq0Var.n;
                nq0 nq0Var = nq0VarArr[0];
                nq0VarArr[0] = nq0VarArr[1];
                nq0VarArr[1] = nq0Var;
                nq0Var.setVisibility(8);
            }
        }
    }

    @Override // org.telegram.ui.Components.jn0
    public final /* synthetic */ void x() {
    }
}
