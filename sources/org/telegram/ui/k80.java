package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class k80 extends f2.l {
    public final /* synthetic */ LanguageSelectActivity F;

    public k80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override // f2.l
    public final void P(f2.m1 m1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        org.telegram.ui.Components.sl0 sl0Var = languageSelectActivity.b;
        int i10 = sl0Var.B1;
        if (i10 == -1 || (view = sl0Var.C1) == null) {
            return;
        }
        sl0Var.h1(i10, view);
        sl0Var.invalidate();
    }
}
