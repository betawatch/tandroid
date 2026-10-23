package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class t71 extends ImageReceiver {
    public final /* synthetic */ u71 a;

    public t71(u71 u71Var) {
        this.a = u71Var;
    }

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.x5
    public final void invalidate() {
        this.a.invalidate();
    }
}
