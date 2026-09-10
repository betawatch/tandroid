package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class kt extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ pt o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt(pt ptVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.o = ptVar;
    }

    @Override // org.telegram.ui.ActionBar.p1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        tt ttVar = this.o.a;
        ttVar.k = null;
        ttVar.K = false;
        if (ttVar.R) {
            ttVar.n();
        }
    }
}
