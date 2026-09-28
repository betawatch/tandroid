package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class qu implements DialogInterface.OnShowListener {
    public final /* synthetic */ xu a;

    public qu(xu xuVar) {
        this.a = xuVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        q91 q91Var = this.a.c;
        if (qg0.p0.P && q91Var.f()) {
            q91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.fa(this, 1));
        }
    }
}
