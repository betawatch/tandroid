package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class h40 extends View {
    public final /* synthetic */ k60 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h40(k60 k60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = k60Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.a.S0();
        }
    }
}
