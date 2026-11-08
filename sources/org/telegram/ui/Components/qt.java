package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class qt implements DialogInterface.OnShowListener {
    public final /* synthetic */ wt a;

    public qt(wt wtVar) {
        this.a = wtVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        wt wtVar = this.a;
        l71 l71Var = wtVar.j1;
        if (wtVar.M0() && l71Var.f()) {
            l71Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 2));
        }
    }
}
