package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class su implements DialogInterface.OnShowListener {
    public final /* synthetic */ zu a;

    public su(zu zuVar) {
        this.a = zuVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        o91 o91Var = this.a.c;
        if (og0.p0.P && o91Var.f()) {
            o91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ha(this, 1));
        }
    }
}
