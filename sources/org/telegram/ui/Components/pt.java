package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class pt implements DialogInterface.OnShowListener {
    public final /* synthetic */ vt a;

    public pt(vt vtVar) {
        this.a = vtVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        vt vtVar = this.a;
        f71 f71Var = vtVar.j1;
        if (vtVar.M0() && f71Var.f()) {
            f71Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 2));
        }
    }
}
