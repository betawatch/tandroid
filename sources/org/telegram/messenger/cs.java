package org.telegram.messenger;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
