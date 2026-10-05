package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class su implements DialogInterface.OnShowListener {
    public final /* synthetic */ zu a;

    public su(zu zuVar) {
        this.a = zuVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        aa1 aa1Var = this.a.c;
        if (rg0.p0.P && aa1Var.f()) {
            aa1Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.fa(this, 1));
        }
    }
}
