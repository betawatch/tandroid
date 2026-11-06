package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
