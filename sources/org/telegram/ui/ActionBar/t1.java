package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.w6;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
