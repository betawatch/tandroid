package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.x6;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class s1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ x6 a;

    public s1(x6 x6Var) {
        this.a = x6Var;
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
