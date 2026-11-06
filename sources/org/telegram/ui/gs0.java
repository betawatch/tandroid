package org.telegram.ui;

import android.view.View;
import java.io.Serializable;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
