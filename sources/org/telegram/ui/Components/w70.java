package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class w70 extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ ViewGroup o;
    public final /* synthetic */ b80 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w70(b80 b80Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.p = b80Var;
        this.o = viewGroup;
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.o;
        b80 b80Var = this.p;
        b80.a(b80Var, viewGroup);
        Runnable runnable = b80Var.p;
        if (runnable != null) {
            runnable.run();
            b80Var.p = null;
        }
    }
}
