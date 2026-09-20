package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ou implements DialogInterface.OnShowListener {
    public final /* synthetic */ vu a;

    public ou(vu vuVar) {
        this.a = vuVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        p91 p91Var = this.a.c;
        if (og0.p0.P && p91Var.f()) {
            p91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ga(this, 1));
        }
    }
}
