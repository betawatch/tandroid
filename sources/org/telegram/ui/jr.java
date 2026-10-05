package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class jr extends org.telegram.ui.Components.r20 {
    public final /* synthetic */ rr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr(rr rrVar, Activity activity, rr rrVar2) {
        super(activity, rrVar2);
        this.b = rrVar;
    }

    @Override // org.telegram.ui.Components.r20
    public final void n() {
        rr rrVar = this.b;
        rrVar.getMessagesController().convertToGigaGroup(rrVar.getParentActivity(), rrVar.r, rrVar, new z0(this, 26));
    }

    @Override // org.telegram.ui.Components.r20
    public final void m() {
    }
}
