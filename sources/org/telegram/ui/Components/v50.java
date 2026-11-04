package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v50 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v50(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.a) {
            case 0:
                f60 f60Var = (f60) this.b;
                if (f60Var.D()) {
                    f60Var.O();
                    break;
                }
                break;
            default:
                ev0 ev0Var = (ev0) this.b;
                ci.ec ecVar = ev0Var.h;
                if (ecVar != null && ecVar.getLayout() != null) {
                    ev0Var.G = ecVar.getLayout().getLineWidth(0);
                    break;
                }
                break;
        }
    }
}
