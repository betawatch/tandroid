package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class dv extends org.telegram.ui.Components.qs {
    public final /* synthetic */ ax F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv(xw xwVar, ax axVar) {
        super(xwVar);
        this.F = axVar;
    }

    @Override // v4.h1
    public final void y() {
        ax axVar = this.F;
        if (axVar.c.L0() == 0) {
            View m10 = axVar.c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (axVar.w == 2) {
                axVar.w = 1;
            }
            iv ivVar = axVar.n;
            if (ivVar != null) {
                ivVar.b();
            }
        }
    }
}
