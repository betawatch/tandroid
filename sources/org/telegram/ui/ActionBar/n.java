package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements r0.n, li.j {
    public final /* synthetic */ n2 a;

    public /* synthetic */ n(n2 n2Var) {
        this.a = n2Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return this.a.onInsetsInternal(view, l1Var);
    }

    @Override // li.j
    public int f() {
        n2 n2Var = this.a;
        n2Var.getClass();
        return n2Var.getThemedColor(i6.a7);
    }
}
