package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p70 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p70(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                y70 y70Var = (y70) this.b;
                if (y70Var.D()) {
                    y70Var.O();
                    break;
                }
                break;
            default:
                nx0 nx0Var = (nx0) this.b;
                ai.p4 p4Var = nx0Var.h;
                if (p4Var != null && p4Var.getLayout() != null) {
                    nx0Var.F = p4Var.getLayout().getLineWidth(0);
                    break;
                }
                break;
        }
    }
}
