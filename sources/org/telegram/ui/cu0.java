package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class cu0 extends org.telegram.ui.Components.g50 {
    public final /* synthetic */ du0 d;

    public cu0(du0 du0Var) {
        this.d = du0Var;
    }

    @Override // org.telegram.ui.Components.mn0
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

    @Override // org.telegram.ui.Components.g50
    public final int i() {
        return Math.max(0, this.d.s.U7 - 1);
    }

    @Override // org.telegram.ui.Components.g50
    public final int j() {
        return this.d.s.T7;
    }

    @Override // org.telegram.ui.Components.g50
    public final void k(int i9) {
        int max;
        if (this.d.s.U7 > 0 && (max = Math.max(0, Math.min(this.d.s.U7 - 1, i9))) != this.d.s.T7) {
            du0 du0Var = this.d;
            du0Var.r = du0Var.s.T7;
            this.d.s.T7 = max;
            this.d.s.R0();
            this.d.invalidate();
            int i10 = this.d.s.T7;
            du0 du0Var2 = this.d;
            if (i10 != du0Var2.r) {
                du0Var2.s.p2(1);
            }
        }
    }
}
