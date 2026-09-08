package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class i1 implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout a;

    public i1(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.a = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        this.a.invalidate();
    }
}
