package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class bu implements DialogInterface.OnShowListener {
    public final /* synthetic */ gu a;

    public bu(gu guVar) {
        this.a = guVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        gu guVar = this.a;
        a81 a81Var = guVar.n1;
        if (guVar.N0() && a81Var.f()) {
            a81Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 2));
        }
    }
}
