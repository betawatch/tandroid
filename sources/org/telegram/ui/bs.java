package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class bs extends org.telegram.ui.ActionBar.g1 {
    public final /* synthetic */ gs o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs(gs gsVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.o = gsVar;
    }

    @Override // org.telegram.ui.ActionBar.g1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ks ksVar = this.o.a;
        ksVar.k = null;
        ksVar.K = false;
        if (ksVar.R) {
            ksVar.m();
        }
    }
}
