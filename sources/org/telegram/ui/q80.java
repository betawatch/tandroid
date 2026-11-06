package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class q80 implements View.OnLayoutChangeListener {
    public boolean a;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean z9 = i12 - i10 > i11 - i7;
        if (z9 != this.a) {
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.l10(this, 20));
            this.a = z9;
        }
    }
}
