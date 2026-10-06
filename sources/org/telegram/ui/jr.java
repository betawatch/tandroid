package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
