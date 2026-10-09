package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class u71 extends ImageReceiver {
    public final /* synthetic */ v71 a;

    public u71(v71 v71Var) {
        this.a = v71Var;
    }

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.y5
    public final void invalidate() {
        this.a.invalidate();
    }
}
