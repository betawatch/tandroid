package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class bu implements DialogInterface.OnShowListener {
    public final /* synthetic */ gu a;

    public bu(gu guVar) {
        this.a = guVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        gu guVar = this.a;
        w71 w71Var = guVar.n1;
        if (guVar.N0() && w71Var.f()) {
            w71Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.i1(this, 2));
        }
    }
}
