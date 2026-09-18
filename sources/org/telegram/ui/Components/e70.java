package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e70 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e70(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                n70 n70Var = (n70) this.b;
                if (n70Var.D()) {
                    n70Var.O();
                    break;
                }
                break;
            default:
                ex0 ex0Var = (ex0) this.b;
                ai.p4 p4Var = ex0Var.h;
                if (p4Var != null && p4Var.getLayout() != null) {
                    ex0Var.F = p4Var.getLayout().getLineWidth(0);
                    break;
                }
                break;
        }
    }
}
