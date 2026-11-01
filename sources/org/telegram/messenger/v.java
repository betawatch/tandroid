package org.telegram.messenger;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class v implements View.OnLayoutChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ Runnable b;

    public v(View view, Runnable runnable) {
        this.a = view;
        this.b = runnable;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.a.removeOnLayoutChangeListener(this);
        this.b.run();
    }
}
