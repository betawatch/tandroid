package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
