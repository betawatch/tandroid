package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class h20 extends View {
    public final /* synthetic */ f40 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h20(f40 f40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = f40Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.a.U0();
        }
    }
}
