package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
