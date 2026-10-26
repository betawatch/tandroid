package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class wu implements DialogInterface.OnShowListener {
    public final /* synthetic */ dv a;

    public wu(dv dvVar) {
        this.a = dvVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        ma1 ma1Var = this.a.c;
        if (ch0.p0.P && ma1Var.f()) {
            ma1Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ha(this, 1));
        }
    }
}
