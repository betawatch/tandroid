package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class q61 extends ImageReceiver {
    public final /* synthetic */ r61 a;

    public q61(r61 r61Var) {
        this.a = r61Var;
    }

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.u5
    public final void invalidate() {
        this.a.invalidate();
    }
}
