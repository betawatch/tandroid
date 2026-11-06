package org.telegram.ui;

import android.view.View;
import java.io.Serializable;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fs0 implements org.telegram.ui.ActionBar.r1, org.telegram.messenger.a20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gs0 b;

    public /* synthetic */ fs0(gs0 gs0Var, int i7) {
        this.a = i7;
        this.b = gs0Var;
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
        if (((org.telegram.ui.Components.r31) obj).d == 1) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            boolean z9 = !r8Var.e.h;
            gs0 gs0Var = this.b;
            gs0Var.n = z9;
            r8Var.setChecked(z9);
            gs0Var.d.f3.O(true);
            gs0Var.a0(true);
        }
    }
}
