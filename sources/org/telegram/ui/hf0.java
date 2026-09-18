package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class hf0 implements View.OnAttachStateChangeListener {
    public boolean b;
    public final /* synthetic */ if0 d;
    public long a = System.currentTimeMillis();
    public final gf0 c = new gf0(this, 0);

    public hf0(if0 if0Var) {
        this.d = if0Var;
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
