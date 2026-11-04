package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class bd0 extends za0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Components.vt0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd0(dd0 dd0Var, Context context, int i3) {
        super(dd0Var.v0, context);
        this.e = i3;
        switch (i3) {
            case 1:
                this.f = dd0Var;
                super(dd0Var.v0, context);
                break;
            default:
                this.f = dd0Var;
                break;
        }
    }

    @Override // org.telegram.ui.za0
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((dd0) this.f).l0;
            case 1:
                return ((dd0) this.f).l0;
            default:
                return ((cc0) this.f).N;
        }
    }

    @Override // org.telegram.ui.za0
    public final boolean b() {
        bd0 bd0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    dd0 dd0Var = (dd0) this.f;
                    if (dd0Var.b0 <= 0 || dd0Var.U == null) {
                    }
                }
                break;
            case 1:
                dd0 dd0Var2 = (dd0) this.f;
                if (!isClickable() || getVisibility() != 0 || dd0Var2.g0 || (((bd0Var = dd0Var2.w) != null && bd0Var.getVisibility() != 8) || dd0Var2.l0)) {
                }
                break;
            default:
                if (getVisibility() == 0) {
                    cc0 cc0Var = (cc0) this.f;
                    if (cc0Var.Q <= 0 || cc0Var.O == null) {
                    }
                }
                break;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd0(cc0 cc0Var, Context context) {
        super(cc0Var.b0, context);
        this.e = 2;
        this.f = cc0Var;
    }
}
