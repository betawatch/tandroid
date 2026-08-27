package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class b80 extends f2.l {
    public final /* synthetic */ LanguageSelectActivity F;

    public b80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override // f2.l
    public final void P(f2.o1 o1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        org.telegram.ui.Components.zk0 zk0Var = languageSelectActivity.b;
        int i10 = zk0Var.A1;
        if (i10 == -1 || (view = zk0Var.B1) == null) {
            return;
        }
        zk0Var.i1(i10, view);
        zk0Var.invalidate();
    }
}
