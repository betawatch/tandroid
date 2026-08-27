package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class k40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ s50 a;

    public k40(s50 s50Var) {
        this.a = s50Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        s50 s50Var = this.a;
        s50Var.M.getViewTreeObserver().removeOnPreDrawListener(this);
        s50Var.W1.j(null);
        AndroidUtilities.updateVisibleRows(s50Var.i2);
        viewGroup = ((org.telegram.ui.ActionBar.e3) s50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
