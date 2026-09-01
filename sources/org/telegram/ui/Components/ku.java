package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ku implements DialogInterface.OnShowListener {
    public final /* synthetic */ ru a;

    public ku(ru ruVar) {
        this.a = ruVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        f91 f91Var = this.a.c;
        if (ng0.m0.M && f91Var.f()) {
            f91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ba(this, 1));
        }
    }
}
