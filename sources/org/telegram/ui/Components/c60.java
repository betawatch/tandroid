package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
                di.ub ubVar = hv0Var.h;
                if (ubVar != null && ubVar.getLayout() != null) {
                    hv0Var.G = ubVar.getLayout().getLineWidth(0);
                    break;
                }
                break;
        }
    }
}
