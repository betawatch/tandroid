package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c80 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c80(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                l80 l80Var = (l80) this.b;
                if (l80Var.D()) {
                    l80Var.O();
                    break;
                }
                break;
            default:
                ky0 ky0Var = (ky0) this.b;
                bi.md mdVar = ky0Var.h;
                if (mdVar != null && mdVar.getLayout() != null) {
                    ky0Var.F = mdVar.getLayout().getLineWidth(0);
                    break;
                }
                break;
        }
    }
}
