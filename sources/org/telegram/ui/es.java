package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class es extends org.telegram.ui.ActionBar.g1 {
    public final /* synthetic */ js o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es(js jsVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.o = jsVar;
    }

    @Override // org.telegram.ui.ActionBar.g1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ns nsVar = this.o.a;
        nsVar.k = null;
        nsVar.K = false;
        if (nsVar.R) {
            nsVar.m();
        }
    }
}
