package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f61 extends ImageReceiver {
    public final /* synthetic */ g61 J1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f61(g61 g61Var) {
        super(null);
        this.J1 = g61Var;
    }

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.l5
    public final void invalidate() {
        this.J1.invalidate();
    }
}
