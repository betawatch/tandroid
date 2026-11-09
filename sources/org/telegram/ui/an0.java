package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class an0 implements org.telegram.ui.Components.vk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn0 b;

    public /* synthetic */ an0(cn0 cn0Var, int i7) {
        this.a = i7;
        this.b = cn0Var;
    }

    @Override // org.telegram.ui.Components.vk0
    public void F0(float f10) {
        cn0 cn0Var = this.b;
        if (f10 != 1.0f || cn0Var.n[1].getVisibility() == 0) {
            if (cn0Var.w) {
                cn0Var.n[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                cn0Var.n[1].setTranslationX(r3[0].getMeasuredWidth() - (f10 * cn0Var.n[0].getMeasuredWidth()));
            } else {
                cn0Var.n[0].setTranslationX(r3.getMeasuredWidth() * f10);
                cn0Var.n[1].setTranslationX((f10 * r3[0].getMeasuredWidth()) - cn0Var.n[0].getMeasuredWidth());
            }
            if (f10 == 1.0f) {
                org.telegram.ui.ActionBar.x4[] x4VarArr = cn0Var.n;
                org.telegram.ui.ActionBar.x4 x4Var = x4VarArr[0];
                x4VarArr[0] = x4VarArr[1];
                x4VarArr[1] = x4Var;
                x4Var.setVisibility(8);
            }
        }
    }

    @Override // org.telegram.ui.Components.vk0
    public void b(int i7, boolean z9) {
        cn0 cn0Var = this.b;
        if (cn0Var.n[0].b == i7) {
            return;
        }
        cn0Var.e = i7 == cn0Var.h.getFirstTabId();
        org.telegram.ui.ActionBar.x4 x4Var = cn0Var.n[1];
        x4Var.b = i7;
        x4Var.setVisibility(0);
        cn0Var.o0(true);
        cn0Var.w = z9;
        if (i7 == 0) {
            cn0Var.c.setSearchFieldHint(org.telegram.messenger.id.M0(2131745761, null));
        } else {
            cn0Var.c.setSearchFieldHint(org.telegram.messenger.id.M0(2131745764, null));
        }
    }

    @Override // org.telegram.ui.Components.vk0
    public /* synthetic */ boolean m1(int i7, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.vk0
    public /* synthetic */ void c() {
    }
}
