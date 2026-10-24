package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class e60 implements org.telegram.ui.Components.l20, org.telegram.ui.ActionBar.z1, r0.n {
    public final /* synthetic */ int a;
    public final /* synthetic */ p60 b;

    public /* synthetic */ e60(p60 p60Var, int i10) {
        this.a = i10;
        this.b = p60Var;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(k1Var, false).d;
        p60 p60Var = this.b;
        p60Var.m0 = i10;
        ai.w1 w1Var = p60Var.F;
        if (w1Var != null) {
            w1Var.setPadding(0, 0, 0, i10);
        }
        p60Var.j0();
        p60Var.h0();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.l20
    public void a(int i10) {
        this.b.b.a(Math.min(i10, r0.c0));
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
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
