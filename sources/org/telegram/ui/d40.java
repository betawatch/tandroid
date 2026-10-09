package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class d40 extends View {
    public final /* synthetic */ g60 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d40(g60 g60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = g60Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.a.T0();
        }
    }
}
