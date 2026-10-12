package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class d80 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d80(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                m80 m80Var = (m80) this.b;
                if (m80Var.D()) {
                    m80Var.O();
                    break;
                }
                break;
            default:
                by0 by0Var = (by0) this.b;
                bi.f4 f4Var = by0Var.h;
                if (f4Var != null && f4Var.getLayout() != null) {
                    by0Var.F = f4Var.getLayout().getLineWidth(0);
                    break;
                }
                break;
        }
    }
}
