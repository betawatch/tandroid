package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
