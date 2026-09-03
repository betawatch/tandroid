package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class hu implements DialogInterface.OnShowListener {
    public final /* synthetic */ ou a;

    public hu(ou ouVar) {
        this.a = ouVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        e91 e91Var = this.a.c;
        if (mg0.m0.M && e91Var.f()) {
            e91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.aa(this, 1));
        }
    }
}
