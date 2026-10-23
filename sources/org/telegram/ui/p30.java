package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class p30 extends View {
    public final /* synthetic */ u50 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p30(u50 u50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = u50Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.a.S0();
        }
    }
}
