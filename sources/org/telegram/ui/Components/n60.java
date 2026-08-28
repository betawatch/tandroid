package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n60 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n60(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.a) {
            case 0:
                x60 x60Var = (x60) this.b;
                if (x60Var.D()) {
                    x60Var.O();
                    break;
                }
                break;
            default:
                lw0 lw0Var = (lw0) this.b;
                bg.t tVar = lw0Var.h;
                if (tVar != null && tVar.getLayout() != null) {
                    lw0Var.B = tVar.getLayout().getLineWidth(0);
                    break;
                }
                break;
        }
    }
}
