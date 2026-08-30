package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class pf0 extends org.telegram.ui.Components.voip.n2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Components.vv0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf0(rf0 rf0Var, Context context, int i10) {
        super(rf0Var.p0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f = rf0Var;
                super(rf0Var.p0, context);
                break;
            default:
                this.f = rf0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.voip.n2
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((rf0) this.f).f0;
            case 1:
                return ((rf0) this.f).f0;
            default:
                return ((pe0) this.f).J;
        }
    }

    @Override // org.telegram.ui.Components.voip.n2
    public final boolean b() {
        pf0 pf0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    rf0 rf0Var = (rf0) this.f;
                    if (rf0Var.S <= 0 || rf0Var.O == null) {
                    }
                }
                break;
            case 1:
                rf0 rf0Var2 = (rf0) this.f;
                if (!isClickable() || getVisibility() != 0 || rf0Var2.a0 || (((pf0Var = rf0Var2.v) != null && pf0Var.getVisibility() != 8) || rf0Var2.f0)) {
                }
                break;
            default:
                if (getVisibility() == 0) {
                    pe0 pe0Var = (pe0) this.f;
                    if (pe0Var.M <= 0 || pe0Var.K == null) {
                    }
                }
                break;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf0(pe0 pe0Var, Context context) {
        super(pe0Var.U, context);
        this.e = 2;
        this.f = pe0Var;
    }
}
