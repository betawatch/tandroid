package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o80 implements View.OnLayoutChangeListener {
    public boolean a;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean z10 = i12 - i10 > i11 - i3;
        if (z10 != this.a) {
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.go(this, 21));
            this.a = z10;
        }
    }
}
