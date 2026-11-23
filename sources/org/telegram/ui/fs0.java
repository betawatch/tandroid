package org.telegram.ui;

import android.view.View;
import java.io.Serializable;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class fs0 implements org.telegram.ui.ActionBar.q1, org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hs0 b;

    public /* synthetic */ fs0(hs0 hs0Var, int i7) {
        this.a = i7;
        this.b = hs0Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                this.b.d0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.u10
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        if (((org.telegram.ui.Components.n41) obj).d == 1) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            boolean z10 = !r8Var.e.h;
            hs0 hs0Var = this.b;
            hs0Var.n = z10;
            r8Var.setChecked(z10);
            hs0Var.d.g3.O(true);
            hs0Var.a0(true);
        }
    }
}
