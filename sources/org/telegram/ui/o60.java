package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o60 implements org.telegram.ui.Components.e20, org.telegram.ui.ActionBar.c2, r0.o {
    public final /* synthetic */ int a;
    public final /* synthetic */ z60 b;

    public /* synthetic */ o60(z60 z60Var, int i10) {
        this.a = i10;
        this.b = z60Var;
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(m1Var, false).d;
        z60 z60Var = this.b;
        z60Var.j0 = i10;
        eg.t3 t3Var = z60Var.C;
        if (t3Var != null) {
            t3Var.setPadding(0, 0, 0, i10);
        }
        z60Var.j0();
        z60Var.h0();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.e20
    public void a(int i10) {
        this.b.b.a(Math.min(i10, r0.Z));
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
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
