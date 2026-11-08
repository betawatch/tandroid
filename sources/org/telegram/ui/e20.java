package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class e20 extends View {
    public final /* synthetic */ c40 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e20(c40 c40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = c40Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.a.U0();
        }
    }
}
