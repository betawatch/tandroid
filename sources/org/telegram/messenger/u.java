package org.telegram.messenger;

import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class u implements View.OnLayoutChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ Runnable b;

    public u(View view, Runnable runnable) {
        this.a = view;
        this.b = runnable;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.a.removeOnLayoutChangeListener(this);
        this.b.run();
    }
}
