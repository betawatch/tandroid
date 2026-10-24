package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class mp0 extends cc {
    public int c;

    @Override // org.telegram.ui.Components.ub, org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        super.updateColors();
        try {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.Hi);
            w9 w9Var = this.a;
            if (w9Var != null && themedColor != this.c) {
                this.c = themedColor;
                w9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
