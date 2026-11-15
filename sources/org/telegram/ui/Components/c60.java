package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class c60 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c60(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.a) {
            case 0:
                m60 m60Var = (m60) this.b;
                if (m60Var.D()) {
                    m60Var.O();
                    break;
                }
                break;
            default:
                hv0 hv0Var = (hv0) this.b;
                di.tb tbVar = hv0Var.h;
                if (tbVar != null && tbVar.getLayout() != null) {
                    hv0Var.G = tbVar.getLayout().getLineWidth(0);
                    break;
                }
                break;
        }
    }
}
