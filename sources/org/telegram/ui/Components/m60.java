package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class m60 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m60(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.a) {
            case 0:
                y60 y60Var = (y60) this.b;
                if (y60Var.E()) {
                    y60Var.P();
                    break;
                }
                break;
            default:
                pv0 pv0Var = (pv0) this.b;
                di.xb xbVar = pv0Var.h;
                if (xbVar != null && xbVar.getLayout() != null) {
                    pv0Var.G = xbVar.getLayout().getLineWidth(0);
                    break;
                }
                break;
        }
    }
}
