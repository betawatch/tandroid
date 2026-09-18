package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class e71 extends ImageReceiver {
    public final /* synthetic */ f71 a;

    public e71(f71 f71Var) {
        this.a = f71Var;
    }

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.w5
    public final void invalidate() {
        this.a.invalidate();
    }
}
