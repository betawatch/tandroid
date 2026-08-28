package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ov0 implements org.telegram.ui.ActionBar.b2, Utilities.Callback5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pv0 b;

    public /* synthetic */ ov0(pv0 pv0Var, int i9) {
        this.a = i9;
        this.b = pv0Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 0:
                this.b.X();
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
        pv0 pv0Var = this.b;
        pv0Var.getClass();
        if (((org.telegram.ui.Components.l41) obj).d == 1) {
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            boolean z10 = !t8Var.e.h;
            pv0Var.r = z10;
            t8Var.setChecked(z10);
            pv0Var.d.U2.N(true);
            pv0Var.U(true);
        }
    }
}
