package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class vu implements DialogInterface.OnShowListener {
    public final /* synthetic */ cv a;

    public vu(cv cvVar) {
        this.a = cvVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        u91 u91Var = this.a.c;
        if (zg0.p0.P && u91Var.f()) {
            u91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ca(this, 1));
        }
    }
}
