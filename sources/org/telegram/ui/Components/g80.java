package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g80 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g80(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                p80 p80Var = (p80) this.b;
                if (p80Var.D()) {
                    p80Var.O();
                    break;
                }
                break;
            default:
                fy0 fy0Var = (fy0) this.b;
                ai.q4 q4Var = fy0Var.h;
                if (q4Var != null && q4Var.getLayout() != null) {
                    fy0Var.F = q4Var.getLayout().getLineWidth(0);
                    break;
                }
                break;
        }
    }
}
