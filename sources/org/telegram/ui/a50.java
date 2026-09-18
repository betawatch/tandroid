package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class a50 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ i60 a;

    public a50(i60 i60Var) {
        this.a = i60Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        i60 i60Var = this.a;
        i60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        i60Var.a2.j(null);
        AndroidUtilities.updateVisibleRows(i60Var.m2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) i60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
