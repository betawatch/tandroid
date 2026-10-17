package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
