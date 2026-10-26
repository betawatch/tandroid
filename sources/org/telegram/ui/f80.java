package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class f80 extends s4.l {
    public final /* synthetic */ LanguageSelectActivity F;

    public f80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override // s4.l
    public final void P(s4.e1 e1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        org.telegram.ui.Components.mm0 mm0Var = languageSelectActivity.b;
        int i10 = mm0Var.C1;
        if (i10 == -1 || (view = mm0Var.D1) == null) {
            return;
        }
        mm0Var.l1(i10, view);
        mm0Var.invalidate();
    }
}
