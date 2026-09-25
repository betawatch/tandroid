package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class dt extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ jt o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt(jt jtVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.o = jtVar;
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        nt ntVar = this.o.a;
        ntVar.k = null;
        ntVar.K = false;
        if (ntVar.R) {
            ntVar.n();
        }
    }
}
