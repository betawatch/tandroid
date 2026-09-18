package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ou implements DialogInterface.OnShowListener {
    public final /* synthetic */ vu a;

    public ou(vu vuVar) {
        this.a = vuVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        d91 d91Var = this.a.c;
        if (fg0.p0.P && d91Var.f()) {
            d91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.fa(this, 1));
        }
    }
}
