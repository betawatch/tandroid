package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class bv extends org.telegram.ui.Components.ks {
    public final /* synthetic */ xw E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv(uw uwVar, xw xwVar) {
        super(uwVar);
        this.E = xwVar;
    }

    @Override // v4.g1
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
            gv gvVar = xwVar.n;
            if (gvVar != null) {
                gvVar.b();
            }
        }
    }
}
