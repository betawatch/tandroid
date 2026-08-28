package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fw extends org.telegram.ui.Components.ps {
    public final /* synthetic */ cy E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw(yx yxVar, cy cyVar) {
        super(yxVar);
        this.E = cyVar;
    }

    @Override // f2.t1
    public final void y() {
        cy cyVar = this.E;
        if (cyVar.c.L0() == 0) {
            View m10 = cyVar.c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (cyVar.v == 2) {
                cyVar.v = 1;
            }
            kw kwVar = cyVar.n;
            if (kwVar != null) {
                kwVar.b();
            }
        }
    }
}
