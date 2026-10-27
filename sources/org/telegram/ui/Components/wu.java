package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class wu implements DialogInterface.OnShowListener {
    public final /* synthetic */ dv a;

    public wu(dv dvVar) {
        this.a = dvVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        na1 na1Var = this.a.c;
        if (dh0.p0.P && na1Var.f()) {
            na1Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ha(this, 1));
        }
    }
}
