package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o60 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o60(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.a) {
            case 0:
                a70 a70Var = (a70) this.b;
                if (a70Var.E()) {
                    a70Var.P();
                    break;
                }
                break;
            default:
                sv0 sv0Var = (sv0) this.b;
                di.xb xbVar = sv0Var.h;
                if (xbVar != null && xbVar.getLayout() != null) {
                    sv0Var.G = xbVar.getLayout().getLineWidth(0);
                    break;
                }
                break;
        }
    }
}
