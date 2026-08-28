package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class zt implements DialogInterface.OnShowListener {
    public final /* synthetic */ gu a;

    public zt(gu guVar) {
        this.a = guVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        g81 g81Var = this.a.c;
        if (pf0.l0.L && g81Var.f()) {
            g81Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ca(this, 1));
        }
    }
}
