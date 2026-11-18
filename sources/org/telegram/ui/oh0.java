package org.telegram.ui;

import android.widget.ImageView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class oh0 extends org.telegram.ui.Cells.m8 {
    public ImageView a0;

    @Override // org.telegram.ui.Cells.m8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        int L = org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(17.0f) : (i11 - i7) - org.telegram.messenger.g0.L(41.0f);
        int z11 = org.telegram.messenger.n10.z(24.0f, i12 - i10, 2);
        this.a0.layout(L, z11, org.telegram.messenger.g0.L(24.0f) + L, org.telegram.messenger.g0.L(24.0f) + z11);
    }

    @Override // org.telegram.ui.Cells.m8, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.a0.measure(i7, i10);
    }
}
