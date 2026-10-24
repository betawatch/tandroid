package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class a80 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a80(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                j80 j80Var = (j80) this.b;
                if (j80Var.D()) {
                    j80Var.O();
                    break;
                }
                break;
            default:
                by0 by0Var = (by0) this.b;
                ai.wd wdVar = by0Var.h;
                if (wdVar != null && wdVar.getLayout() != null) {
                    by0Var.F = wdVar.getLayout().getLineWidth(0);
                    break;
                }
                break;
        }
    }
}
