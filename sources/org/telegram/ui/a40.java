package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class a40 extends View {
    public final /* synthetic */ d60 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a40(d60 d60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = d60Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.a.S0();
        }
    }
}
