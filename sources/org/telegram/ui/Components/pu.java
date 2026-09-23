package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class pu implements DialogInterface.OnShowListener {
    public final /* synthetic */ wu a;

    public pu(wu wuVar) {
        this.a = wuVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        b91 b91Var = this.a.c;
        if (eg0.p0.P && b91Var.f()) {
            b91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ga(this, 1));
        }
    }
}
