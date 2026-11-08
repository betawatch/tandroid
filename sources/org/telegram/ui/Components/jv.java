package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class jv implements View.OnFocusChangeListener {
    public final /* synthetic */ hy a;

    public jv(hy hyVar) {
        this.a = hyVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z9) {
        if (z9) {
            String[] G0 = org.telegram.messenger.g0.G0();
            hy hyVar = this.a;
            hyVar.W0 = G0;
            org.telegram.messenger.ui.b0(hyVar.c1).M(hyVar.W0, false);
        }
    }
}
