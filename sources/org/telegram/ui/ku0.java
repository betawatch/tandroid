package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ku0 extends org.telegram.ui.Components.s60 {
    public final /* synthetic */ lu0 d;

    public ku0(lu0 lu0Var) {
        this.d = lu0Var;
    }

    @Override // org.telegram.ui.Components.zo0
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.getString("AccDescrVideoQuality", R.string.AccDescrVideoQuality));
        if (this.d.s.Z7 > 0) {
            sb2.append(", ");
            sb2.append(this.d.s.Y7 + 1);
            sb2.append(" / ");
            sb2.append(this.d.s.Z7);
        }
        sb2.append(", ");
        sb2.append(this.d.h);
        sb2.append(" – ");
        sb2.append(this.d.n);
        return sb2.toString();
    }

    @Override // org.telegram.ui.Components.s60
    public final int i() {
        return Math.max(0, this.d.s.Z7 - 1);
    }

    @Override // org.telegram.ui.Components.s60
    public final int j() {
        return this.d.s.Y7;
    }

    @Override // org.telegram.ui.Components.s60
    public final void k(int i10) {
        int max;
        if (this.d.s.Z7 > 0 && (max = Math.max(0, Math.min(this.d.s.Z7 - 1, i10))) != this.d.s.Y7) {
            lu0 lu0Var = this.d;
            lu0Var.r = lu0Var.s.Y7;
            this.d.s.Y7 = max;
            this.d.s.S0();
            this.d.invalidate();
            int i11 = this.d.s.Y7;
            lu0 lu0Var2 = this.d;
            if (i11 != lu0Var2.r) {
                lu0Var2.s.p2(1);
            }
        }
    }
}
