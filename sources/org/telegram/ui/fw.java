package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fw extends org.telegram.ui.Components.ps {
    public final /* synthetic */ zx E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw(wx wxVar, zx zxVar) {
        super(wxVar);
        this.E = zxVar;
    }

    @Override // s4.f1
    public final void y() {
        zx zxVar = this.E;
        if (zxVar.c.L0() == 0) {
            View m10 = zxVar.c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (zxVar.w == 2) {
                zxVar.w = 1;
            }
            kw kwVar = zxVar.n;
            if (kwVar != null) {
                kwVar.b();
            }
        }
    }
}
