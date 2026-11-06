package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
