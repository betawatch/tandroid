package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class l40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ u50 a;

    public l40(u50 u50Var) {
        this.a = u50Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        u50 u50Var = this.a;
        u50Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        u50Var.a2.j(null);
        AndroidUtilities.updateVisibleRows(u50Var.m2);
        viewGroup = ((org.telegram.ui.ActionBar.h3) u50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
