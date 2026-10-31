package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class uv implements View.OnFocusChangeListener {
    public final /* synthetic */ vy a;

    public uv(vy vyVar) {
        this.a = vyVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] G0 = org.telegram.messenger.i0.G0();
            vy vyVar = this.a;
            vyVar.W0 = G0;
            org.telegram.messenger.ui.b0(vyVar.c1).M(vyVar.W0, false);
        }
    }
}
