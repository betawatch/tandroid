package org.telegram.ui;

import android.view.View;
import java.io.Serializable;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gs0 implements org.telegram.ui.ActionBar.r1, org.telegram.messenger.a20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hs0 b;

    public /* synthetic */ gs0(hs0 hs0Var, int i7) {
        this.a = i7;
        this.b = hs0Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                this.b.d0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        if (((org.telegram.ui.Components.x31) obj).d == 1) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            boolean z9 = !r8Var.e.h;
            hs0 hs0Var = this.b;
            hs0Var.n = z9;
            r8Var.setChecked(z9);
            hs0Var.d.f3.O(true);
            hs0Var.a0(true);
        }
    }
}
