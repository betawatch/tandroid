package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ev implements DialogInterface.OnShowListener {
    public final /* synthetic */ lv a;

    public ev(lv lvVar) {
        this.a = lvVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        ha1 ha1Var = this.a.c;
        if (gh0.p0.P && ha1Var.f()) {
            ha1Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.da(this, 1));
        }
    }
}
