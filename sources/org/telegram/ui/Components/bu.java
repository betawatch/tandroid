package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class bu implements DialogInterface.OnShowListener {
    public final /* synthetic */ hu a;

    public bu(hu huVar) {
        this.a = huVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        m81 m81Var = this.a.j1;
        if (jf0.p0.P && m81Var.f()) {
            m81Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.l1(this, 2));
        }
    }
}
