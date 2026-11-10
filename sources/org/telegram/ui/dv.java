package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class dv extends org.telegram.ui.Components.ds {
    public final /* synthetic */ yw E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv(vw vwVar, yw ywVar) {
        super(vwVar);
        this.E = ywVar;
    }

    @Override // v4.f1
    public final void y() {
        yw ywVar = this.E;
        if (ywVar.c.L0() == 0) {
            View m10 = ywVar.c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (ywVar.w == 2) {
                ywVar.w = 1;
            }
            iv ivVar = ywVar.n;
            if (ivVar != null) {
                ivVar.b();
            }
        }
    }
}
