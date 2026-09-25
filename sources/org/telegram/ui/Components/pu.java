package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class pu implements DialogInterface.OnShowListener {
    public final /* synthetic */ wu a;

    public pu(wu wuVar) {
        this.a = wuVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        o91 o91Var = this.a.c;
        if (og0.p0.P && o91Var.f()) {
            o91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.fa(this, 1));
        }
    }
}
