package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class oe0 implements View.OnAttachStateChangeListener {
    public boolean b;
    public final /* synthetic */ pe0 d;
    public long a = System.currentTimeMillis();
    public final ne0 c = new ne0(this, 0);

    public oe0(pe0 pe0Var) {
        this.d = pe0Var;
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
