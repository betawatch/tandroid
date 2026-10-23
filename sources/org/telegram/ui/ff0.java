package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class ff0 extends org.telegram.ui.Components.voip.l2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Components.qw0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff0(hf0 hf0Var, Context context, int i10) {
        super(hf0Var.s0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f = hf0Var;
                super(hf0Var.s0, context);
                break;
            default:
                this.f = hf0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.voip.l2
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((hf0) this.f).i0;
            case 1:
                return ((hf0) this.f).i0;
            default:
                return ((de0) this.f).M;
        }
    }

    @Override // org.telegram.ui.Components.voip.l2
    public final boolean b() {
        ff0 ff0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    hf0 hf0Var = (hf0) this.f;
                    if (hf0Var.V <= 0 || hf0Var.R == null) {
                    }
                }
                break;
            case 1:
                hf0 hf0Var2 = (hf0) this.f;
                if (!isClickable() || getVisibility() != 0 || hf0Var2.d0 || (((ff0Var = hf0Var2.v) != null && ff0Var.getVisibility() != 8) || hf0Var2.i0)) {
                }
                break;
            default:
                if (getVisibility() == 0) {
                    de0 de0Var = (de0) this.f;
                    if (de0Var.P <= 0 || de0Var.N == null) {
                    }
                }
                break;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff0(de0 de0Var, Context context) {
        super(de0Var.a0, context);
        this.e = 2;
        this.f = de0Var;
    }
}
