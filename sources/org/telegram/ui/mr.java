package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        urVar.getMessagesController().convertToGigaGroup(urVar.getParentActivity(), urVar.r, urVar, new y0(this, 24));
    }

    @Override // org.telegram.ui.Components.n20
    public final void m() {
    }
}
