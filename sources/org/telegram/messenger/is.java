package org.telegram.messenger;

import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
