package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h70 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h70(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                q70 q70Var = (q70) this.b;
                if (q70Var.D()) {
                    q70Var.O();
                    break;
                }
                break;
            default:
                gx0 gx0Var = (gx0) this.b;
                hg.q qVar = gx0Var.h;
                if (qVar != null && qVar.getLayout() != null) {
                    gx0Var.C = qVar.getLayout().getLineWidth(0);
                    break;
                }
                break;
        }
    }
}
