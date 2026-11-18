package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
