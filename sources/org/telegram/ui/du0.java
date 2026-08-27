package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class du0 extends org.telegram.ui.Components.l50 {
    public final /* synthetic */ eu0 d;

    public du0(eu0 eu0Var) {
        this.d = eu0Var;
    }

    @Override // org.telegram.ui.Components.nn0
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.getString("AccDescrVideoQuality", R.string.AccDescrVideoQuality));
        if (this.d.s.U7 > 0) {
            sb2.append(", ");
            sb2.append(this.d.s.T7 + 1);
            sb2.append(" / ");
            sb2.append(this.d.s.U7);
        }
        sb2.append(", ");
        sb2.append(this.d.h);
        sb2.append(" – ");
        sb2.append(this.d.n);
        return sb2.toString();
    }

    @Override // org.telegram.ui.Components.l50
    public final int i() {
        return Math.max(0, this.d.s.U7 - 1);
    }

    @Override // org.telegram.ui.Components.l50
    public final int j() {
        return this.d.s.T7;
    }

    @Override // org.telegram.ui.Components.l50
    public final void k(int i10) {
        int max;
        if (this.d.s.U7 > 0 && (max = Math.max(0, Math.min(this.d.s.U7 - 1, i10))) != this.d.s.T7) {
            eu0 eu0Var = this.d;
            eu0Var.r = eu0Var.s.T7;
            this.d.s.T7 = max;
            this.d.s.R0();
            this.d.invalidate();
            int i11 = this.d.s.T7;
            eu0 eu0Var2 = this.d;
            if (i11 != eu0Var2.r) {
                eu0Var2.s.p2(1);
            }
        }
    }
}
