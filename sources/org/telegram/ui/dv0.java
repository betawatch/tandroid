package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class dv0 extends org.telegram.ui.Components.x50 {
    public final /* synthetic */ ev0 d;

    public dv0(ev0 ev0Var) {
        this.d = ev0Var;
    }

    @Override // org.telegram.ui.Components.co0
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.getString("AccDescrVideoQuality", R.string.AccDescrVideoQuality));
        if (this.d.s.Y7 > 0) {
            sb2.append(", ");
            sb2.append(this.d.s.X7 + 1);
            sb2.append(" / ");
            sb2.append(this.d.s.Y7);
        }
        sb2.append(", ");
        sb2.append(this.d.h);
        sb2.append(" – ");
        sb2.append(this.d.n);
        return sb2.toString();
    }

    @Override // org.telegram.ui.Components.x50
    public final int i() {
        return Math.max(0, this.d.s.Y7 - 1);
    }

    @Override // org.telegram.ui.Components.x50
    public final int j() {
        return this.d.s.X7;
    }

    @Override // org.telegram.ui.Components.x50
    public final void k(int i10) {
        int max;
        if (this.d.s.Y7 > 0 && (max = Math.max(0, Math.min(this.d.s.Y7 - 1, i10))) != this.d.s.X7) {
            ev0 ev0Var = this.d;
            ev0Var.r = ev0Var.s.X7;
            this.d.s.X7 = max;
            this.d.s.R0();
            this.d.invalidate();
            int i11 = this.d.s.X7;
            ev0 ev0Var2 = this.d;
            if (i11 != ev0Var2.r) {
                ev0Var2.s.p2(1);
            }
        }
    }
}
