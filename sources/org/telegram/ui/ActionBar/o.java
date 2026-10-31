package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements r0.m, ei.o {
    public final /* synthetic */ k2 a;

    public /* synthetic */ o(k2 k2Var) {
        this.a = k2Var;
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        return this.a.onInsetsInternal(view, j1Var);
    }

    @Override // ei.o
    public int c() {
        k2 k2Var = this.a;
        k2Var.getClass();
        return k2Var.getThemedColor(t6.a7);
    }
}
