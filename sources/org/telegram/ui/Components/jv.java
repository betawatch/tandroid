package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
