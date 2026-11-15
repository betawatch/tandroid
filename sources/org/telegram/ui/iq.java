package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
