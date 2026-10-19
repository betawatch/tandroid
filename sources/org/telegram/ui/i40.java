package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class i40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ q50 a;

    public i40(q50 q50Var) {
        this.a = q50Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        q50 q50Var = this.a;
        q50Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        q50Var.a2.j(null);
        AndroidUtilities.updateVisibleRows(q50Var.m2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) q50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
