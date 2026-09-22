package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ou implements DialogInterface.OnShowListener {
    public final /* synthetic */ vu a;

    public ou(vu vuVar) {
        this.a = vuVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        r91 r91Var = this.a.c;
        if (rg0.p0.P && r91Var.f()) {
            r91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ga(this, 1));
        }
    }
}
