package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class w60 extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ ViewGroup o;
    public final /* synthetic */ b70 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w60(b70 b70Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.p = b70Var;
        this.o = viewGroup;
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.o;
        b70 b70Var = this.p;
        b70.a(b70Var, viewGroup);
        Runnable runnable = b70Var.p;
        if (runnable != null) {
            runnable.run();
            b70Var.p = null;
        }
    }
}
