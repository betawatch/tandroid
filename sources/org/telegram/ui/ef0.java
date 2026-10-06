package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
