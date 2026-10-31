package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o60 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o60(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                z60 z60Var = (z60) this.b;
                if (z60Var.D()) {
                    z60Var.O();
                    break;
                }
                break;
            default:
                jw0 jw0Var = (jw0) this.b;
                ag.j3 j3Var = jw0Var.h;
                if (j3Var != null && j3Var.getLayout() != null) {
                    jw0Var.F = j3Var.getLayout().getLineWidth(0);
                    break;
                }
                break;
        }
    }
}
