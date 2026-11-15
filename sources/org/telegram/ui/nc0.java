package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class nc0 implements View.OnAttachStateChangeListener {
    public boolean b;
    public final /* synthetic */ oc0 d;
    public long a = System.currentTimeMillis();
    public final mc0 c = new mc0(this, 0);

    public nc0(oc0 oc0Var) {
        this.d = oc0Var;
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
