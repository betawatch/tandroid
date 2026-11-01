package org.telegram.messenger;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class ss implements View.OnAttachStateChangeListener {
    public final /* synthetic */ rs a;
    public final /* synthetic */ int b;
    public final /* synthetic */ at c;

    public ss(at atVar, rs rsVar, int i10) {
        this.c = atVar;
        this.a = rsVar;
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
