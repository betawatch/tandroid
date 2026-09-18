package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class l31 extends s4.j {
    public final /* synthetic */ w31 F;

    public l31(w31 w31Var) {
        this.F = w31Var;
    }

    @Override // s4.j
    public final void O() {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.F).containerView;
        viewGroup.invalidate();
    }

    @Override // s4.j
    public final void P(s4.c1 c1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.F).containerView;
        viewGroup.invalidate();
    }
}
