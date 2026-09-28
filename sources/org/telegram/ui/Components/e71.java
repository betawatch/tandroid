package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class e71 extends ImageReceiver {
    public final /* synthetic */ f71 a;

    public e71(f71 f71Var) {
        this.a = f71Var;
    }

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.w5
    public final void invalidate() {
        this.a.invalidate();
    }
}
