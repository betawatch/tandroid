package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class bq0 implements org.telegram.ui.Components.zl0 {
    public final /* synthetic */ fq0 a;

    public bq0(fq0 fq0Var) {
        this.a = fq0Var;
    }

    @Override // org.telegram.ui.Components.zl0
    public final void b(int i10, boolean z10) {
        fq0 fq0Var = this.a;
        if (fq0Var.n[0].e == i10) {
            return;
        }
        fq0Var.e = i10 == fq0Var.h.getFirstTabId();
        dq0 dq0Var = fq0Var.n[1];
        dq0Var.e = i10;
        dq0Var.setVisibility(0);
        fq0Var.j0(true);
        fq0Var.v = z10;
        if (i10 == 0) {
            fq0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            fq0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override // org.telegram.ui.Components.zl0
    public final /* synthetic */ boolean l1(int i10, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.zl0
    public final void o0(float f10) {
        fq0 fq0Var = this.a;
        if (f10 != 1.0f || fq0Var.n[1].getVisibility() == 0) {
            if (fq0Var.v) {
                fq0Var.n[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                fq0Var.n[1].setTranslationX(r3[0].getMeasuredWidth() - (f10 * fq0Var.n[0].getMeasuredWidth()));
            } else {
                fq0Var.n[0].setTranslationX(r3.getMeasuredWidth() * f10);
                fq0Var.n[1].setTranslationX((f10 * r3[0].getMeasuredWidth()) - fq0Var.n[0].getMeasuredWidth());
            }
            if (f10 == 1.0f) {
                dq0[] dq0VarArr = fq0Var.n;
                dq0 dq0Var = dq0VarArr[0];
                dq0VarArr[0] = dq0VarArr[1];
                dq0VarArr[1] = dq0Var;
                dq0Var.setVisibility(8);
            }
        }
    }

    @Override // org.telegram.ui.Components.zl0
    public final /* synthetic */ void w() {
    }
}
