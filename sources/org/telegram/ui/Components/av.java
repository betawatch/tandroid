package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class av implements DialogInterface.OnShowListener {
    public final /* synthetic */ hv a;

    public av(hv hvVar) {
        this.a = hvVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        da1 da1Var = this.a.c;
        if (fh0.p0.P && da1Var.f()) {
            da1Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.da(this, 1));
        }
    }
}
