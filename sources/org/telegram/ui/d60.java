package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d60 extends u4.k {
    public final /* synthetic */ LanguageSelectActivity F;

    public d60(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override // u4.k
    public final void P(u4.d1 d1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        org.telegram.ui.Components.tj0 tj0Var = languageSelectActivity.b;
        int i3 = tj0Var.D1;
        if (i3 == -1 || (view = tj0Var.E1) == null) {
            return;
        }
        tj0Var.k1(i3, view);
        tj0Var.invalidate();
    }
}
