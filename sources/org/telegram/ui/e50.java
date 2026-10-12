package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class e50 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ n60 a;

    public e50(n60 n60Var) {
        this.a = n60Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        n60 n60Var = this.a;
        n60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        n60Var.a2.j(null);
        AndroidUtilities.updateVisibleRows(n60Var.m2);
        viewGroup = ((org.telegram.ui.ActionBar.e3) n60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
