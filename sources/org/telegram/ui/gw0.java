package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gw0 implements org.telegram.ui.ActionBar.b2, Utilities.Callback5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hw0 b;

    public /* synthetic */ gw0(hw0 hw0Var, int i10) {
        this.a = i10;
        this.b = hw0Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.Z();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        hw0 hw0Var = this.b;
        hw0Var.getClass();
        if (((org.telegram.ui.Components.u61) obj).d == 1) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            boolean z10 = !a9Var.e.h;
            hw0Var.n = z10;
            a9Var.setChecked(z10);
            hw0Var.d.g3.O(true);
            hw0Var.W(true);
        }
    }
}
