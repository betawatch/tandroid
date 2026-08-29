package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a70 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a70(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                j70 j70Var = (j70) this.b;
                if (j70Var.D()) {
                    j70Var.O();
                    break;
                }
                break;
            default:
                vw0 vw0Var = (vw0) this.b;
                eg.r rVar = vw0Var.h;
                if (rVar != null && rVar.getLayout() != null) {
                    vw0Var.B = rVar.getLayout().getLineWidth(0);
                    break;
                }
                break;
        }
    }
}
