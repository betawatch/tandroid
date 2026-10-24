package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class p30 extends View {
    public final /* synthetic */ u50 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p30(u50 u50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = u50Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.a.S0();
        }
    }
}
