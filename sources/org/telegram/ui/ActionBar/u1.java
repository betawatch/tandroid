package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.r6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ r6 a;

    public u1(r6 r6Var) {
        this.a = r6Var;
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
