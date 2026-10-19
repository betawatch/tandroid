package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class kq0 implements org.telegram.ui.Components.jn0 {
    public final /* synthetic */ oq0 a;

    public kq0(oq0 oq0Var) {
        this.a = oq0Var;
    }

    @Override // org.telegram.ui.Components.jn0
    public final /* synthetic */ boolean b1(int i10, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.jn0
    public final void f(int i10, boolean z10) {
        oq0 oq0Var = this.a;
        if (oq0Var.n[0].e == i10) {
            return;
        }
        oq0Var.e = i10 == oq0Var.h.getFirstTabId();
        mq0 mq0Var = oq0Var.n[1];
        mq0Var.e = i10;
        mq0Var.setVisibility(0);
        oq0Var.j0(true);
        oq0Var.v = z10;
        if (i10 == 0) {
            oq0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            oq0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override // org.telegram.ui.Components.jn0
    public final void k0(float f7) {
        oq0 oq0Var = this.a;
        if (f7 != 1.0f || oq0Var.n[1].getVisibility() == 0) {
            if (oq0Var.v) {
                oq0Var.n[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                oq0Var.n[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * oq0Var.n[0].getMeasuredWidth()));
            } else {
                oq0Var.n[0].setTranslationX(r3.getMeasuredWidth() * f7);
                oq0Var.n[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - oq0Var.n[0].getMeasuredWidth());
            }
            if (f7 == 1.0f) {
                mq0[] mq0VarArr = oq0Var.n;
                mq0 mq0Var = mq0VarArr[0];
                mq0VarArr[0] = mq0VarArr[1];
                mq0VarArr[1] = mq0Var;
                mq0Var.setVisibility(8);
            }
        }
    }

    @Override // org.telegram.ui.Components.jn0
    public final /* synthetic */ void x() {
    }
}
