package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y70 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y70(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                i80 i80Var = (i80) this.b;
                if (i80Var.D()) {
                    i80Var.O();
                    break;
                }
                break;
            default:
                yx0 yx0Var = (yx0) this.b;
                ai.vd vdVar = yx0Var.h;
                if (vdVar != null && vdVar.getLayout() != null) {
                    yx0Var.F = vdVar.getLayout().getLineWidth(0);
                    break;
                }
                break;
        }
    }
}
