package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pe0 implements View.OnAttachStateChangeListener {
    public boolean b;
    public final /* synthetic */ qe0 d;
    public long a = System.currentTimeMillis();
    public final oe0 c = new oe0(this, 0);

    public pe0(qe0 qe0Var) {
        this.d = qe0Var;
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
