package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class p61 extends ImageReceiver {
    public final /* synthetic */ q61 a;

    public p61(q61 q61Var) {
        this.a = q61Var;
    }

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.u5
    public final void invalidate() {
        this.a.invalidate();
    }
}
