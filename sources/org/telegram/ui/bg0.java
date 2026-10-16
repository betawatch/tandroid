package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class bg0 extends org.telegram.ui.Components.voip.l2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Components.tw0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg0(dg0 dg0Var, Context context, int i10) {
        super(dg0Var.s0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f = dg0Var;
                super(dg0Var.s0, context);
                break;
            default:
                this.f = dg0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.voip.l2
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((dg0) this.f).i0;
            case 1:
                return ((dg0) this.f).i0;
            default:
                return ((bf0) this.f).M;
        }
    }

    @Override // org.telegram.ui.Components.voip.l2
    public final boolean b() {
        bg0 bg0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    dg0 dg0Var = (dg0) this.f;
                    if (dg0Var.V <= 0 || dg0Var.R == null) {
                    }
                }
                break;
            case 1:
                dg0 dg0Var2 = (dg0) this.f;
                if (!isClickable() || getVisibility() != 0 || dg0Var2.d0 || (((bg0Var = dg0Var2.v) != null && bg0Var.getVisibility() != 8) || dg0Var2.i0)) {
                }
                break;
            default:
                if (getVisibility() == 0) {
                    bf0 bf0Var = (bf0) this.f;
                    if (bf0Var.P <= 0 || bf0Var.N == null) {
                    }
                }
                break;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg0(bf0 bf0Var, Context context) {
        super(bf0Var.a0, context);
        this.e = 2;
        this.f = bf0Var;
    }
}
