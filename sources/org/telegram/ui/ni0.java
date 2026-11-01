package org.telegram.ui;

import android.widget.ImageView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ni0 extends org.telegram.ui.Cells.p8 {
    public ImageView W;

    @Override // org.telegram.ui.Cells.p8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int L = org.telegram.messenger.dd.X ? org.telegram.messenger.i0.L(17.0f) : (i12 - i10) - org.telegram.messenger.i0.L(41.0f);
        int y3 = org.telegram.messenger.a30.y(24.0f, i13 - i11, 2);
        this.W.layout(L, y3, org.telegram.messenger.i0.L(24.0f) + L, org.telegram.messenger.i0.L(24.0f) + y3);
    }

    @Override // org.telegram.ui.Cells.p8, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.W.measure(i10, i11);
    }
}
