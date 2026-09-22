package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class o0 extends w7.i0 {
    public final /* synthetic */ h4 a;

    public o0(h4 h4Var) {
        this.a = h4Var;
    }

    @Override // w7.i0
    public final void a(boolean z10) {
        if (z10) {
            this.a.h0.h(false);
        }
    }

    @Override // w7.i0
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.messenger.rk.o(R.string.TextCopied, new org.telegram.ui.Components.xc(this.a.g0, null));
        }
    }
}
