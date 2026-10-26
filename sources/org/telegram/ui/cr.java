package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class cr extends org.telegram.ui.Components.y20 {
    public final /* synthetic */ kr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr(kr krVar, Activity activity, kr krVar2) {
        super(activity, krVar2);
        this.b = krVar;
    }

    @Override // org.telegram.ui.Components.y20
    public final void n() {
        kr krVar = this.b;
        krVar.getMessagesController().convertToGigaGroup(krVar.getParentActivity(), krVar.n, krVar, new y0(this, 26));
    }

    @Override // org.telegram.ui.Components.y20
    public final void m() {
    }
}
