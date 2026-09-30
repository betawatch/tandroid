package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class hr extends org.telegram.ui.Components.q20 {
    public final /* synthetic */ pr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr(pr prVar, Activity activity, pr prVar2) {
        super(activity, prVar2);
        this.b = prVar;
    }

    @Override // org.telegram.ui.Components.q20
    public final void n() {
        pr prVar = this.b;
        prVar.getMessagesController().convertToGigaGroup(prVar.getParentActivity(), prVar.r, prVar, new z0(this, 24));
    }

    @Override // org.telegram.ui.Components.q20
    public final void m() {
    }
}
