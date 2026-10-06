package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements r0.n, li.m {
    public final /* synthetic */ n2 a;

    public /* synthetic */ n(n2 n2Var) {
        this.a = n2Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return this.a.onInsetsInternal(view, l1Var);
    }

    @Override // li.m
    public int f() {
        n2 n2Var = this.a;
        n2Var.getClass();
        return n2Var.getThemedColor(i6.a7);
    }
}
