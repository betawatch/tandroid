package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class hf0 extends org.telegram.ui.Components.voip.l2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Components.ow0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf0(jf0 jf0Var, Context context, int i10) {
        super(jf0Var.s0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f = jf0Var;
                super(jf0Var.s0, context);
                break;
            default:
                this.f = jf0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.voip.l2
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((jf0) this.f).i0;
            case 1:
                return ((jf0) this.f).i0;
            default:
                return ((fe0) this.f).M;
        }
    }

    @Override // org.telegram.ui.Components.voip.l2
    public final boolean b() {
        hf0 hf0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    jf0 jf0Var = (jf0) this.f;
                    if (jf0Var.V <= 0 || jf0Var.R == null) {
                    }
                }
                break;
            case 1:
                jf0 jf0Var2 = (jf0) this.f;
                if (!isClickable() || getVisibility() != 0 || jf0Var2.d0 || (((hf0Var = jf0Var2.v) != null && hf0Var.getVisibility() != 8) || jf0Var2.i0)) {
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
    public hf0(fe0 fe0Var, Context context) {
        super(fe0Var.a0, context);
        this.e = 2;
        this.f = fe0Var;
    }
}
