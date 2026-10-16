package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class kf0 implements View.OnAttachStateChangeListener {
    public boolean b;
    public final /* synthetic */ lf0 d;
    public long a = System.currentTimeMillis();
    public final jf0 c = new jf0(this, 0);

    public kf0(lf0 lf0Var) {
        this.d = lf0Var;
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
