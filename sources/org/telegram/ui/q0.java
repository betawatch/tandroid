package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
