package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class kr extends org.telegram.ui.Components.n20 {
    public final /* synthetic */ sr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr(sr srVar, Activity activity, sr srVar2) {
        super(activity, srVar2);
        this.b = srVar;
    }

    @Override // org.telegram.ui.Components.n20
    public final void n() {
        sr srVar = this.b;
        srVar.getMessagesController().convertToGigaGroup(srVar.getParentActivity(), srVar.r, srVar, new y0(this, 25));
    }

    @Override // org.telegram.ui.Components.n20
    public final void m() {
    }
}
