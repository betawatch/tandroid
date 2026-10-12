package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class q0 extends w7.w5 {
    public final /* synthetic */ k4 a;

    public q0(k4 k4Var) {
        this.a = k4Var;
    }

    @Override // w7.w5
    public final void a(boolean z10) {
        if (z10) {
            this.a.h0.h(false);
        }
    }

    @Override // w7.w5
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.messenger.yh.o(R.string.TextCopied, new org.telegram.ui.Components.zc(this.a.g0, null));
        }
    }
}
