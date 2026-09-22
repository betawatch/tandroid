package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
            org.telegram.messenger.vl.p(R.string.TextCopied, new org.telegram.ui.Components.vc(this.a.g0, null));
        }
    }
}
