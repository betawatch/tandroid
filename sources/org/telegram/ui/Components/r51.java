package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class r51 extends ImageReceiver {
    public final /* synthetic */ s51 K1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r51(s51 s51Var) {
        super(null);
        this.K1 = s51Var;
    }

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.u5
    public final void invalidate() {
        this.K1.invalidate();
    }
}
