package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ot implements DialogInterface.OnShowListener {
    public final /* synthetic */ ut a;

    public ot(ut utVar) {
        this.a = utVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        d71 d71Var = this.a.k1;
        if (ie0.q0.Q && d71Var.f()) {
            d71Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.g1(this, 2));
        }
    }
}
