package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
