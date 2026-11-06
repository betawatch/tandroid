package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z50 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z50(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.a) {
            case 0:
                k60 k60Var = (k60) this.b;
                if (k60Var.D()) {
                    k60Var.O();
                    break;
                }
                break;
            default:
                fv0 fv0Var = (fv0) this.b;
                bi.md mdVar = fv0Var.h;
                if (mdVar != null && mdVar.getLayout() != null) {
                    fv0Var.F = mdVar.getLayout().getLineWidth(0);
                    break;
                }
                break;
        }
    }
}
