package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class cw extends org.telegram.ui.Components.mt {
    public final /* synthetic */ dy E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw(zx zxVar, dy dyVar) {
        super(zxVar);
        this.E = dyVar;
    }

    @Override // s4.g1
    public final void y() {
        dy dyVar = this.E;
        if (dyVar.c.L0() == 0) {
            View m10 = dyVar.c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (dyVar.v == 2) {
                dyVar.v = 1;
            }
            hw hwVar = dyVar.n;
            if (hwVar != null) {
                hwVar.b();
            }
        }
    }
}
