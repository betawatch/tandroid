package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class t71 extends ImageReceiver {
    public final /* synthetic */ u71 a;

    public t71(u71 u71Var) {
        this.a = u71Var;
    }

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.x5
    public final void invalidate() {
        this.a.invalidate();
    }
}
