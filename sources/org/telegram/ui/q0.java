package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class q0 extends w7.j0 {
    public final /* synthetic */ k4 a;

    public q0(k4 k4Var) {
        this.a = k4Var;
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
            org.telegram.messenger.sl.p(R.string.TextCopied, new org.telegram.ui.Components.xc(this.a.g0, null));
        }
    }
}
