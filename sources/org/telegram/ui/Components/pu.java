package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
