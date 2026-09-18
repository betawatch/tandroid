package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class o0 extends w7.h0 {
    public final /* synthetic */ h4 a;

    public o0(h4 h4Var) {
        this.a = h4Var;
    }

    @Override // w7.h0
    public final void a(boolean z10) {
        if (z10) {
            this.a.h0.h(false);
        }
    }

    @Override // w7.h0
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.messenger.wl.o(R.string.TextCopied, new org.telegram.ui.Components.vc(this.a.g0, null));
        }
    }
}
