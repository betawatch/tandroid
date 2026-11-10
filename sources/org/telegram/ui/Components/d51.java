package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class d51 extends ImageReceiver {
    public final /* synthetic */ e51 J1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d51(e51 e51Var) {
        super(null);
        this.J1 = e51Var;
    }

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.n5
    public final void invalidate() {
        this.J1.invalidate();
    }
}
