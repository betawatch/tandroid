package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class cr extends org.telegram.ui.Components.b20 {
    public final /* synthetic */ lr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr(lr lrVar, Activity activity, lr lrVar2) {
        super(activity, lrVar2);
        this.b = lrVar;
    }

    @Override // org.telegram.ui.Components.b20
    public final void n() {
        lr lrVar = this.b;
        lrVar.getMessagesController().convertToGigaGroup(lrVar.getParentActivity(), lrVar.r, lrVar, new c1(this, 24));
    }

    @Override // org.telegram.ui.Components.b20
    public final void m() {
    }
}
