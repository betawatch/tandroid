package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
