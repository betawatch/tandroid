package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.a7;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
