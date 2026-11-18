package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class p51 extends ImageReceiver {
    public final /* synthetic */ q51 K1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p51(q51 q51Var) {
        super(null);
        this.K1 = q51Var;
    }

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.u5
    public final void invalidate() {
        this.K1.invalidate();
    }
}
