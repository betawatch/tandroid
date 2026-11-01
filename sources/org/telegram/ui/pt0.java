package org.telegram.ui;

import android.view.View;
import java.io.Serializable;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pt0 implements org.telegram.ui.ActionBar.u1, org.telegram.messenger.p20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qt0 b;

    public /* synthetic */ pt0(qt0 qt0Var, int i10) {
        this.a = i10;
        this.b = qt0Var;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.d0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.p20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        if (((org.telegram.ui.Components.b51) obj).d == 1) {
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            boolean z10 = !t8Var.e.h;
            qt0 qt0Var = this.b;
            qt0Var.n = z10;
            t8Var.setChecked(z10);
            qt0Var.d.f3.O(true);
            qt0Var.a0(true);
        }
    }
}
