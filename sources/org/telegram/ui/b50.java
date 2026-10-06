package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class b50 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ h60 a;

    public b50(h60 h60Var) {
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
