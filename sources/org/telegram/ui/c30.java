package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class c30 extends View {
    public final /* synthetic */ a50 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c30(a50 a50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = a50Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.a.U0();
        }
    }
}
