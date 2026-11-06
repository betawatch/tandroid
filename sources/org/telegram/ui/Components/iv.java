package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
