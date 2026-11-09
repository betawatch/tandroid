package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class qt implements DialogInterface.OnShowListener {
    public final /* synthetic */ wt a;

    public qt(wt wtVar) {
        this.a = wtVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        wt wtVar = this.a;
        m71 m71Var = wtVar.j1;
        if (wtVar.M0() && m71Var.f()) {
            m71Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 2));
        }
    }
}
