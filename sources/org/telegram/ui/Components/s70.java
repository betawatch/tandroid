package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
