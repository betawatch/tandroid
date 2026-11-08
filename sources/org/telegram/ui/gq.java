package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class gq extends org.telegram.ui.Components.e10 {
    public final /* synthetic */ oq j1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq(oq oqVar, Activity activity, oq oqVar2) {
        super(activity, oqVar2);
        this.j1 = oqVar;
    }

    @Override // org.telegram.ui.Components.e10
    public final void J0() {
        oq oqVar = this.j1;
        oqVar.getMessagesController().S(oqVar.getParentActivity(), oqVar.n, oqVar, new w0(this, 27));
    }

    @Override // org.telegram.ui.Components.e10
    public final void I0() {
    }
}
