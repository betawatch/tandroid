package org.telegram.messenger;

import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
