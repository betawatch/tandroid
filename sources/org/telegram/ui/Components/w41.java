package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w41 extends ImageReceiver {
    public final /* synthetic */ x41 K1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w41(x41 x41Var) {
        super(null);
        this.K1 = x41Var;
    }

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.m5
    public final void invalidate() {
        this.K1.invalidate();
    }
}
