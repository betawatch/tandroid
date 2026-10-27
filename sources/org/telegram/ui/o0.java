package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class o0 extends a8.ye {
    public final /* synthetic */ j4 a;

    public o0(j4 j4Var) {
        this.a = j4Var;
    }

    @Override // a8.ye
    public final void a(boolean z10) {
        if (z10) {
            this.a.h0.h(false);
        }
    }

    @Override // a8.ye
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.messenger.wh.m(R.string.TextCopied, new org.telegram.ui.Components.wc(this.a.g0, null));
        }
    }
}
