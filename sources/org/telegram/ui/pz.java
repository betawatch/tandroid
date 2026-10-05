package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class pz implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ExternalActionActivity a;

    public pz(ExternalActionActivity externalActionActivity) {
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
