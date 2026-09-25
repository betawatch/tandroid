package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class bb0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ LaunchActivity a;

    public bb0(LaunchActivity launchActivity) {
        this.a = launchActivity;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.d1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.d1);
    }
}
