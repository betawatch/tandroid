package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.v6;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class u1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ v6 a;

    public u1(v6 v6Var) {
        this.a = v6Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.c(null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.b(null);
    }
}
