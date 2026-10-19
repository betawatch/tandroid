package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class vu implements DialogInterface.OnShowListener {
    public final /* synthetic */ cv a;

    public vu(cv cvVar) {
        this.a = cvVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        v91 v91Var = this.a.c;
        if (zg0.p0.P && v91Var.f()) {
            v91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ca(this, 1));
        }
    }
}
