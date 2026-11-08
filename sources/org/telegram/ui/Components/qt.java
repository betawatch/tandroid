package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
