package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
