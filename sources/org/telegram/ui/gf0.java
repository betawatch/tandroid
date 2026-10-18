package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class gf0 extends org.telegram.ui.Components.voip.l2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Components.ow0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf0(if0 if0Var, Context context, int i10) {
        super(if0Var.s0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f = if0Var;
                super(if0Var.s0, context);
                break;
            default:
                this.f = if0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.voip.l2
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((if0) this.f).i0;
            case 1:
                return ((if0) this.f).i0;
            default:
                return ((fe0) this.f).M;
        }
    }

    @Override // org.telegram.ui.Components.voip.l2
    public final boolean b() {
        gf0 gf0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    if0 if0Var = (if0) this.f;
                    if (if0Var.V <= 0 || if0Var.R == null) {
                    }
                }
                break;
            case 1:
                if0 if0Var2 = (if0) this.f;
                if (!isClickable() || getVisibility() != 0 || if0Var2.d0 || (((gf0Var = if0Var2.v) != null && gf0Var.getVisibility() != 8) || if0Var2.i0)) {
                }
                break;
            default:
                if (getVisibility() == 0) {
                    fe0 fe0Var = (fe0) this.f;
                    if (fe0Var.P <= 0 || fe0Var.N == null) {
                    }
                }
                break;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf0(fe0 fe0Var, Context context) {
        super(fe0Var.a0, context);
        this.e = 2;
        this.f = fe0Var;
    }
}
