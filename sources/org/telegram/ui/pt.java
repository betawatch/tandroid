package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class pt implements View.OnAttachStateChangeListener {
    public ot a;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        NotificationCenter.getGlobalInstance().addObserver(this.a, NotificationCenter.emojiLoaded);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.getGlobalInstance().removeObserver(this.a, NotificationCenter.emojiLoaded);
    }
}
