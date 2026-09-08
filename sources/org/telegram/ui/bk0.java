package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class bk0 extends TextView {
    public final tt a;

    public bk0(Context context) {
        super(context);
        this.a = new tt(1, this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this.a, NotificationCenter.emojiLoaded);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this.a, NotificationCenter.emojiLoaded);
    }
}
