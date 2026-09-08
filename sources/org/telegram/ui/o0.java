package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class o0 extends w7.h0 {
    public final /* synthetic */ i4 a;

    public o0(i4 i4Var) {
        this.a = i4Var;
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
            org.telegram.messenger.wl.o(R.string.TextCopied, new org.telegram.ui.Components.yc(this.a.g0, null));
        }
    }
}
