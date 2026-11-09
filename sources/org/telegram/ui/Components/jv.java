package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
