package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class g61 extends ImageReceiver {
    public final /* synthetic */ h61 J1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g61(h61 h61Var) {
        super(null);
        this.J1 = h61Var;
    }

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.l5
    public final void invalidate() {
        this.J1.invalidate();
    }
}
