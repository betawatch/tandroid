package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class k80 extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ ViewGroup o;
    public final /* synthetic */ p80 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k80(p80 p80Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.p = p80Var;
        this.o = viewGroup;
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.o;
        p80 p80Var = this.p;
        p80.a(p80Var, viewGroup);
        Runnable runnable = p80Var.p;
        if (runnable != null) {
            runnable.run();
            p80Var.p = null;
        }
    }
}
