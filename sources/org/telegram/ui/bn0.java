package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class bn0 implements org.telegram.ui.Components.uk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dn0 b;

    public /* synthetic */ bn0(dn0 dn0Var, int i7) {
        this.a = i7;
        this.b = dn0Var;
    }

    @Override // org.telegram.ui.Components.uk0
    public void F0(float f10) {
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

    @Override // org.telegram.ui.Components.uk0
    public void b(int i7, boolean z9) {
        dn0 dn0Var = this.b;
        if (dn0Var.n[0].b == i7) {
            return;
        }
        dn0Var.e = i7 == dn0Var.h.getFirstTabId();
        org.telegram.ui.ActionBar.y4 y4Var = dn0Var.n[1];
        y4Var.b = i7;
        y4Var.setVisibility(0);
        dn0Var.o0(true);
        dn0Var.w = z9;
        if (i7 == 0) {
            dn0Var.c.setSearchFieldHint(org.telegram.messenger.id.M0(2131745761, null));
        } else {
            dn0Var.c.setSearchFieldHint(org.telegram.messenger.id.M0(2131745764, null));
        }
    }

    @Override // org.telegram.ui.Components.uk0
    public /* synthetic */ boolean m1(int i7, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.uk0
    public /* synthetic */ void c() {
    }
}
