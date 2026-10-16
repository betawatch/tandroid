package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c80 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c80(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                l80 l80Var = (l80) this.b;
                if (l80Var.D()) {
                    l80Var.O();
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
