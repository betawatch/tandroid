package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ev0 extends org.telegram.ui.Components.i60 {
    public final /* synthetic */ fv0 d;

    public ev0(fv0 fv0Var) {
        this.d = fv0Var;
    }

    @Override // org.telegram.ui.Components.ro0
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

    @Override // org.telegram.ui.Components.i60
    public final int i() {
        return Math.max(0, this.d.s.Z7 - 1);
    }

    @Override // org.telegram.ui.Components.i60
    public final int j() {
        return this.d.s.Y7;
    }

    @Override // org.telegram.ui.Components.i60
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
