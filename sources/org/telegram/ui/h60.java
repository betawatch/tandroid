package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h60 implements org.telegram.ui.Components.n20, org.telegram.ui.ActionBar.b2, r0.n {
    public final /* synthetic */ int a;
    public final /* synthetic */ t60 b;

    public /* synthetic */ h60(t60 t60Var, int i10) {
        this.a = i10;
        this.b = t60Var;
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(k1Var, false).d;
        t60 t60Var = this.b;
        t60Var.m0 = i10;
        bi.t1 t1Var = t60Var.F;
        if (t1Var != null) {
            t1Var.setPadding(0, 0, 0, i10);
        }
        t60Var.k0();
        t60Var.i0();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.n20
    public void a(int i10) {
        this.b.b.a(Math.min(i10, r0.c0));
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 1:
                this.b.p0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }
}
