package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class p0 extends w7.w5 {
    public final /* synthetic */ j4 a;

    public p0(j4 j4Var) {
        this.a = j4Var;
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
            org.telegram.messenger.em.o(R.string.TextCopied, new org.telegram.ui.Components.wc(this.a.g0, null));
        }
    }
}
