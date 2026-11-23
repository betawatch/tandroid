package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class dn0 implements org.telegram.ui.Components.jl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fn0 b;

    public /* synthetic */ dn0(fn0 fn0Var, int i7) {
        this.a = i7;
        this.b = fn0Var;
    }

    @Override // org.telegram.ui.Components.jl0
    public void a(int i7, boolean z10) {
        fn0 fn0Var = this.b;
        if (fn0Var.n[0].b == i7) {
            return;
        }
        fn0Var.e = i7 == fn0Var.h.getFirstTabId();
        org.telegram.ui.ActionBar.y4 y4Var = fn0Var.n[1];
        y4Var.b = i7;
        y4Var.setVisibility(0);
        fn0Var.o0(true);
        fn0Var.w = z10;
        if (i7 == 0) {
            fn0Var.c.setSearchFieldHint(org.telegram.messenger.hd.N0(2131745565, null));
        } else {
            fn0Var.c.setSearchFieldHint(org.telegram.messenger.hd.N0(2131745568, null));
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public void g(float f10) {
        fn0 fn0Var = this.b;
        if (f10 != 1.0f || fn0Var.n[1].getVisibility() == 0) {
            if (fn0Var.w) {
                fn0Var.n[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                fn0Var.n[1].setTranslationX(r3[0].getMeasuredWidth() - (f10 * fn0Var.n[0].getMeasuredWidth()));
            } else {
                fn0Var.n[0].setTranslationX(r3.getMeasuredWidth() * f10);
                fn0Var.n[1].setTranslationX((f10 * r3[0].getMeasuredWidth()) - fn0Var.n[0].getMeasuredWidth());
            }
            if (f10 == 1.0f) {
                org.telegram.ui.ActionBar.y4[] y4VarArr = fn0Var.n;
                org.telegram.ui.ActionBar.y4 y4Var = y4VarArr[0];
                y4VarArr[0] = y4VarArr[1];
                y4VarArr[1] = y4Var;
                y4Var.setVisibility(8);
            }
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ boolean h1(int i7, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ void D() {
    }
}
