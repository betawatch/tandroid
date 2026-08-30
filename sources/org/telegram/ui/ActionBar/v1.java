package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.s6;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class v1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ s6 a;

    public v1(s6 s6Var) {
        this.a = s6Var;
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
