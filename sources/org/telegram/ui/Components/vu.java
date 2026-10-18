package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
