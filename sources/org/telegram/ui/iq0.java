package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class iq0 implements org.telegram.ui.Components.um0 {
    public final /* synthetic */ mq0 a;

    public iq0(mq0 mq0Var) {
        this.a = mq0Var;
    }

    @Override // org.telegram.ui.Components.um0
    public final void f(int i10, boolean z4) {
        mq0 mq0Var = this.a;
        if (mq0Var.n[0].e == i10) {
            return;
        }
        mq0Var.e = i10 == mq0Var.h.getFirstTabId();
        kq0 kq0Var = mq0Var.n[1];
        kq0Var.e = i10;
        kq0Var.setVisibility(0);
        mq0Var.j0(true);
        mq0Var.v = z4;
        if (i10 == 0) {
            mq0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            mq0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override // org.telegram.ui.Components.um0
    public final /* synthetic */ boolean j1(int i10, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.um0
    public final void w0(float f10) {
        mq0 mq0Var = this.a;
        if (f10 != 1.0f || mq0Var.n[1].getVisibility() == 0) {
            if (mq0Var.v) {
                mq0Var.n[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                mq0Var.n[1].setTranslationX(r3[0].getMeasuredWidth() - (f10 * mq0Var.n[0].getMeasuredWidth()));
            } else {
                mq0Var.n[0].setTranslationX(r3.getMeasuredWidth() * f10);
                mq0Var.n[1].setTranslationX((f10 * r3[0].getMeasuredWidth()) - mq0Var.n[0].getMeasuredWidth());
            }
            if (f10 == 1.0f) {
                kq0[] kq0VarArr = mq0Var.n;
                kq0 kq0Var = kq0VarArr[0];
                kq0VarArr[0] = kq0VarArr[1];
                kq0VarArr[1] = kq0Var;
                kq0Var.setVisibility(8);
            }
        }
    }

    @Override // org.telegram.ui.Components.um0
    public final /* synthetic */ void B() {
    }
}
