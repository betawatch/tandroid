package org.telegram.messenger;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class cs implements View.OnAttachStateChangeListener {
    public final /* synthetic */ bs a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ks c;

    public cs(ks ksVar, bs bsVar, int i7) {
        this.c = ksVar;
        this.a = bsVar;
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
