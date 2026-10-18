package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class o30 extends View {
    public final /* synthetic */ s50 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o30(s50 s50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = s50Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.a.T0();
        }
    }
}
