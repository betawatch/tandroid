package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                kw0 kw0Var = (kw0) this.b;
                ag.j3 j3Var = kw0Var.h;
                if (j3Var != null && j3Var.getLayout() != null) {
                    kw0Var.F = j3Var.getLayout().getLineWidth(0);
                    break;
                }
                break;
        }
    }
}
