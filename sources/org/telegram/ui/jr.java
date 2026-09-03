package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class jr extends org.telegram.ui.Components.p20 {
    public final /* synthetic */ rr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr(rr rrVar, Activity activity, rr rrVar2) {
        super(activity, rrVar2);
        this.b = rrVar;
    }

    @Override // org.telegram.ui.Components.p20
    public final void n() {
        rr rrVar = this.b;
        rrVar.getMessagesController().convertToGigaGroup(rrVar.getParentActivity(), rrVar.r, rrVar, new c1(this, 24));
    }

    @Override // org.telegram.ui.Components.p20
    public final void m() {
    }
}
