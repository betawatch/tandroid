package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class j40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ s50 a;

    public j40(s50 s50Var) {
        this.a = s50Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        s50 s50Var = this.a;
        s50Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        s50Var.a2.j(null);
        AndroidUtilities.updateVisibleRows(s50Var.m2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) s50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
