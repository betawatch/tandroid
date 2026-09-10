package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.w6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class v1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ w6 a;

    public v1(w6 w6Var) {
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
