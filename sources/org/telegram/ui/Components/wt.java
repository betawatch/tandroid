package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class wt implements DialogInterface.OnShowListener {
    public final /* synthetic */ bu a;

    public wt(bu buVar) {
        this.a = buVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        bu buVar = this.a;
        m71 m71Var = buVar.n1;
        if (buVar.M0() && m71Var.f()) {
            m71Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 2));
        }
    }
}
