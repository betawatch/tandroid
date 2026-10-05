package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class a50 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ h60 a;

    public a50(h60 h60Var) {
        this.a = h60Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        h60 h60Var = this.a;
        h60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        h60Var.a2.j(null);
        AndroidUtilities.updateVisibleRows(h60Var.m2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) h60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
