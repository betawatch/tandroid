package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ft extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ lt o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft(lt ltVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.o = ltVar;
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        pt ptVar = this.o.a;
        ptVar.k = null;
        ptVar.K = false;
        if (ptVar.R) {
            ptVar.n();
        }
    }
}
