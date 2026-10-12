package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class av implements DialogInterface.OnShowListener {
    public final /* synthetic */ hv a;

    public av(hv hvVar) {
        this.a = hvVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        ca1 ca1Var = this.a.c;
        if (fh0.p0.P && ca1Var.f()) {
            ca1Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.da(this, 1));
        }
    }
}
