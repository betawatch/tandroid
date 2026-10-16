package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.a7;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class s1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ a7 a;

    public s1(a7 a7Var) {
        this.a = a7Var;
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
