package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class f51 extends ImageReceiver {
    public final /* synthetic */ g51 K1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f51(g51 g51Var) {
        super(null);
        this.K1 = g51Var;
    }

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.m5
    public final void invalidate() {
        this.K1.invalidate();
    }
}
