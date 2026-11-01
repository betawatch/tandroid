package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
            org.telegram.messenger.vi.b0(vyVar.c1).M(vyVar.W0, false);
        }
    }
}
