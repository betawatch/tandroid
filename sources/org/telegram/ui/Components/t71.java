package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
