package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class fu implements DialogInterface.OnShowListener {
    public final /* synthetic */ mu a;

    public fu(mu muVar) {
        this.a = muVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        s81 s81Var = this.a.c;
        if (bg0.l0.L && s81Var.f()) {
            s81Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.z9(this, 1));
        }
    }
}
