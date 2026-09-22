package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.v6;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class t1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ v6 a;

    public t1(v6 v6Var) {
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
