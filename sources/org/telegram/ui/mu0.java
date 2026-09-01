package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class mu0 extends org.telegram.ui.Components.a60 {
    public final /* synthetic */ nu0 d;

    public mu0(nu0 nu0Var) {
        this.d = nu0Var;
    }

    @Override // org.telegram.ui.Components.io0
    public final CharSequence d() {
        StringBuilder sb = new StringBuilder();
        sb.append(LocaleController.getString("AccDescrVideoQuality", R.string.AccDescrVideoQuality));
        if (this.d.s.V7 > 0) {
            sb.append(", ");
            sb.append(this.d.s.U7 + 1);
            sb.append(" / ");
            sb.append(this.d.s.V7);
        }
        sb.append(", ");
        sb.append(this.d.h);
        sb.append(" – ");
        sb.append(this.d.n);
        return sb.toString();
    }

    @Override // org.telegram.ui.Components.a60
    public final int i() {
        return Math.max(0, this.d.s.V7 - 1);
    }

    @Override // org.telegram.ui.Components.a60
    public final int j() {
        return this.d.s.U7;
    }

    @Override // org.telegram.ui.Components.a60
    public final void k(int i10) {
        int max;
        if (this.d.s.V7 > 0 && (max = Math.max(0, Math.min(this.d.s.V7 - 1, i10))) != this.d.s.U7) {
            nu0 nu0Var = this.d;
            nu0Var.r = nu0Var.s.U7;
            this.d.s.U7 = max;
            this.d.s.R0();
            this.d.invalidate();
            int i11 = this.d.s.U7;
            nu0 nu0Var2 = this.d;
            if (i11 != nu0Var2.r) {
                nu0Var2.s.p2(1);
            }
        }
    }
}
