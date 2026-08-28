package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class hf0 extends org.telegram.ui.Components.voip.m2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Components.cv0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf0(jf0 jf0Var, Context context, int i9) {
        super(jf0Var.o0, context);
        this.e = i9;
        switch (i9) {
            case 1:
                this.f = jf0Var;
                super(jf0Var.o0, context);
                break;
            default:
                this.f = jf0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.voip.m2
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((jf0) this.f).e0;
            case 1:
                return ((jf0) this.f).e0;
            default:
                return ((ge0) this.f).I;
        }
    }

    @Override // org.telegram.ui.Components.voip.m2
    public final boolean b() {
        hf0 hf0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    jf0 jf0Var = (jf0) this.f;
                    if (jf0Var.R <= 0 || jf0Var.N == null) {
                    }
                }
                break;
            case 1:
                jf0 jf0Var2 = (jf0) this.f;
                if (!isClickable() || getVisibility() != 0 || jf0Var2.W || (((hf0Var = jf0Var2.v) != null && hf0Var.getVisibility() != 8) || jf0Var2.e0)) {
                }
                break;
            default:
                if (getVisibility() == 0) {
                    ge0 ge0Var = (ge0) this.f;
                    if (ge0Var.L <= 0 || ge0Var.J == null) {
                    }
                }
                break;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf0(ge0 ge0Var, Context context) {
        super(ge0Var.T, context);
        this.e = 2;
        this.f = ge0Var;
    }
}
