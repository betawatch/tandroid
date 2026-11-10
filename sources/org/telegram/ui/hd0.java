package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class hd0 extends gb0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Components.xt0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd0(jd0 jd0Var, Context context, int i7) {
        super(jd0Var.u0, context);
        this.e = i7;
        switch (i7) {
            case 1:
                this.f = jd0Var;
                super(jd0Var.u0, context);
                break;
            default:
                this.f = jd0Var;
                break;
        }
    }

    @Override // org.telegram.ui.gb0
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((jd0) this.f).k0;
            case 1:
                return ((jd0) this.f).k0;
            default:
                return ((hc0) this.f).M;
        }
    }

    @Override // org.telegram.ui.gb0
    public final boolean b() {
        hd0 hd0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    jd0 jd0Var = (jd0) this.f;
                    if (jd0Var.a0 <= 0 || jd0Var.T == null) {
                    }
                }
                break;
            case 1:
                jd0 jd0Var2 = (jd0) this.f;
                if (!isClickable() || getVisibility() != 0 || jd0Var2.f0 || (((hd0Var = jd0Var2.w) != null && hd0Var.getVisibility() != 8) || jd0Var2.k0)) {
                }
                break;
            default:
                if (getVisibility() == 0) {
                    hc0 hc0Var = (hc0) this.f;
                    if (hc0Var.P <= 0 || hc0Var.N == null) {
                    }
                }
                break;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd0(hc0 hc0Var, Context context) {
        super(hc0Var.a0, context);
        this.e = 2;
        this.f = hc0Var;
    }
}
