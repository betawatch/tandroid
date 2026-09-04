package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
