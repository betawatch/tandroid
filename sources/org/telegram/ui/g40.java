package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class g40 extends View {
    public final /* synthetic */ j60 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g40(j60 j60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = j60Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.a.S0();
        }
    }
}
