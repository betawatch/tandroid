package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class if0 implements View.OnAttachStateChangeListener {
    public boolean b;
    public final /* synthetic */ jf0 d;
    public long a = System.currentTimeMillis();
    public final hf0 c = new hf0(this, 0);

    public if0(jf0 jf0Var) {
        this.d = jf0Var;
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
