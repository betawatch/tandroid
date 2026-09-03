package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class l80 extends f2.l {
    public final /* synthetic */ LanguageSelectActivity F;

    public l80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override // f2.l
    public final void P(f2.l1 l1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        org.telegram.ui.Components.rl0 rl0Var = languageSelectActivity.b;
        int i10 = rl0Var.B1;
        if (i10 == -1 || (view = rl0Var.C1) == null) {
            return;
        }
        rl0Var.h1(i10, view);
        rl0Var.invalidate();
    }
}
