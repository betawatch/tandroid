package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class jq extends org.telegram.ui.Components.d10 {
    public final /* synthetic */ rq m1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq(rq rqVar, Activity activity, rq rqVar2) {
        super(activity, rqVar2);
        this.m1 = rqVar;
    }

    @Override // org.telegram.ui.Components.d10
    public final void J0() {
        rq rqVar = this.m1;
        rqVar.getMessagesController().S(rqVar.getParentActivity(), rqVar.n, rqVar, new w0(this, 27));
    }

    @Override // org.telegram.ui.Components.d10
    public final void I0() {
    }
}
