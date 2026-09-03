package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class q0 extends k7.y5 {
    public final /* synthetic */ l4 a;

    public q0(l4 l4Var) {
        this.a = l4Var;
    }

    @Override // k7.y5
    public final void a(boolean z4) {
        if (z4) {
            this.a.e0.h(false);
        }
    }

    @Override // k7.y5
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            b.m(R.string.TextCopied, new org.telegram.ui.Components.qc(this.a.d0, null));
        }
    }
}
