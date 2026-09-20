package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.w6;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class t1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ w6 a;

    public t1(w6 w6Var) {
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
