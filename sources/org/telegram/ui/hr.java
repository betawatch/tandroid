package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hr extends org.telegram.ui.Components.t10 {
    public final /* synthetic */ pr j1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr(pr prVar, Activity activity, pr prVar2) {
        super(activity, prVar2);
        this.j1 = prVar;
    }

    @Override // org.telegram.ui.Components.t10
    public final void J0() {
        pr prVar = this.j1;
        prVar.getMessagesController().S(prVar.getParentActivity(), prVar.n, prVar, new y0(this, 26));
    }

    @Override // org.telegram.ui.Components.t10
    public final void I0() {
    }
}
