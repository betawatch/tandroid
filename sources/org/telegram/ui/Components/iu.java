package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class iu implements DialogInterface.OnShowListener {
    public final /* synthetic */ pu a;

    public iu(pu puVar) {
        this.a = puVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        e91 e91Var = this.a.c;
        if (lg0.m0.M && e91Var.f()) {
            e91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ba(this, 1));
        }
    }
}
