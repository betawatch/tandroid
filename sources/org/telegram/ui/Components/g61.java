package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class g61 extends ImageReceiver {
    public final /* synthetic */ h61 a;

    public g61(h61 h61Var) {
        this.a = h61Var;
    }

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.v5
    public final void invalidate() {
        this.a.invalidate();
    }
}
