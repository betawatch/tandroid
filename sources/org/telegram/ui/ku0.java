package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ku0 extends org.telegram.ui.Components.y50 {
    public final /* synthetic */ lu0 d;

    public ku0(lu0 lu0Var) {
        this.d = lu0Var;
    }

    @Override // org.telegram.ui.Components.ho0
    public final CharSequence d() {
        StringBuilder sb = new StringBuilder();
        sb.append(LocaleController.getString("AccDescrVideoQuality", R.string.AccDescrVideoQuality));
        if (this.d.s.V7 > 0) {
            sb.append(", ");
            sb.append(this.d.s.U7 + 1);
            sb.append(" / ");
            sb.append(this.d.s.V7);
        }
        sb.append(", ");
        sb.append(this.d.h);
        sb.append(" – ");
        sb.append(this.d.n);
        return sb.toString();
    }

    @Override // org.telegram.ui.Components.y50
    public final int i() {
        return Math.max(0, this.d.s.V7 - 1);
    }

    @Override // org.telegram.ui.Components.y50
    public final int j() {
        return this.d.s.U7;
    }

    @Override // org.telegram.ui.Components.y50
    public final void k(int i10) {
        int max;
        if (this.d.s.V7 > 0 && (max = Math.max(0, Math.min(this.d.s.V7 - 1, i10))) != this.d.s.U7) {
            lu0 lu0Var = this.d;
            lu0Var.r = lu0Var.s.U7;
            this.d.s.U7 = max;
            this.d.s.R0();
            this.d.invalidate();
            int i11 = this.d.s.U7;
            lu0 lu0Var2 = this.d;
            if (i11 != lu0Var2.r) {
                lu0Var2.s.p2(1);
            }
        }
    }
}
