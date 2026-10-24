package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class nq0 implements org.telegram.ui.Components.nn0 {
    public final /* synthetic */ rq0 a;

    public nq0(rq0 rq0Var) {
        this.a = rq0Var;
    }

    @Override // org.telegram.ui.Components.nn0
    public final /* synthetic */ boolean b1(int i10, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.nn0
    public final void d(int i10, boolean z10) {
        rq0 rq0Var = this.a;
        if (rq0Var.n[0].e == i10) {
            return;
        }
        rq0Var.e = i10 == rq0Var.h.getFirstTabId();
        pq0 pq0Var = rq0Var.n[1];
        pq0Var.e = i10;
        pq0Var.setVisibility(0);
        rq0Var.j0(true);
        rq0Var.v = z10;
        if (i10 == 0) {
            rq0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            rq0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override // org.telegram.ui.Components.nn0
    public final void k0(float f7) {
        rq0 rq0Var = this.a;
        if (f7 != 1.0f || rq0Var.n[1].getVisibility() == 0) {
            if (rq0Var.v) {
                rq0Var.n[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                rq0Var.n[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * rq0Var.n[0].getMeasuredWidth()));
            } else {
                rq0Var.n[0].setTranslationX(r3.getMeasuredWidth() * f7);
                rq0Var.n[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - rq0Var.n[0].getMeasuredWidth());
            }
            if (f7 == 1.0f) {
                pq0[] pq0VarArr = rq0Var.n;
                pq0 pq0Var = pq0VarArr[0];
                pq0VarArr[0] = pq0VarArr[1];
                pq0VarArr[1] = pq0Var;
                pq0Var.setVisibility(8);
            }
        }
    }

    @Override // org.telegram.ui.Components.nn0
    public final /* synthetic */ void x() {
    }
}
