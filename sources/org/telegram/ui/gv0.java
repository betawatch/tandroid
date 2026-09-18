package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class gv0 extends org.telegram.ui.Components.x50 {
    public final /* synthetic */ hv0 d;

    public gv0(hv0 hv0Var) {
        this.d = hv0Var;
    }

    @Override // org.telegram.ui.Components.do0
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
            hv0 hv0Var = this.d;
            hv0Var.r = hv0Var.s.Y7;
            this.d.s.Y7 = max;
            this.d.s.R0();
            this.d.invalidate();
            int i11 = this.d.s.Y7;
            hv0 hv0Var2 = this.d;
            if (i11 != hv0Var2.r) {
                hv0Var2.s.o2(1);
            }
        }
    }
}
