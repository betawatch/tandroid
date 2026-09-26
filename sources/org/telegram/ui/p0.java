package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class p0 extends w7.i0 {
    public final /* synthetic */ i4 a;

    public p0(i4 i4Var) {
        this.a = i4Var;
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
            org.telegram.messenger.ok.o(R.string.TextCopied, new org.telegram.ui.Components.xc(this.a.g0, null));
        }
    }
}
