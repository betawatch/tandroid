package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class ed0 extends db0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Components.wt0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed0(gd0 gd0Var, Context context, int i7) {
        super(gd0Var.u0, context);
        this.e = i7;
        switch (i7) {
            case 1:
                this.f = gd0Var;
                super(gd0Var.u0, context);
                break;
            default:
                this.f = gd0Var;
                break;
        }
    }

    @Override // org.telegram.ui.db0
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((gd0) this.f).k0;
            case 1:
                return ((gd0) this.f).k0;
            default:
                return ((ec0) this.f).M;
        }
    }

    @Override // org.telegram.ui.db0
    public final boolean b() {
        ed0 ed0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    gd0 gd0Var = (gd0) this.f;
                    if (gd0Var.a0 <= 0 || gd0Var.T == null) {
                    }
                }
                break;
            case 1:
                gd0 gd0Var2 = (gd0) this.f;
                if (!isClickable() || getVisibility() != 0 || gd0Var2.f0 || (((ed0Var = gd0Var2.w) != null && ed0Var.getVisibility() != 8) || gd0Var2.k0)) {
                }
                break;
            default:
                if (getVisibility() == 0) {
                    ec0 ec0Var = (ec0) this.f;
                    if (ec0Var.P <= 0 || ec0Var.N == null) {
                    }
                }
                break;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed0(ec0 ec0Var, Context context) {
        super(ec0Var.a0, context);
        this.e = 2;
        this.f = ec0Var;
    }
}
