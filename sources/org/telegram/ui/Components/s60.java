package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s60 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s60(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                b70 b70Var = (b70) this.b;
                if (b70Var.D()) {
                    b70Var.O();
                    break;
                }
                break;
            default:
                nw0 nw0Var = (nw0) this.b;
                cg.q qVar = nw0Var.h;
                if (qVar != null && qVar.getLayout() != null) {
                    nw0Var.B = qVar.getLayout().getLineWidth(0);
                    break;
                }
                break;
        }
    }
}
