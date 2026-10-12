package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ot extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ tt o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot(tt ttVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.o = ttVar;
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        xt xtVar = this.o.a;
        xtVar.k = null;
        xtVar.K = false;
        if (xtVar.R) {
            xtVar.n();
        }
    }
}
