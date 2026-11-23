package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class jq extends org.telegram.ui.Components.r10 {
    public final /* synthetic */ rq n1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq(rq rqVar, Activity activity, rq rqVar2) {
        super(activity, rqVar2);
        this.n1 = rqVar;
    }

    @Override // org.telegram.ui.Components.r10
    public final void K0() {
        rq rqVar = this.n1;
        rqVar.getMessagesController().S(rqVar.getParentActivity(), rqVar.n, rqVar, new w0(this, 27));
    }

    @Override // org.telegram.ui.Components.r10
    public final void J0() {
    }
}
