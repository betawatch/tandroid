package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class lz implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ExternalActionActivity a;

    public lz(ExternalActionActivity externalActionActivity) {
        this.a = externalActionActivity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ExternalActionActivity externalActionActivity = this.a;
        externalActionActivity.f();
        ActionBarLayout actionBarLayout = externalActionActivity.c;
        if (actionBarLayout != null) {
            actionBarLayout.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
