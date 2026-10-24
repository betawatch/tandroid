package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class p extends s4.k {
    public final /* synthetic */ q F;

    public p(q qVar) {
        this.F = qVar;
    }

    @Override // s4.k
    public final void P(s4.b1 b1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.F).containerView;
        viewGroup.invalidate();
    }
}
