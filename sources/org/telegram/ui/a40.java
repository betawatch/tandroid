package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
