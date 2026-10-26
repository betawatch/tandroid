package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class hf0 extends dd0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Components.ax0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf0(jf0 jf0Var, Context context, int i10) {
        super(jf0Var.u0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f = jf0Var;
                super(jf0Var.u0, context);
                break;
            default:
                this.f = jf0Var;
                break;
        }
    }

    @Override // org.telegram.ui.dd0
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((jf0) this.f).k0;
            case 1:
                return ((jf0) this.f).k0;
            default:
                return ((ge0) this.f).M;
        }
    }

    @Override // org.telegram.ui.dd0
    public final boolean b() {
        hf0 hf0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    jf0 jf0Var = (jf0) this.f;
                    if (jf0Var.a0 <= 0 || jf0Var.T == null) {
                    }
                }
                break;
            case 1:
                jf0 jf0Var2 = (jf0) this.f;
                if (!isClickable() || getVisibility() != 0 || jf0Var2.f0 || (((hf0Var = jf0Var2.v) != null && hf0Var.getVisibility() != 8) || jf0Var2.k0)) {
                }
                break;
            default:
                if (getVisibility() == 0) {
                    ge0 ge0Var = (ge0) this.f;
                    if (ge0Var.P <= 0 || ge0Var.N == null) {
                    }
                }
                break;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf0(ge0 ge0Var, Context context) {
        super(ge0Var.a0, context);
        this.e = 2;
        this.f = ge0Var;
    }
}
