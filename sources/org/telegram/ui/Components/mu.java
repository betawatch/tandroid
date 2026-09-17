package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class mu implements DialogInterface.OnShowListener {
    public final /* synthetic */ tu a;

    public mu(tu tuVar) {
        this.a = tuVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        b91 b91Var = this.a.c;
        if (eg0.p0.P && b91Var.f()) {
            b91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.fa(this, 1));
        }
    }
}
