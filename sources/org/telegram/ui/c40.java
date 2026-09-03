package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class c40 extends View {
    public final /* synthetic */ e60 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c40(e60 e60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = e60Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.a.S0();
        }
    }
}
