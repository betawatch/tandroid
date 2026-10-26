package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b80 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b80(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                k80 k80Var = (k80) this.b;
                if (k80Var.D()) {
                    k80Var.O();
                    break;
                }
                break;
            default:
                jy0 jy0Var = (jy0) this.b;
                bi.md mdVar = jy0Var.h;
                if (mdVar != null && mdVar.getLayout() != null) {
                    jy0Var.F = mdVar.getLayout().getLineWidth(0);
                    break;
                }
                break;
        }
    }
}
