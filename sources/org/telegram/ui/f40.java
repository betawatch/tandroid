package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class f40 extends View {
    public final /* synthetic */ h60 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f40(h60 h60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = h60Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.a.S0();
        }
    }
}
