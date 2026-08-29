package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class gf0 extends org.telegram.ui.Components.voip.p2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Components.mv0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf0(if0 if0Var, Context context, int i10) {
        super(if0Var.o0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f = if0Var;
                super(if0Var.o0, context);
                break;
            default:
                this.f = if0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.voip.p2
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((if0) this.f).e0;
            case 1:
                return ((if0) this.f).e0;
            default:
                return ((fe0) this.f).I;
        }
    }

    @Override // org.telegram.ui.Components.voip.p2
    public final boolean b() {
        gf0 gf0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    if0 if0Var = (if0) this.f;
                    if (if0Var.R <= 0 || if0Var.N == null) {
                    }
                }
                break;
            case 1:
                if0 if0Var2 = (if0) this.f;
                if (!isClickable() || getVisibility() != 0 || if0Var2.W || (((gf0Var = if0Var2.v) != null && gf0Var.getVisibility() != 8) || if0Var2.e0)) {
                }
                break;
            default:
                if (getVisibility() == 0) {
                    fe0 fe0Var = (fe0) this.f;
                    if (fe0Var.L <= 0 || fe0Var.J == null) {
                    }
                }
                break;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf0(fe0 fe0Var, Context context) {
        super(fe0Var.T, context);
        this.e = 2;
        this.f = fe0Var;
    }
}
