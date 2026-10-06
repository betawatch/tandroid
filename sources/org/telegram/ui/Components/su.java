package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class su implements DialogInterface.OnShowListener {
    public final /* synthetic */ zu a;

    public su(zu zuVar) {
        this.a = zuVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        aa1 aa1Var = this.a.c;
        if (rg0.p0.P && aa1Var.f()) {
            aa1Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.fa(this, 1));
        }
    }
}
