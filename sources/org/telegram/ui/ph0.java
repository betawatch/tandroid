package org.telegram.ui;

import android.widget.ImageView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ph0 extends org.telegram.ui.Cells.n8 {
    public ImageView a0;

    @Override // org.telegram.ui.Cells.n8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        int L = org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(17.0f) : (i11 - i7) - org.telegram.messenger.g0.L(41.0f);
        int z11 = org.telegram.messenger.n10.z(24.0f, i12 - i10, 2);
        this.a0.layout(L, z11, org.telegram.messenger.g0.L(24.0f) + L, org.telegram.messenger.g0.L(24.0f) + z11);
    }

    @Override // org.telegram.ui.Cells.n8, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.a0.measure(i7, i10);
    }
}
