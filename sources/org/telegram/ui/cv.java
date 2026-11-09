package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class cv extends org.telegram.ui.Components.es {
    public final /* synthetic */ xw E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv(uw uwVar, xw xwVar) {
        super(uwVar);
        this.E = xwVar;
    }

    @Override // v4.f1
    public final void y() {
        xw xwVar = this.E;
        if (xwVar.c.L0() == 0) {
            View m10 = xwVar.c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (xwVar.w == 2) {
                xwVar.w = 1;
            }
            hv hvVar = xwVar.n;
            if (hvVar != null) {
                hvVar.b();
            }
        }
    }
}
