package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class pt implements DialogInterface.OnShowListener {
    public final /* synthetic */ vt a;

    public pt(vt vtVar) {
        this.a = vtVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        vt vtVar = this.a;
        l71 l71Var = vtVar.j1;
        if (vtVar.M0() && l71Var.f()) {
            l71Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 2));
        }
    }
}
