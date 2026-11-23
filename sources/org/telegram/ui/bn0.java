package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class bn0 implements org.telegram.ui.Components.jl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dn0 b;

    public /* synthetic */ bn0(dn0 dn0Var, int i7) {
        this.a = i7;
        this.b = dn0Var;
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ boolean Y0(int i7, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.jl0
    public void a(int i7, boolean z10) {
        dn0 dn0Var = this.b;
        if (dn0Var.n[0].b == i7) {
            return;
        }
        dn0Var.e = i7 == dn0Var.h.getFirstTabId();
        org.telegram.ui.ActionBar.y4 y4Var = dn0Var.n[1];
        y4Var.b = i7;
        y4Var.setVisibility(0);
        dn0Var.o0(true);
        dn0Var.w = z10;
        if (i7 == 0) {
            dn0Var.c.setSearchFieldHint(org.telegram.messenger.gd.N0(2131745565, null));
        } else {
            dn0Var.c.setSearchFieldHint(org.telegram.messenger.gd.N0(2131745568, null));
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public void c(float f10) {
        dn0 dn0Var = this.b;
        if (f10 != 1.0f || dn0Var.n[1].getVisibility() == 0) {
            if (dn0Var.w) {
                dn0Var.n[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                dn0Var.n[1].setTranslationX(r3[0].getMeasuredWidth() - (f10 * dn0Var.n[0].getMeasuredWidth()));
            } else {
                dn0Var.n[0].setTranslationX(r3.getMeasuredWidth() * f10);
                dn0Var.n[1].setTranslationX((f10 * r3[0].getMeasuredWidth()) - dn0Var.n[0].getMeasuredWidth());
            }
            if (f10 == 1.0f) {
                org.telegram.ui.ActionBar.y4[] y4VarArr = dn0Var.n;
                org.telegram.ui.ActionBar.y4 y4Var = y4VarArr[0];
                y4VarArr[0] = y4VarArr[1];
                y4VarArr[1] = y4Var;
                y4Var.setVisibility(8);
            }
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ void y() {
    }
}
