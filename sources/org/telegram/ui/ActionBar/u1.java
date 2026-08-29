package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.w6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class u1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ w6 a;

    public u1(w6 w6Var) {
        this.a = w6Var;
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
