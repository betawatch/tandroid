package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class vu implements DialogInterface.OnShowListener {
    public final /* synthetic */ cv a;

    public vu(cv cvVar) {
        this.a = cvVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        w91 w91Var = this.a.c;
        if (ah0.p0.P && w91Var.f()) {
            w91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ca(this, 1));
        }
    }
}
