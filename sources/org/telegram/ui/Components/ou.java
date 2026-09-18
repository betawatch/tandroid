package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class ou implements DialogInterface.OnShowListener {
    public final /* synthetic */ vu a;

    public ou(vu vuVar) {
        this.a = vuVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        q91 q91Var = this.a.c;
        if (pg0.p0.P && q91Var.f()) {
            q91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.fa(this, 1));
        }
    }
}
