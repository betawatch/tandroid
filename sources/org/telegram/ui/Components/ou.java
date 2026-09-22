package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ou implements DialogInterface.OnShowListener {
    public final /* synthetic */ vu a;

    public ou(vu vuVar) {
        this.a = vuVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        c91 c91Var = this.a.c;
        if (eg0.p0.P && c91Var.f()) {
            c91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.fa(this, 1));
        }
    }
}
