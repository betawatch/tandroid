package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class l60 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l60(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.a) {
            case 0:
                x60 x60Var = (x60) this.b;
                if (x60Var.E()) {
                    x60Var.P();
                    break;
                }
                break;
            default:
                rv0 rv0Var = (rv0) this.b;
                di.xb xbVar = rv0Var.h;
                if (xbVar != null && xbVar.getLayout() != null) {
                    rv0Var.G = xbVar.getLayout().getLineWidth(0);
                    break;
                }
                break;
        }
    }
}
