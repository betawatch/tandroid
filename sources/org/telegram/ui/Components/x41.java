package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class x41 extends ImageReceiver {
    public final /* synthetic */ y41 J1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x41(y41 y41Var) {
        super(null);
        this.J1 = y41Var;
    }

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.o5
    public final void invalidate() {
        this.J1.invalidate();
    }
}
