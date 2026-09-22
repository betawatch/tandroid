package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ev0 extends org.telegram.ui.Components.x50 {
    public final /* synthetic */ fv0 d;

    public ev0(fv0 fv0Var) {
        this.d = fv0Var;
    }

    @Override // org.telegram.ui.Components.co0
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

    @Override // org.telegram.ui.Components.x50
    public final int i() {
        return Math.max(0, this.d.s.Z7 - 1);
    }

    @Override // org.telegram.ui.Components.x50
    public final int j() {
        return this.d.s.Y7;
    }

    @Override // org.telegram.ui.Components.x50
    public final void k(int i10) {
        int max;
        if (this.d.s.Z7 > 0 && (max = Math.max(0, Math.min(this.d.s.Z7 - 1, i10))) != this.d.s.Y7) {
            fv0 fv0Var = this.d;
            fv0Var.r = fv0Var.s.Y7;
            this.d.s.Y7 = max;
            this.d.s.R0();
            this.d.invalidate();
            int i11 = this.d.s.Y7;
            fv0 fv0Var2 = this.d;
            if (i11 != fv0Var2.r) {
                fv0Var2.s.o2(1);
            }
        }
    }
}
