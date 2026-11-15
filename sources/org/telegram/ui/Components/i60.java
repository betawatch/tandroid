package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class i60 extends org.telegram.ui.ActionBar.g1 {
    public final /* synthetic */ ViewGroup o;
    public final /* synthetic */ m60 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i60(m60 m60Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.p = m60Var;
        this.o = viewGroup;
    }

    @Override // org.telegram.ui.ActionBar.g1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.o;
        m60 m60Var = this.p;
        m60.a(m60Var, viewGroup);
        Runnable runnable = m60Var.p;
        if (runnable != null) {
            runnable.run();
            m60Var.p = null;
        }
    }
}
