package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
