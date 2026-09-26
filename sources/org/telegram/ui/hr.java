package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class hr extends org.telegram.ui.Components.o20 {
    public final /* synthetic */ pr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr(pr prVar, Activity activity, pr prVar2) {
        super(activity, prVar2);
        this.b = prVar;
    }

    @Override // org.telegram.ui.Components.o20
    public final void n() {
        pr prVar = this.b;
        prVar.getMessagesController().convertToGigaGroup(prVar.getParentActivity(), prVar.r, prVar, new z0(this, 24));
    }

    @Override // org.telegram.ui.Components.o20
    public final void m() {
    }
}
