package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class iw extends org.telegram.ui.Components.os {
    public final /* synthetic */ fy E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw(cy cyVar, fy fyVar) {
        super(cyVar);
        this.E = fyVar;
    }

    @Override // f2.r1
    public final void y() {
        fy fyVar = this.E;
        if (fyVar.c.L0() == 0) {
            View m10 = fyVar.c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (fyVar.v == 2) {
                fyVar.v = 1;
            }
            nw nwVar = fyVar.n;
            if (nwVar != null) {
                nwVar.b();
            }
        }
    }
}
