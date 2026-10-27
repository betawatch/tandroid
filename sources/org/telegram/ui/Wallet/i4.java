package org.telegram.ui.Wallet;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class i4 extends org.telegram.ui.ActionBar.k3 {
    public i4(Activity activity, org.telegram.ui.ActionBar.u6 u6Var) {
        super(1, (Context) activity, u6Var, false);
        this.behindKeyboardColorKey = org.telegram.ui.ActionBar.y6.a7;
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.a7);
            setBackgroundColor(themedColor);
            if (this.navBarColor != themedColor) {
                fixNavigationBar(themedColor);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
