package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class c71 extends ImageReceiver {
    public final /* synthetic */ d71 a;

    public c71(d71 d71Var) {
        this.a = d71Var;
    }

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.w5
    public final void invalidate() {
        this.a.invalidate();
    }
}
