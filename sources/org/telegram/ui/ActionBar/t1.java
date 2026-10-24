package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.y6;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class t1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ y6 a;

    public t1(y6 y6Var) {
        this.a = y6Var;
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
