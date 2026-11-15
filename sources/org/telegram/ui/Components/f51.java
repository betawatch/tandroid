package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
