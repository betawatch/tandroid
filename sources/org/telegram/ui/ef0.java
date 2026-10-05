package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ef0 implements View.OnAttachStateChangeListener {
    public boolean b;
    public final /* synthetic */ ff0 d;
    public long a = System.currentTimeMillis();
    public final df0 c = new df0(this, 0);

    public ef0(ff0 ff0Var) {
        this.d = ff0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b = true;
        view.post(this.c);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b = false;
        view.removeCallbacks(this.c);
    }
}
