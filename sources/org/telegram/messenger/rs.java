package org.telegram.messenger;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class rs implements View.OnAttachStateChangeListener {
    public final /* synthetic */ qs a;
    public final /* synthetic */ int b;
    public final /* synthetic */ zs c;

    public rs(zs zsVar, qs qsVar, int i10) {
        this.c = zsVar;
        this.a = qsVar;
        this.b = i10;
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
