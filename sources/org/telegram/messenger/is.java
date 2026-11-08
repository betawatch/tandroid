package org.telegram.messenger;

import android.view.View;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class is implements View.OnAttachStateChangeListener {
    public final /* synthetic */ hs a;
    public final /* synthetic */ int b;
    public final /* synthetic */ qs c;

    public is(qs qsVar, hs hsVar, int i7) {
        this.c = qsVar;
        this.a = hsVar;
        this.b = i7;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.c.b(this.a, this.b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.c.n(this.a, this.b);
    }
}
