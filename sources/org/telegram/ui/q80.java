package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class q80 implements View.OnLayoutChangeListener {
    public boolean a;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean z10 = i12 - i10 > i11 - i7;
        if (z10 != this.a) {
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ih(this, 26));
            this.a = z10;
        }
    }
}
