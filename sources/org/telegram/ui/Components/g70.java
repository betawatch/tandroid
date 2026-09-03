package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g70 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g70(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                p70 p70Var = (p70) this.b;
                if (p70Var.D()) {
                    p70Var.O();
                    break;
                }
                break;
            default:
                fx0 fx0Var = (fx0) this.b;
                gg.q qVar = fx0Var.h;
                if (qVar != null && qVar.getLayout() != null) {
                    fx0Var.C = qVar.getLayout().getLineWidth(0);
                    break;
                }
                break;
        }
    }
}
