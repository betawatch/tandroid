package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ew extends org.telegram.ui.Components.ps {
    public final /* synthetic */ yx E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew(vx vxVar, yx yxVar) {
        super(vxVar);
        this.E = yxVar;
    }

    @Override // s4.f1
    public final void y() {
        yx yxVar = this.E;
        if (yxVar.c.L0() == 0) {
            View m10 = yxVar.c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (yxVar.w == 2) {
                yxVar.w = 1;
            }
            jw jwVar = yxVar.n;
            if (jwVar != null) {
                jwVar.b();
            }
        }
    }
}
