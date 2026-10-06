package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class p0 extends w7.j0 {
    public final /* synthetic */ i4 a;

    public p0(i4 i4Var) {
        this.a = i4Var;
    }

    @Override // w7.j0
    public final void a(boolean z10) {
        if (z10) {
            this.a.h0.h(false);
        }
    }

    @Override // w7.j0
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.messenger.bi.n(R.string.TextCopied, new org.telegram.ui.Components.yc(this.a.g0, null));
        }
    }
}
