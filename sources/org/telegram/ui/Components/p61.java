package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class p61 extends ImageReceiver {
    public final /* synthetic */ q61 a;

    public p61(q61 q61Var) {
        this.a = q61Var;
    }

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.w5
    public final void invalidate() {
        this.a.invalidate();
    }
}
