package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class s70 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s70(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                b80 b80Var = (b80) this.b;
                if (b80Var.D()) {
                    b80Var.O();
                    break;
                }
                break;
            default:
                zx0 zx0Var = (zx0) this.b;
                ai.p4 p4Var = zx0Var.h;
                if (p4Var != null && p4Var.getLayout() != null) {
                    zx0Var.F = p4Var.getLayout().getLineWidth(0);
                    break;
                }
                break;
        }
    }
}
