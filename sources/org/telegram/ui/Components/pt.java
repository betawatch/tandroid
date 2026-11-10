package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class pt implements DialogInterface.OnShowListener {
    public final /* synthetic */ vt a;

    public pt(vt vtVar) {
        this.a = vtVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        vt vtVar = this.a;
        l71 l71Var = vtVar.m1;
        if (vtVar.M0() && l71Var.f()) {
            l71Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 2));
        }
    }
}
