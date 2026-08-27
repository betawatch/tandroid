package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d60 implements org.telegram.ui.Components.q10, org.telegram.ui.ActionBar.a2, r0.o {
    public final /* synthetic */ int a;
    public final /* synthetic */ o60 b;

    public /* synthetic */ d60(o60 o60Var, int i10) {
        this.a = i10;
        this.b = o60Var;
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(m1Var, false).d;
        o60 o60Var = this.b;
        o60Var.i0 = i10;
        hh.h1 h1Var = o60Var.B;
        if (h1Var != null) {
            h1Var.setPadding(0, 0, 0, i10);
        }
        o60Var.j0();
        o60Var.h0();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.q10
    public void a(int i10) {
        this.b.b.a(Math.min(i10, r0.Y));
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                this.b.o0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }
}
