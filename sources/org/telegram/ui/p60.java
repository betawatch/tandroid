package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p60 implements org.telegram.ui.Components.e20, org.telegram.ui.ActionBar.c2, r0.o {
    public final /* synthetic */ int a;
    public final /* synthetic */ a70 b;

    public /* synthetic */ p60(a70 a70Var, int i10) {
        this.a = i10;
        this.b = a70Var;
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(m1Var, false).d;
        a70 a70Var = this.b;
        a70Var.j0 = i10;
        dg.v3 v3Var = a70Var.C;
        if (v3Var != null) {
            v3Var.setPadding(0, 0, 0, i10);
        }
        a70Var.j0();
        a70Var.h0();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.e20
    public void a(int i10) {
        this.b.b.a(Math.min(i10, r0.Z));
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
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
