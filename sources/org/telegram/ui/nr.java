package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class nr extends org.telegram.ui.Components.n20 {
    public final /* synthetic */ vr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr(vr vrVar, Activity activity, vr vrVar2) {
        super(activity, vrVar2);
        this.b = vrVar;
    }

    @Override // org.telegram.ui.Components.n20
    public final void n() {
        vr vrVar = this.b;
        vrVar.getMessagesController().convertToGigaGroup(vrVar.getParentActivity(), vrVar.r, vrVar, new z0(this, 24));
    }

    @Override // org.telegram.ui.Components.n20
    public final void m() {
    }
}
