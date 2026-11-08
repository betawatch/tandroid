package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class c51 extends ImageReceiver {
    public final /* synthetic */ d51 J1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c51(d51 d51Var) {
        super(null);
        this.J1 = d51Var;
    }

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.o5
    public final void invalidate() {
        this.J1.invalidate();
    }
}
