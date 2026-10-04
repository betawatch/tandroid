package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class su implements DialogInterface.OnShowListener {
    public final /* synthetic */ zu a;

    public su(zu zuVar) {
        this.a = zuVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        z91 z91Var = this.a.c;
        if (rg0.p0.P && z91Var.f()) {
            z91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.fa(this, 1));
        }
    }
}
