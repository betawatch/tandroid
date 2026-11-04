package org.telegram.ui;

import android.widget.ImageView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class fh0 extends org.telegram.ui.Cells.l8 {
    public ImageView a0;

    @Override // org.telegram.ui.Cells.l8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        int L = org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(17.0f) : (i11 - i3) - org.telegram.messenger.g0.L(41.0f);
        int y9 = org.telegram.messenger.camera.q.y(24.0f, i12 - i10, 2);
        this.a0.layout(L, y9, org.telegram.messenger.g0.L(24.0f) + L, org.telegram.messenger.g0.L(24.0f) + y9);
    }

    @Override // org.telegram.ui.Cells.l8, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        this.a0.measure(i3, i10);
    }
}
