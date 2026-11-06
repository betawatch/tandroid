package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class iv implements View.OnFocusChangeListener {
    public final /* synthetic */ gy a;

    public iv(gy gyVar) {
        this.a = gyVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z9) {
        if (z9) {
            String[] G0 = org.telegram.messenger.g0.G0();
            gy gyVar = this.a;
            gyVar.W0 = G0;
            org.telegram.messenger.ui.b0(gyVar.c1).M(gyVar.W0, false);
        }
    }
}
