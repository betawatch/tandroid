package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class b50 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ j60 a;

    public b50(j60 j60Var) {
        this.a = j60Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        j60 j60Var = this.a;
        j60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        j60Var.a2.j(null);
        AndroidUtilities.updateVisibleRows(j60Var.m2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) j60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
