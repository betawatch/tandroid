package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class vu implements DialogInterface.OnShowListener {
    public final /* synthetic */ cv a;

    public vu(cv cvVar) {
        this.a = cvVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        u91 u91Var = this.a.c;
        if (zg0.p0.P && u91Var.f()) {
            u91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ca(this, 1));
        }
    }
}
