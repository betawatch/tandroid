package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
            org.telegram.messenger.vh.m(R.string.TextCopied, new org.telegram.ui.Components.wc(this.a.g0, null));
        }
    }
}
