package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class iq extends org.telegram.ui.Components.h10 {
    public final /* synthetic */ qq n1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq(qq qqVar, Activity activity, qq qqVar2) {
        super(activity, qqVar2);
        this.n1 = qqVar;
    }

    @Override // org.telegram.ui.Components.h10
    public final void J0() {
        qq qqVar = this.n1;
        qqVar.getMessagesController().S(qqVar.getParentActivity(), qqVar.n, qqVar, new w0(this, 27));
    }

    @Override // org.telegram.ui.Components.h10
    public final void I0() {
    }
}
