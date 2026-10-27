package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class sp0 extends cc {
    public int c;

    @Override // org.telegram.ui.Components.ub, org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        super.updateColors();
        try {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.Hi);
            y9 y9Var = this.a;
            if (y9Var != null && themedColor != this.c) {
                this.c = themedColor;
                y9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
