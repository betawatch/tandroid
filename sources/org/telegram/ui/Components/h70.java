package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                fx0 fx0Var = (fx0) this.b;
                hg.q qVar = fx0Var.h;
                if (qVar != null && qVar.getLayout() != null) {
                    fx0Var.C = qVar.getLayout().getLineWidth(0);
                    break;
                }
                break;
        }
    }
}
