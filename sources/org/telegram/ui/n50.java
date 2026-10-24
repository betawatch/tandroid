package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class n50 extends org.telegram.ui.Components.voip.l {
    public final /* synthetic */ o50 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n50(o50 o50Var, Context context) {
        super(context, false);
        this.h = o50Var;
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u50 u50Var = this.h.M;
        if (u50Var.Q.getVisibility() == 0 && u50Var.P2) {
            u50.N(u50Var, this, true);
        }
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u50.N(this.h.M, this, false);
    }
}
