package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
