package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                qx0 qx0Var = (qx0) this.b;
                ai.p4 p4Var = qx0Var.h;
                if (p4Var != null && p4Var.getLayout() != null) {
                    qx0Var.F = p4Var.getLayout().getLineWidth(0);
                    break;
                }
                break;
        }
    }
}
