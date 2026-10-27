package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class jf0 extends fd0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Components.bx0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf0(lf0 lf0Var, Context context, int i10) {
        super(lf0Var.u0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f = lf0Var;
                super(lf0Var.u0, context);
                break;
            default:
                this.f = lf0Var;
                break;
        }
    }

    @Override // org.telegram.ui.fd0
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((lf0) this.f).k0;
            case 1:
                return ((lf0) this.f).k0;
            default:
                return ((ie0) this.f).M;
        }
    }

    @Override // org.telegram.ui.fd0
    public final boolean b() {
        jf0 jf0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    lf0 lf0Var = (lf0) this.f;
                    if (lf0Var.a0 <= 0 || lf0Var.T == null) {
                    }
                }
                break;
            case 1:
                lf0 lf0Var2 = (lf0) this.f;
                if (!isClickable() || getVisibility() != 0 || lf0Var2.f0 || (((jf0Var = lf0Var2.v) != null && jf0Var.getVisibility() != 8) || lf0Var2.k0)) {
                }
                break;
            default:
                if (getVisibility() == 0) {
                    ie0 ie0Var = (ie0) this.f;
                    if (ie0Var.P <= 0 || ie0Var.N == null) {
                    }
                }
                break;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf0(ie0 ie0Var, Context context) {
        super(ie0Var.a0, context);
        this.e = 2;
        this.f = ie0Var;
    }
}
