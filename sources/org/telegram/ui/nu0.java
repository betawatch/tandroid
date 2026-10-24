package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class nu0 extends org.telegram.ui.Components.t60 {
    public final /* synthetic */ ou0 d;

    public nu0(ou0 ou0Var) {
        this.d = ou0Var;
    }

    @Override // org.telegram.ui.Components.ep0
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

    @Override // org.telegram.ui.Components.t60
    public final int i() {
        return Math.max(0, this.d.s.Z7 - 1);
    }

    @Override // org.telegram.ui.Components.t60
    public final int j() {
        return this.d.s.Y7;
    }

    @Override // org.telegram.ui.Components.t60
    public final void k(int i10) {
        int max;
        if (this.d.s.Z7 > 0 && (max = Math.max(0, Math.min(this.d.s.Z7 - 1, i10))) != this.d.s.Y7) {
            ou0 ou0Var = this.d;
            ou0Var.r = ou0Var.s.Y7;
            this.d.s.Y7 = max;
            this.d.s.T0();
            this.d.invalidate();
            int i11 = this.d.s.Y7;
            ou0 ou0Var2 = this.d;
            if (i11 != ou0Var2.r) {
                ou0Var2.s.r2(1);
            }
        }
    }
}
