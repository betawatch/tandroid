package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class du implements DialogInterface.OnShowListener {
    public final /* synthetic */ iu a;

    public du(iu iuVar) {
        this.a = iuVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        iu iuVar = this.a;
        z71 z71Var = iuVar.n1;
        if (iuVar.N0() && z71Var.f()) {
            z71Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 2));
        }
    }
}
