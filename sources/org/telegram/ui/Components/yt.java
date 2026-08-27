package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class yt implements DialogInterface.OnShowListener {
    public final /* synthetic */ fu a;

    public yt(fu fuVar) {
        this.a = fuVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        i81 i81Var = this.a.c;
        if (sf0.l0.L && i81Var.f()) {
            i81Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.y9(this, 1));
        }
    }
}
