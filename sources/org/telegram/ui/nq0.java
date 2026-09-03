package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class nq0 implements org.telegram.ui.Components.tm0 {
    public final /* synthetic */ rq0 a;

    public nq0(rq0 rq0Var) {
        this.a = rq0Var;
    }

    @Override // org.telegram.ui.Components.tm0
    public final void f(int i10, boolean z4) {
        rq0 rq0Var = this.a;
        if (rq0Var.n[0].e == i10) {
            return;
        }
        rq0Var.e = i10 == rq0Var.h.getFirstTabId();
        pq0 pq0Var = rq0Var.n[1];
        pq0Var.e = i10;
        pq0Var.setVisibility(0);
        rq0Var.j0(true);
        rq0Var.v = z4;
        if (i10 == 0) {
            rq0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            rq0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override // org.telegram.ui.Components.tm0
    public final /* synthetic */ boolean j1(int i10, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.tm0
    public final void w0(float f10) {
        rq0 rq0Var = this.a;
        if (f10 != 1.0f || rq0Var.n[1].getVisibility() == 0) {
            if (rq0Var.v) {
                rq0Var.n[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                rq0Var.n[1].setTranslationX(r3[0].getMeasuredWidth() - (f10 * rq0Var.n[0].getMeasuredWidth()));
            } else {
                rq0Var.n[0].setTranslationX(r3.getMeasuredWidth() * f10);
                rq0Var.n[1].setTranslationX((f10 * r3[0].getMeasuredWidth()) - rq0Var.n[0].getMeasuredWidth());
            }
            if (f10 == 1.0f) {
                pq0[] pq0VarArr = rq0Var.n;
                pq0 pq0Var = pq0VarArr[0];
                pq0VarArr[0] = pq0VarArr[1];
                pq0VarArr[1] = pq0Var;
                pq0Var.setVisibility(8);
            }
        }
    }

    @Override // org.telegram.ui.Components.tm0
    public final /* synthetic */ void B() {
    }
}
