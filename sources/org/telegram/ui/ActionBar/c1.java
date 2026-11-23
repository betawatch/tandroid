package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class c1 implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout a;

    public c1(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.a = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        this.a.invalidate();
    }
}
