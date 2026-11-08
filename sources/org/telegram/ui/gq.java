package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
