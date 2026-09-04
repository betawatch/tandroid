package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
