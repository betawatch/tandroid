package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class q0 extends k7.x5 {
    public final /* synthetic */ l4 a;

    public q0(l4 l4Var) {
        this.a = l4Var;
    }

    @Override // k7.x5
    public final void a(boolean z4) {
        if (z4) {
            this.a.e0.h(false);
        }
    }

    @Override // k7.x5
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            b.m(R.string.TextCopied, new org.telegram.ui.Components.qc(this.a.d0, null));
        }
    }
}
