package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
                xx0 xx0Var = (xx0) this.b;
                ai.vd vdVar = xx0Var.h;
                if (vdVar != null && vdVar.getLayout() != null) {
                    xx0Var.F = vdVar.getLayout().getLineWidth(0);
                    break;
                }
                break;
        }
    }
}
