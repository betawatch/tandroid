package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class vm0 extends jb {
    public int c;

    @Override // org.telegram.ui.Components.cb, org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        super.updateColors();
        try {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.yj);
            i9 i9Var = this.a;
            if (i9Var != null && themedColor != this.c) {
                this.c = themedColor;
                i9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
