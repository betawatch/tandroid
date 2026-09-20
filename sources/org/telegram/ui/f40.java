package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class f40 extends View {
    public final /* synthetic */ i60 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f40(i60 i60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = i60Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.a.S0();
        }
    }
}
