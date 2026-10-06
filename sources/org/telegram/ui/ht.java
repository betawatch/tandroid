package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class ht extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ nt o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht(nt ntVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.o = ntVar;
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        rt rtVar = this.o.a;
        rtVar.k = null;
        rtVar.K = false;
        if (rtVar.R) {
            rtVar.n();
        }
    }
}
