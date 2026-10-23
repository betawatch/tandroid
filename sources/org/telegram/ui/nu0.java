package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
