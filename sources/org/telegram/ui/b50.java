package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class b50 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ i60 a;

    public b50(i60 i60Var) {
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
