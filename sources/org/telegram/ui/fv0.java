package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class fv0 extends org.telegram.ui.Components.g60 {
    public final /* synthetic */ gv0 d;

    public fv0(gv0 gv0Var) {
        this.d = gv0Var;
    }

    @Override // org.telegram.ui.Components.lo0
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

    @Override // org.telegram.ui.Components.g60
    public final int i() {
        return Math.max(0, this.d.s.Y7 - 1);
    }

    @Override // org.telegram.ui.Components.g60
    public final int j() {
        return this.d.s.X7;
    }

    @Override // org.telegram.ui.Components.g60
    public final void k(int i10) {
        int max;
        if (this.d.s.Y7 > 0 && (max = Math.max(0, Math.min(this.d.s.Y7 - 1, i10))) != this.d.s.X7) {
            gv0 gv0Var = this.d;
            gv0Var.r = gv0Var.s.X7;
            this.d.s.X7 = max;
            this.d.s.R0();
            this.d.invalidate();
            int i11 = this.d.s.X7;
            gv0 gv0Var2 = this.d;
            if (i11 != gv0Var2.r) {
                gv0Var2.s.p2(1);
            }
        }
    }
}
