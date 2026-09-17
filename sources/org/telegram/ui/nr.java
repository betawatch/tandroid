package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
