package org.telegram.ui;

import android.widget.ImageView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class mh0 extends org.telegram.ui.Cells.m8 {
    public ImageView W;

    @Override // org.telegram.ui.Cells.m8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        int L = org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(17.0f) : (i11 - i7) - org.telegram.messenger.g0.L(41.0f);
        int y10 = org.telegram.messenger.camera.q.y(24.0f, i12 - i10, 2);
        this.W.layout(L, y10, org.telegram.messenger.g0.L(24.0f) + L, org.telegram.messenger.g0.L(24.0f) + y10);
    }

    @Override // org.telegram.ui.Cells.m8, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.W.measure(i7, i10);
    }
}
