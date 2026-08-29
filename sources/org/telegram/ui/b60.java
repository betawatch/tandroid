package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b60 implements org.telegram.ui.Components.y10, org.telegram.ui.ActionBar.b2, r0.o {
    public final /* synthetic */ int a;
    public final /* synthetic */ m60 b;

    public /* synthetic */ b60(m60 m60Var, int i10) {
        this.a = i10;
        this.b = m60Var;
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(m1Var, false).d;
        m60 m60Var = this.b;
        m60Var.i0 = i10;
        bg.z3 z3Var = m60Var.B;
        if (z3Var != null) {
            z3Var.setPadding(0, 0, 0, i10);
        }
        m60Var.j0();
        m60Var.h0();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.y10
    public void a(int i10) {
        this.b.b.a(Math.min(i10, r0.Y));
    }

    @Override // org.telegram.ui.ActionBar.b2
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
