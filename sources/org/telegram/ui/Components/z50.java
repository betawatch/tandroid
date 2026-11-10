package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                gv0 gv0Var = (gv0) this.b;
                bi.md mdVar = gv0Var.h;
                if (mdVar != null && mdVar.getLayout() != null) {
                    gv0Var.F = mdVar.getLayout().getLineWidth(0);
                    break;
                }
                break;
        }
    }
}
