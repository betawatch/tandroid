package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class sn0 extends ib {
    public int c;

    @Override // org.telegram.ui.Components.bb, org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        super.updateColors();
        try {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.vj);
            g9 g9Var = this.a;
            if (g9Var != null && themedColor != this.c) {
                this.c = themedColor;
                g9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
