package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class jq extends org.telegram.ui.Components.o10 {
    public final /* synthetic */ rq n1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq(rq rqVar, Activity activity, rq rqVar2) {
        super(activity, rqVar2);
        this.n1 = rqVar;
    }

    @Override // org.telegram.ui.Components.o10
    public final void K0() {
        rq rqVar = this.n1;
        rqVar.getMessagesController().S(rqVar.getParentActivity(), rqVar.n, rqVar, new w0(this, 27));
    }

    @Override // org.telegram.ui.Components.o10
    public final void J0() {
    }
}
