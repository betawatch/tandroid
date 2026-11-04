package org.telegram.messenger;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class zr implements View.OnAttachStateChangeListener {
    public final /* synthetic */ yr a;
    public final /* synthetic */ int b;
    public final /* synthetic */ hs c;

    public zr(hs hsVar, yr yrVar, int i3) {
        this.c = hsVar;
        this.a = yrVar;
        this.b = i3;
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
