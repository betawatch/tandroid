package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.y6;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class t1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ y6 a;

    public t1(y6 y6Var) {
        this.a = y6Var;
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
