package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class rm0 extends ob {
    public int c;

    @Override // org.telegram.ui.Components.gb, org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        super.updateColors();
        try {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.vj);
            l9 l9Var = this.a;
            if (l9Var != null && themedColor != this.c) {
                this.c = themedColor;
                l9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
