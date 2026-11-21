package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class s51 extends ImageReceiver {
    public final /* synthetic */ t51 K1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s51(t51 t51Var) {
        super(null);
        this.K1 = t51Var;
    }

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.v5
    public final void invalidate() {
        this.K1.invalidate();
    }
}
