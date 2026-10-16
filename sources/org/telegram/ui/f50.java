package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class f50 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ n60 a;

    public f50(n60 n60Var) {
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
