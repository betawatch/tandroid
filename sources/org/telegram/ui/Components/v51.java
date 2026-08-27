package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class v51 extends ImageReceiver {
    public final /* synthetic */ w51 a;

    public v51(w51 w51Var) {
        this.a = w51Var;
    }

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.q5
    public final void invalidate() {
        this.a.invalidate();
    }
}
