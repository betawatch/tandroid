package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class k70 extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ ViewGroup o;
    public final /* synthetic */ p70 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k70(p70 p70Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.p = p70Var;
        this.o = viewGroup;
    }

    @Override // org.telegram.ui.ActionBar.p1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.o;
        p70 p70Var = this.p;
        p70.a(p70Var, viewGroup);
        Runnable runnable = p70Var.p;
        if (runnable != null) {
            runnable.run();
            p70Var.p = null;
        }
    }
}
