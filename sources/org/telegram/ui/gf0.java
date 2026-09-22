package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class gf0 implements View.OnAttachStateChangeListener {
    public boolean b;
    public final /* synthetic */ hf0 d;
    public long a = System.currentTimeMillis();
    public final ff0 c = new ff0(this, 0);

    public gf0(hf0 hf0Var) {
        this.d = hf0Var;
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
