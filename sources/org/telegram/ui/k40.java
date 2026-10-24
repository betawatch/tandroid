package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class k40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ u50 a;

    public k40(u50 u50Var) {
        this.a = u50Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        u50 u50Var = this.a;
        u50Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        u50Var.a2.j(null);
        AndroidUtilities.updateVisibleRows(u50Var.m2);
        viewGroup = ((org.telegram.ui.ActionBar.h3) u50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
