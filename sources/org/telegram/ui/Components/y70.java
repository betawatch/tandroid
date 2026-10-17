package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y70 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y70(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                i80 i80Var = (i80) this.b;
                if (i80Var.D()) {
                    i80Var.O();
                    break;
                }
                break;
            default:
                wx0 wx0Var = (wx0) this.b;
                ai.ud udVar = wx0Var.h;
                if (udVar != null && udVar.getLayout() != null) {
                    wx0Var.F = udVar.getLayout().getLineWidth(0);
                    break;
                }
                break;
        }
    }
}
