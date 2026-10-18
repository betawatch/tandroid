package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
