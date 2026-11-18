package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class dn0 implements org.telegram.ui.Components.hl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fn0 b;

    public /* synthetic */ dn0(fn0 fn0Var, int i7) {
        this.a = i7;
        this.b = fn0Var;
    }

    @Override // org.telegram.ui.Components.hl0
    public void a(int i7, boolean z10) {
        fn0 fn0Var = this.b;
        if (fn0Var.n[0].b == i7) {
            return;
        }
        fn0Var.e = i7 == fn0Var.h.getFirstTabId();
        org.telegram.ui.ActionBar.z4 z4Var = fn0Var.n[1];
        z4Var.b = i7;
        z4Var.setVisibility(0);
        fn0Var.o0(true);
        fn0Var.w = z10;
        if (i7 == 0) {
            fn0Var.c.setSearchFieldHint(org.telegram.messenger.gd.M0(2131745566, null));
        } else {
            fn0Var.c.setSearchFieldHint(org.telegram.messenger.gd.M0(2131745569, null));
        }
    }

    @Override // org.telegram.ui.Components.hl0
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
                org.telegram.ui.ActionBar.z4[] z4VarArr = fn0Var.n;
                org.telegram.ui.ActionBar.z4 z4Var = z4VarArr[0];
                z4VarArr[0] = z4VarArr[1];
                z4VarArr[1] = z4Var;
                z4Var.setVisibility(8);
            }
        }
    }

    @Override // org.telegram.ui.Components.hl0
    public /* synthetic */ boolean h1(int i7, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.hl0
    public /* synthetic */ void D() {
    }
}
