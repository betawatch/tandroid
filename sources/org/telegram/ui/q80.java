package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class q80 implements View.OnLayoutChangeListener {
    public boolean a;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean z9 = i12 - i10 > i11 - i7;
        if (z9 != this.a) {
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.vs(this, 22));
            this.a = z9;
        }
    }
}
