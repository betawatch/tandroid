package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class lf0 implements View.OnAttachStateChangeListener {
    public boolean b;
    public final /* synthetic */ mf0 d;
    public long a = System.currentTimeMillis();
    public final kf0 c = new kf0(this, 0);

    public lf0(mf0 mf0Var) {
        this.d = mf0Var;
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
