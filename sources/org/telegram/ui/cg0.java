package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class cg0 extends org.telegram.ui.Components.voip.l2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Components.tw0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg0(eg0 eg0Var, Context context, int i10) {
        super(eg0Var.s0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f = eg0Var;
                super(eg0Var.s0, context);
                break;
            default:
                this.f = eg0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.voip.l2
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((eg0) this.f).i0;
            case 1:
                return ((eg0) this.f).i0;
            default:
                return ((cf0) this.f).M;
        }
    }

    @Override // org.telegram.ui.Components.voip.l2
    public final boolean b() {
        cg0 cg0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    eg0 eg0Var = (eg0) this.f;
                    if (eg0Var.V <= 0 || eg0Var.R == null) {
                    }
                }
                break;
            case 1:
                eg0 eg0Var2 = (eg0) this.f;
                if (!isClickable() || getVisibility() != 0 || eg0Var2.d0 || (((cg0Var = eg0Var2.v) != null && cg0Var.getVisibility() != 8) || eg0Var2.i0)) {
                }
                break;
            default:
                if (getVisibility() == 0) {
                    cf0 cf0Var = (cf0) this.f;
                    if (cf0Var.P <= 0 || cf0Var.N == null) {
                    }
                }
                break;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg0(cf0 cf0Var, Context context) {
        super(cf0Var.a0, context);
        this.e = 2;
        this.f = cf0Var;
    }
}
