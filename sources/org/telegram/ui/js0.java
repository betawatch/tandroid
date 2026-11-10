package org.telegram.ui;

import android.view.View;
import java.io.Serializable;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class js0 implements org.telegram.ui.ActionBar.r1, org.telegram.messenger.a20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ks0 b;

    public /* synthetic */ js0(ks0 ks0Var, int i7) {
        this.a = i7;
        this.b = ks0Var;
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
            ks0 ks0Var = this.b;
            ks0Var.n = z9;
            r8Var.setChecked(z9);
            ks0Var.d.f3.O(true);
            ks0Var.a0(true);
        }
    }
}
