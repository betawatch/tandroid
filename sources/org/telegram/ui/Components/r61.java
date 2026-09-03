package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class r61 extends ImageReceiver {
    public final /* synthetic */ s61 a;

    public r61(s61 s61Var) {
        this.a = s61Var;
    }

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.r5
    public final void invalidate() {
        this.a.invalidate();
    }
}
