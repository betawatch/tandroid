package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r70 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r70(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                a80 a80Var = (a80) this.b;
                if (a80Var.D()) {
                    a80Var.O();
                    break;
                }
                break;
            default:
                px0 px0Var = (px0) this.b;
                ai.p4 p4Var = px0Var.h;
                if (p4Var != null && p4Var.getLayout() != null) {
                    px0Var.F = p4Var.getLayout().getLineWidth(0);
                    break;
                }
                break;
        }
    }
}
