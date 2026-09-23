package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class f70 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f70(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                o70 o70Var = (o70) this.b;
                if (o70Var.D()) {
                    o70Var.O();
                    break;
                }
                break;
            default:
                cx0 cx0Var = (cx0) this.b;
                ai.p4 p4Var = cx0Var.h;
                if (p4Var != null && p4Var.getLayout() != null) {
                    cx0Var.F = p4Var.getLayout().getLineWidth(0);
                    break;
                }
                break;
        }
    }
}
