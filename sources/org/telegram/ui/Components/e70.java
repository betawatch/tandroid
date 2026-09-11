package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class e70 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e70(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                n70 n70Var = (n70) this.b;
                if (n70Var.D()) {
                    n70Var.O();
                    break;
                }
                break;
            default:
                cx0 cx0Var = (cx0) this.b;
                bi.c4 c4Var = cx0Var.h;
                if (c4Var != null && c4Var.getLayout() != null) {
                    cx0Var.F = c4Var.getLayout().getLineWidth(0);
                    break;
                }
                break;
        }
    }
}
