package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class c50 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ k60 a;

    public c50(k60 k60Var) {
        this.a = k60Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        k60 k60Var = this.a;
        k60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        k60Var.a2.j(null);
        AndroidUtilities.updateVisibleRows(k60Var.m2);
        viewGroup = ((org.telegram.ui.ActionBar.g3) k60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
