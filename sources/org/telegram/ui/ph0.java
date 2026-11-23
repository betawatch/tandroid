package org.telegram.ui;

import android.widget.ImageView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class ph0 extends org.telegram.ui.Cells.n8 {
    public ImageView a0;

    @Override // org.telegram.ui.Cells.n8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        int L = org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(17.0f) : (i11 - i7) - org.telegram.messenger.g0.L(41.0f);
        int z11 = org.telegram.messenger.o10.z(24.0f, i12 - i10, 2);
        this.a0.layout(L, z11, org.telegram.messenger.g0.L(24.0f) + L, org.telegram.messenger.g0.L(24.0f) + z11);
    }

    @Override // org.telegram.ui.Cells.n8, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.a0.measure(i7, i10);
    }
}
