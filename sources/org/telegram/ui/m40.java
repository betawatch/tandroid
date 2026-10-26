package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class m40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ v50 a;

    public m40(v50 v50Var) {
        this.a = v50Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        v50 v50Var = this.a;
        v50Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        v50Var.a2.j(null);
        AndroidUtilities.updateVisibleRows(v50Var.m2);
        viewGroup = ((org.telegram.ui.ActionBar.k3) v50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
