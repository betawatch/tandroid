package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class ed0 extends eb0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Components.iu0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed0(gd0 gd0Var, Context context, int i7) {
        super(gd0Var.v0, context);
        this.e = i7;
        switch (i7) {
            case 1:
                this.f = gd0Var;
                super(gd0Var.v0, context);
                break;
            default:
                this.f = gd0Var;
                break;
        }
    }

    @Override // org.telegram.ui.eb0
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((gd0) this.f).l0;
            case 1:
                return ((gd0) this.f).l0;
            default:
                return ((ec0) this.f).N;
        }
    }

    @Override // org.telegram.ui.eb0
    public final boolean b() {
        ed0 ed0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    gd0 gd0Var = (gd0) this.f;
                    if (gd0Var.b0 <= 0 || gd0Var.U == null) {
                    }
                }
                break;
            case 1:
                gd0 gd0Var2 = (gd0) this.f;
                if (!isClickable() || getVisibility() != 0 || gd0Var2.g0 || (((ed0Var = gd0Var2.w) != null && ed0Var.getVisibility() != 8) || gd0Var2.l0)) {
                }
                break;
            default:
                if (getVisibility() == 0) {
                    ec0 ec0Var = (ec0) this.f;
                    if (ec0Var.Q <= 0 || ec0Var.O == null) {
                    }
                }
                break;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed0(ec0 ec0Var, Context context) {
        super(ec0Var.b0, context);
        this.e = 2;
        this.f = ec0Var;
    }
}
