package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class f71 extends ImageReceiver {
    public final /* synthetic */ g71 a;

    public f71(g71 g71Var) {
        this.a = g71Var;
    }

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.v5
    public final void invalidate() {
        this.a.invalidate();
    }
}
