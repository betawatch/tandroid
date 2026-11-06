package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
