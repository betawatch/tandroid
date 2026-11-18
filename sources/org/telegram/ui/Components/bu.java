package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
