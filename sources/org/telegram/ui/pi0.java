package org.telegram.ui;

import android.widget.ImageView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pi0 extends org.telegram.ui.Cells.p8 {
    public ImageView W;

    @Override // org.telegram.ui.Cells.p8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int L = org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(17.0f) : (i12 - i10) - org.telegram.messenger.i0.L(41.0f);
        int y3 = org.telegram.messenger.z20.y(24.0f, i13 - i11, 2);
        this.W.layout(L, y3, org.telegram.messenger.i0.L(24.0f) + L, org.telegram.messenger.i0.L(24.0f) + y3);
    }

    @Override // org.telegram.ui.Cells.p8, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.W.measure(i10, i11);
    }
}
