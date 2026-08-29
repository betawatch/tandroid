package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class j40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ r50 a;

    public j40(r50 r50Var) {
        this.a = r50Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        r50 r50Var = this.a;
        r50Var.M.getViewTreeObserver().removeOnPreDrawListener(this);
        r50Var.W1.j(null);
        AndroidUtilities.updateVisibleRows(r50Var.i2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) r50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
