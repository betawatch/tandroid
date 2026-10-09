package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class kr extends org.telegram.ui.Components.e30 {
    public final /* synthetic */ tr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr(tr trVar, Activity activity, tr trVar2) {
        super(activity, trVar2);
        this.b = trVar;
    }

    @Override // org.telegram.ui.Components.e30
    public final void p() {
        tr trVar = this.b;
        trVar.getMessagesController().convertToGigaGroup(trVar.getParentActivity(), trVar.r, trVar, new z0(this, 24));
    }

    @Override // org.telegram.ui.Components.e30
    public final void o() {
    }
}
