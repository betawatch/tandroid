package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class v1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ org.telegram.ui.Components.a7 a;

    public v1(org.telegram.ui.Components.a7 a7Var) {
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
