package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ku implements DialogInterface.OnShowListener {
    public final /* synthetic */ ru a;

    public ku(ru ruVar) {
        this.a = ruVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        e91 e91Var = this.a.c;
        if (ng0.m0.M && e91Var.f()) {
            e91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ba(this, 1));
        }
    }
}
