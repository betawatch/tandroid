package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
            org.telegram.messenger.vl.o(R.string.TextCopied, new org.telegram.ui.Components.yc(this.a.g0, null));
        }
    }
}
