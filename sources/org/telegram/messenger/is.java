package org.telegram.messenger;

import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
