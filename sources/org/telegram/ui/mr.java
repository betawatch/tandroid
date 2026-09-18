package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class mr extends org.telegram.ui.Components.n20 {
    public final /* synthetic */ ur b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr(ur urVar, Activity activity, ur urVar2) {
        super(activity, urVar2);
        this.b = urVar;
    }

    @Override // org.telegram.ui.Components.n20
    public final void n() {
        ur urVar = this.b;
        urVar.getMessagesController().convertToGigaGroup(urVar.getParentActivity(), urVar.r, urVar, new y0(this, 25));
    }

    @Override // org.telegram.ui.Components.n20
    public final void m() {
    }
}
