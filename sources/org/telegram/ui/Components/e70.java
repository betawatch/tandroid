package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e70 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e70(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                n70 n70Var = (n70) this.b;
                if (n70Var.D()) {
                    n70Var.O();
                    break;
                }
                break;
            default:
                dx0 dx0Var = (dx0) this.b;
                ai.p4 p4Var = dx0Var.h;
                if (p4Var != null && p4Var.getLayout() != null) {
                    dx0Var.F = p4Var.getLayout().getLineWidth(0);
                    break;
                }
                break;
        }
    }
}
