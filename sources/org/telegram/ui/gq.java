package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class gq extends org.telegram.ui.Components.d10 {
    public final /* synthetic */ oq j1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq(oq oqVar, Activity activity, oq oqVar2) {
        super(activity, oqVar2);
        this.j1 = oqVar;
    }

    @Override // org.telegram.ui.Components.d10
    public final void J0() {
        oq oqVar = this.j1;
        oqVar.getMessagesController().S(oqVar.getParentActivity(), oqVar.n, oqVar, new w0(this, 27));
    }

    @Override // org.telegram.ui.Components.d10
    public final void I0() {
    }
}
